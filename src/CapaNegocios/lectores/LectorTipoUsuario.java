package CapaNegocios.lectores;

import CapaEntidades.TipoUsuario;

import java.util.ArrayList;

public class LectorTipoUsuario extends Lector<TipoUsuario> {
    //repositorio
    @Override
    public TipoUsuario getEntidadId(Object id) {
        // return repositorio.selectionarId(id);
        return null;
    }

    @Override
    public ArrayList<TipoUsuario> getEntidades() {
        // return repositorio.selectionarTodo();
        return null;
    }
}
