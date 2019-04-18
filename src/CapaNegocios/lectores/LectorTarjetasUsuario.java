package CapaNegocios.lectores;

import CapaEntidades.TarjetasUsuario;

import java.util.ArrayList;

public class LectorTarjetasUsuario extends Lector<TarjetasUsuario> {
    //private RepositorioTarjetasUsuario repositorio = new RepositorioTarjetasUsuario();
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
}
