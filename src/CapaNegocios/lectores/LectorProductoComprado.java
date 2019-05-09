package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioProductoCompra;
import CapaEntidades.ProductoComprado;

import java.util.ArrayList;

public class LectorProductoComprado extends Lector<ProductoComprado> {
    private  RepositorioProductoCompra repositorio = new RepositorioProductoCompra();
    @Override
    public ProductoComprado getEntidadId(Object id) {
        //return repositorio.
        return null;
    }

    @Override
    public ArrayList<ProductoComprado> getEntidades() {
        // return repositorio.selectionarTodo();
        return null;
    }
}
