package CapaNegocios.lectores;

import CapaEntidades.UsuarioCertificado;

import java.util.ArrayList;

public class LectorUsuarioCertificado extends LectorRelacion<UsuarioCertificado> {
    //private RepositorioUsuarioCertificado repositorio= new RepositorioUsuarioCertificado();

    @Override
    public UsuarioCertificado getEntidadId(Object id) {
        //return repositorio.seleccionarId(id);


        return null;
    }

    @Override
    public ArrayList<UsuarioCertificado> getEntidades() {
        //return repositorio.seleccionarTodo();
        return null;
    }

    @Override
    public ArrayList<UsuarioCertificado> getEntidadesId(Object id) {
        return null;
    }
}
