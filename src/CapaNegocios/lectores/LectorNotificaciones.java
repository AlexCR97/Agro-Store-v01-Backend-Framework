package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioNotificaciones;
import CapaEntidades.Notificaciones;

import java.util.ArrayList;

public class LectorNotificaciones extends Lector<Notificaciones> {
     private RepositorioNotificaciones repositorio = new RepositorioNotificaciones();
    @Override
    public Notificaciones getEntidadId(Object id) {
        return repositorio.seleccionarId(id);
    }

    @Override
    public ArrayList<Notificaciones> getEntidades() {
         return repositorio.seleccionarTodo();

    }
}
