package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioRelacion;
import CapaEntidades.Tarjetas;
import java.util.ArrayList;
public  class LectorTarjetas extends Lector<Tarjetas> {
    //private RepositorioTarjetas repositorio = new RepositorioTarjetas();
    @Override
    public Tarjetas getEntidadId(Object id) {
        //return repositorio.SeleccionId(id);
        return null;
    }

    @Override
    public ArrayList<Tarjetas> getEntidades() {
        //return repositorio.SeleccionarTodo();
        return null;
    }




}
