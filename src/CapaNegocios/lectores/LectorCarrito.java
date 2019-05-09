package CapaNegocios.lectores;

import CapaDatos.repositorios.Repositorio;
import CapaDatos.repositorios.RepositorioCarrito;
import CapaEntidades.Carrito;

import java.util.ArrayList;

public class LectorCarrito extends Lector<Carrito> {
    private RepositorioCarrito repositorio = new RepositorioCarrito();
    @Override
    public Carrito getEntidadId(Object id) {
        return repositorio.seleccionarId(id);

    }

    @Override
    public ArrayList<Carrito> getEntidades() {
        return repositorio.seleccionarTodo();

    }
}
