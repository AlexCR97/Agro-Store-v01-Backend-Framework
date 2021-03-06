package CapaNegocios.escritores;

import CapaDatos.repositorios.RepositorioProductoTerreno;
import CapaEntidades.ProductoTerreno;

public class EscritorProductoTerreno extends  EscritorRelacion<ProductoTerreno> {
    //checar id
    private RepositorioProductoTerreno repositorio = new RepositorioProductoTerreno();
    public EscritorProductoTerreno(int operacion, ProductoTerreno productoTerreno) {
        super(operacion, productoTerreno);
    }

    public EscritorProductoTerreno(int operacion, ProductoTerreno productoTerreno, ProductoTerreno entidadCambio) {
        super(operacion, productoTerreno, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
            repositorio.alta(entidad);


        if (operacion == OPERACION_BAJA)
            return repositorio.baja(entidad.getIdTerreno());

        if (operacion == OPERACION_CAMBIO)
            return repositorio.cambio(entidad.getIdTerreno(),entidadCambio);



        return false;

    }



}
