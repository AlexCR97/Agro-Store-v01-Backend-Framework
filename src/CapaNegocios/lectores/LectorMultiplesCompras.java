package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioMultiplesCompras;
import CapaEntidades.MultiplesCompras;

import java.util.ArrayList;

public class LectorMultiplesCompras extends  Lector<MultiplesCompras> {
    private  RepositorioMultiplesCompras repositorio = new RepositorioMultiplesCompras();
    @Override
    public MultiplesCompras getEntidadId(Object id) {
        return repositorio.seleccionarId(id);

    }

    @Override
    public ArrayList<MultiplesCompras> getEntidades() {
        return repositorio.seleccionarTodo();

    }
}
