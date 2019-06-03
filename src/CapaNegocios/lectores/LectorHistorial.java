package CapaNegocios.lectores;

import CapaDatos.repositorios.Repositorio;
import CapaDatos.repositorios.RepositorioHistorial;
import CapaEntidades.Historial;

import java.util.ArrayList;

public class LectorHistorial extends Lector<Historial> {
    private RepositorioHistorial repositorio = new RepositorioHistorial();
    @Override
    public Historial getEntidadId(Object id) {
        return repositorio.seleccionarId(id);
    }

    @Override
    public ArrayList<Historial> getEntidades() {
        return repositorio.seleccionarTodo();
    }
}
