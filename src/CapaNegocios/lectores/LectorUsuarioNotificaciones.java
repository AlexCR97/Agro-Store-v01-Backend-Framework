package CapaNegocios.lectores;

import CapaEntidades.UsuarioNotificaciones;

import java.util.ArrayList;

public class LectorUsuarioNotificaciones extends LectorRelacion<UsuarioNotificaciones> {
    //repositorio
    @Override
    public ArrayList<UsuarioNotificaciones> getEntidadesId(Object id) {
        return null;
    }

    @Override
    public UsuarioNotificaciones getEntidadId(Object id) {
        //repositorio.selecctionarId(id);
        return null;
    }

    @Override
    public ArrayList<UsuarioNotificaciones> getEntidades() {
        // return repositorio.selectionarTodo();
        return null;
    }
}
