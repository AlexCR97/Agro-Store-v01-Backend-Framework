package CapaNegocios.lectores;

import CapaEntidades.Empresa;

import java.util.ArrayList;

public class LectorEmpresa extends Lector<Empresa> {
    //private RepositorioEmpresa respositorio = new RepositorioEmpresa();
    @Override
    public Empresa getEntidadId(Object id) {

        //return repositorio.seleccionarId(id);
        return null;
    }

    @Override
    public ArrayList<Empresa> getEntidades() {
        //return repositorio.selecctionarTodo();
        return null;
    }
}
