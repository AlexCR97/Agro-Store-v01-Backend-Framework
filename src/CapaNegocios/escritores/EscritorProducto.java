package CapaNegocios.escritores;

import CapaDatos.repositorios.RepositorioProducto;
import CapaEntidades.Producto;

public class EscritorProducto extends Escritor<Producto> {
    private RepositorioProducto repositorio = new RepositorioProducto();
    public EscritorProducto(int operacion, Producto producto) {
        super(operacion, producto);
    }

    public EscritorProducto(int operacion, Producto producto, Producto entidadCambio) {
        super(operacion, producto, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
            repositorio.alta(entidad);


        if (operacion == OPERACION_BAJA)
            return repositorio.baja(entidad.getIdProducto());

        if (operacion == OPERACION_CAMBIO)
            return repositorio.cambio(entidad.getIdProducto(),entidadCambio);



        return false;
    }
}
