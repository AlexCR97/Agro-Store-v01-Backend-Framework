package CapaNegocios.lectores;

import CapaEntidades.TarjetasUsuario;

import java.util.ArrayList;

public class LectorTarjetasUsuario extends LectorRelacion<TarjetasUsuario> {
    @Override
    public ArrayList<TarjetasUsuario> getEntidadesId(Object id) {
        return null;
    }

    @Override
    public TarjetasUsuario getEntidadId(Object id) {
        //return repositorio.seleccionarId(id);
        return null;
    }

    @Override
    public ArrayList<TarjetasUsuario> getEntidades() {
        //return repositorio.seleccionarTodo();
        return null;
    }
    //private RepositorioTarjetasUsuario repositorio = new RepositorioTarjetasUsuario();

}
