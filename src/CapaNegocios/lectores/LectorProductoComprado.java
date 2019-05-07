package CapaNegocios.lectores;

import CapaEntidades.ProductoComprado;

import java.util.ArrayList;

public class LectorProductoComprado extends Lector<ProductoComprado> {
    @Override
    public ProductoComprado getEntidadId(Object id) {
        // return repositorio.selectionarId(id);
        return null;
    }

    @Override
    public ArrayList<ProductoComprado> getEntidades() {
        // return repositorio.selectionarTodo();
        return null;
    }
}
