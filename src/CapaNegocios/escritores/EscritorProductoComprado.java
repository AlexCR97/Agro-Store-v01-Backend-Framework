package CapaNegocios.escritores;

import CapaEntidades.ProductoComprado;

public class EscritorProductoComprado extends Escritor<ProductoComprado> {
    //private RepositorioProductoComprado repositorio = new RepositorioProductoComprado();
    public EscritorProductoComprado(int operacion, ProductoComprado productoComprado) {
        super(operacion, productoComprado);
    }

    public EscritorProductoComprado(int operacion, ProductoComprado productoComprado, ProductoComprado entidadCambio) {
        super(operacion, productoComprado, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
            //return repositorio.alta(entidad);
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
