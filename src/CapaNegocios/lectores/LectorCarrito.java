package CapaNegocios.lectores;

import CapaEntidades.Carrito;

import java.util.ArrayList;

public class LectorCarrito extends Lector<Carrito> {
    @Override
    public Carrito getEntidadId(Object id) {
        //return repositorio.selectionarId(id);
        return null;
    }

    @Override
    public ArrayList<Carrito> getEntidades() {
        //return repositorio.selectionarTodo();
        return null;
    }
}
