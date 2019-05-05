package CapaNegocios.lectores;

import CapaEntidades.Venta;

import java.util.ArrayList;

public class LectorVenta extends Lector<Venta> {
    @Override
    public Venta getEntidadId(Object id) {
        //return repositorio.selectionarId(id);
        return null;
    }

    @Override
    public ArrayList<Venta> getEntidades() {
        //return repositorio.selectionarTodo();
        return null;
    }
}
