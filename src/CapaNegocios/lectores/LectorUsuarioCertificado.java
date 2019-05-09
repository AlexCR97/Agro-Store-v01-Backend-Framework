package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioUsuarioCertificado;
import CapaEntidades.UsuarioCertificado;

import java.util.ArrayList;

public class LectorUsuarioCertificado extends LectorRelacion<UsuarioCertificado> {
    private RepositorioUsuarioCertificado repositorio= new RepositorioUsuarioCertificado();

    @Override
    public UsuarioCertificado getEntidadId(Object id) {
        return repositorio.seleccionarId(id);



    }

    @Override
    public ArrayList<UsuarioCertificado> getEntidades() {
        return repositorio.seleccionarTodo();

    }

    @Override
    public ArrayList<UsuarioCertificado> getEntidadesId(Object id) {
        return null;
    }
}
