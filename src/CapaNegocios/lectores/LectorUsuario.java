package CapaNegocios.lectores;

import CapaEntidades.Usuario;

import java.util.ArrayList;

public class LectorUsuario extends  Lector<Usuario> {
    //private RepositorioUsuario repositorio = new RepositorioUsuario();
    @Override
    public Usuario getEntidadId(Object id) {
        //return repositorio.seleccionarId(id);

        return null;
    }

    @Override
    public ArrayList<Usuario> getEntidades() {
        //return repositorio.seleccionarTodo();
        return null;
    }
}
