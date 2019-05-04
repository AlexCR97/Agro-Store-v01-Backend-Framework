package CapaNegocios.lectores;

import CapaEntidades.Producto;

import java.util.ArrayList;

public class LectorProducto extends Lector<Producto>{
    //private RepositorioProducto repositorio = new RepositorioProducto();
    @Override
    public Producto getEntidadId(Object id) {
        //repositorio.seleccionarId(id);
        return null;
    }

    @Override
    public ArrayList<Producto> getEntidades() {
        //repositorio.selecctionarTodo();
        return null;
    }
}
