package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioProducto;
import CapaEntidades.Producto;

import java.util.ArrayList;

public class LectorProducto extends Lector<Producto>{
    private RepositorioProducto repositorio = new RepositorioProducto();
    @Override
    public Producto getEntidadId(Object id) {
        return repositorio.seleccionarId(id);
    }

    @Override
    public ArrayList<Producto> getEntidades() {
        return repositorio.seleccionarTodo();

    }
}
