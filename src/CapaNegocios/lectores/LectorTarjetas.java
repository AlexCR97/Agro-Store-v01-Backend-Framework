package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioRelacion;
import CapaDatos.repositorios.RepositorioTarjetas;
import CapaEntidades.Tarjetas;
import java.util.ArrayList;
public  class LectorTarjetas extends Lector<Tarjetas> {
    private RepositorioTarjetas repositorio = new RepositorioTarjetas();
    @Override
    public Tarjetas getEntidadId(Object id) {
        return repositorio.seleccionarId(id);
    }

    @Override
    public ArrayList<Tarjetas> getEntidades() {
        return repositorio.seleccionarTodo();

    }




}
