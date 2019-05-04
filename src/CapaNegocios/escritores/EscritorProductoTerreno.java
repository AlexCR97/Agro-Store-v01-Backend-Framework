package CapaNegocios.escritores;

import CapaEntidades.ProductoTerreno;

public class EscritorProductoTerreno extends  EscritorRelacion<ProductoTerreno> {
    // private RepositorioProductoTerreno repositorio = new RepositorioProductoTerreno();
    public EscritorProductoTerreno(int operacion, ProductoTerreno productoTerreno) {
        super(operacion, productoTerreno);
    }

    public EscritorProductoTerreno(int operacion, ProductoTerreno productoTerreno, ProductoTerreno entidadCambio) {
        super(operacion, productoTerreno, entidadCambio);
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
