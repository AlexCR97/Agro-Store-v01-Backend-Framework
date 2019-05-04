package CapaNegocios.lectores;

import CapaEntidades.Categorias;

import java.util.ArrayList;

public class LectorCategorias extends Lector<Categorias> {
    //repositorio
    @Override
    public Categorias getEntidadId(Object id) {
        // return repositorio.selectionarId(id);
        return null;
    }

    @Override
    public ArrayList<Categorias> getEntidades() {
        // return repositorio.selectionarTodo();
        return null;
    }
}
