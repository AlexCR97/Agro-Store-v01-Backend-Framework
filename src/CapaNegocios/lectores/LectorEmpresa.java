package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioEmpresa;
import CapaEntidades.Empresa;

import java.util.ArrayList;

public class LectorEmpresa extends Lector<Empresa> {
    private RepositorioEmpresa repositorio = new RepositorioEmpresa();
    @Override
    public Empresa getEntidadId(Object id) {
        return repositorio.seleccionarId(id);

    }

    @Override
    public ArrayList<Empresa> getEntidades() {
        return repositorio.seleccionarTodo();
    }
}
