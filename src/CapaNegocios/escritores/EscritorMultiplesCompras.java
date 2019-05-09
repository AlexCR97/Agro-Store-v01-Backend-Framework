package CapaNegocios.escritores;

import CapaDatos.repositorios.RepositorioMultiplesCompras;
import CapaEntidades.MultiplesCompras;

public class EscritorMultiplesCompras extends Escritor<MultiplesCompras> {
    private RepositorioMultiplesCompras repositorio = new RepositorioMultiplesCompras();
    public EscritorMultiplesCompras(int operacion, MultiplesCompras multiplesCompras) {
        super(operacion, multiplesCompras);
    }

    public EscritorMultiplesCompras(int operacion, MultiplesCompras multiplesCompras, MultiplesCompras entidadCambio) {
        super(operacion, multiplesCompras, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
            repositorio.alta(entidad);


        if (operacion == OPERACION_BAJA)
            return repositorio.baja(entidad.getIdNumProducto());

        if (operacion == OPERACION_CAMBIO)
            return repositorio.cambio(entidad.getIdNumProducto(),entidadCambio);



        return false;
    }
}
