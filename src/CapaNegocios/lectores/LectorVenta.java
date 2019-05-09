package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioVenta;
import CapaEntidades.Venta;

import java.util.ArrayList;

public class LectorVenta extends Lector<Venta> {
    private  RepositorioVenta repositorio = new RepositorioVenta();
    @Override
    public Venta getEntidadId(Object id) {
        return repositorio.seleccionarId(id);

    }

    @Override
    public ArrayList<Venta> getEntidades() {
        return repositorio.seleccionarTodo();

    }
}
