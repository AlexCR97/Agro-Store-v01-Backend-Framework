package CapaNegocios.escritores;

import CapaEntidades.Producto;

public class EscritorProducto extends Escritor<Producto> {
    //private RepositorioProducto repositorio = new RepositorioProducto();
    public EscritorProducto(int operacion, Producto producto) {
        super(operacion, producto);
    }

    public EscritorProducto(int operacion, Producto producto, Producto entidadCambio) {
        super(operacion, producto, entidadCambio);
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
