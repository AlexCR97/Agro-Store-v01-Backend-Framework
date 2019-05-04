package CapaNegocios.lectores;

import CapaEntidades.Notificaciones;

import java.util.ArrayList;

public class LectorNotificaciones extends Lector<Notificaciones> {
    // private RepositorioNotificaciones repositorio = new RepositorioNotificaciones();
    @Override
    public Notificaciones getEntidadId(Object id) {
    //repositorio.seleccionarId(id);
        return null;
    }

    @Override
    public ArrayList<Notificaciones> getEntidades() {
        // return repositorio.selectionarTodo();
        return null;
    }
}
