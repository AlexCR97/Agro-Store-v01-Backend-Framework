package CapaNegocios.escritores;

import CapaEntidades.MultiplesCompras;

public class EscritorMultiplesCompras extends Escritor<MultiplesCompras> {
    //private RepositorioMultiplesCompras repositorio = new RepositorioMultiplesCompras();
    public EscritorMultiplesCompras(int operacion, MultiplesCompras multiplesCompras) {
        super(operacion, multiplesCompras);
    }

    public EscritorMultiplesCompras(int operacion, MultiplesCompras multiplesCompras, MultiplesCompras entidadCambio) {
        super(operacion, multiplesCompras, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
            //repositorio.alta(entidad);
            return false;

        if (operacion == OPERACION_BAJA)
            //return repositorio.baja(entidad.getIdDetalles());
            return false;
        if (operacion == OPERACION_CAMBIO)
            //return repositorio.cambio(entidad,entidadCambio);
            return false;


        return false;
    }
}
