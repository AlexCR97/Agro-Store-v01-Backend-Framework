package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioCompraUsuario;
import CapaEntidades.CompraUsuario;

import java.util.ArrayList;

public class LectorCompraUsuario extends LectorRelacion<CompraUsuario> {
    private  RepositorioCompraUsuario repositorio = new RepositorioCompraUsuario();
    //check meth
    @Override
    public ArrayList<CompraUsuario> getEntidadesId(Object id) {
        return null;
    }

    @Override
    public CompraUsuario getEntidadId(Object id) {
         //return repositorio.
        return null;

    }

    @Override
    public ArrayList<CompraUsuario> getEntidades() {
        // return repositorio.selectionarTodo();
        return null;
    }
}
