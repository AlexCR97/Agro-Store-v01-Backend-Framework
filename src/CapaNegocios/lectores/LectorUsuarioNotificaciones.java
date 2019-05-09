package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioNotificaciones;
import CapaDatos.repositorios.RepositorioUsuarioNotificaciones;
import CapaEntidades.UsuarioNotificaciones;

import java.util.ArrayList;

public class LectorUsuarioNotificaciones extends LectorRelacion<UsuarioNotificaciones> {
    private RepositorioUsuarioNotificaciones repositorio = new RepositorioUsuarioNotificaciones();

    @Override
    public ArrayList<UsuarioNotificaciones> getEntidadesId(Object id) {
        return null;
    }

    @Override
    public UsuarioNotificaciones getEntidadId(Object id) {
        return  repositorio.seleccionarId(id);


    }

    @Override
    public ArrayList<UsuarioNotificaciones> getEntidades() {
        return repositorio.seleccionarTodo();

    }
}
