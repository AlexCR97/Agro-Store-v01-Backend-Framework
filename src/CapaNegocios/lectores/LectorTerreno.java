package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioTerreno;
import CapaEntidades.Terreno;

import java.util.ArrayList;

public class LectorTerreno extends Lector<Terreno> {
    private  RepositorioTerreno repositorio = new RepositorioTerreno();
    @Override
    public Terreno getEntidadId(Object id) {
        return    repositorio.seleccionarId(id);
    }

    @Override
    public ArrayList<Terreno> getEntidades() {
        return repositorio.seleccionarTodo();
    }
}
