package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioTipoUsuario;
import CapaDatos.repositorios.RepositorioUsuario;
import CapaEntidades.TipoUsuario;

import java.util.ArrayList;

public class LectorTipoUsuario extends Lector<TipoUsuario> {
    private RepositorioTipoUsuario repositorio = new RepositorioTipoUsuario();

    @Override
    public TipoUsuario getEntidadId(Object id) {
        return repositorio.seleccionarId(id);
    }

    @Override
    public ArrayList<TipoUsuario> getEntidades() {
        return repositorio.seleccionarTodo();
    }
}