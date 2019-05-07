package CapaNegocios.lectores;

import CapaEntidades.CompraUsuario;

import java.util.ArrayList;

public class LectorCompraUsuario extends LectorRelacion<CompraUsuario> {

    @Override
    public ArrayList<CompraUsuario> getEntidadesId(Object id) {
        return null;
    }

    @Override
    public CompraUsuario getEntidadId(Object id) {
        // return repositorio.selectionarId(id);
        return null;
    }

    @Override
    public ArrayList<CompraUsuario> getEntidades() {
        // return repositorio.selectionarTodo();
        return null;
    }
}
