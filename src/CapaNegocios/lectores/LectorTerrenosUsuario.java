package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioTerrenosUsuario;
import CapaEntidades.TerrenosUsuario;

import java.util.ArrayList;

public class LectorTerrenosUsuario extends LectorRelacion<TerrenosUsuario> {
    private RepositorioTerrenosUsuario repositorio = new RepositorioTerrenosUsuario();
    @Override
    public ArrayList<TerrenosUsuario> getEntidadesId(Object id) {
        return null;
    }

    @Override
    public TerrenosUsuario getEntidadId(Object id) {
        return repositorio.seleccionarId(id);
    }

    @Override
    public ArrayList<TerrenosUsuario> getEntidades()
    {
        return repositorio.seleccionarTodo();
    }
}
