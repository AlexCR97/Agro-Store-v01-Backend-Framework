package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioDetalleVenta;
import CapaEntidades.DetalleVenta;

import java.util.ArrayList;

public class LectorDetallesVenta extends Lector<DetalleVenta> {
    private  RepositorioDetalleVenta repositorio = new RepositorioDetalleVenta();


    @Override
    public DetalleVenta getEntidadId(Object id) {
        return repositorio.seleccionarId(id);
    }

    @Override
    public ArrayList<DetalleVenta> getEntidades() {
        return  repositorio.seleccionarTodo();
    }
}
