package CapaNegocios.lectores;

import CapaEntidades.Certificados;

import java.util.ArrayList;

public class LectorCertificados extends  Lector<Certificados> {
    //private RepositorioCertificados repositorio = new RepositorioCertificados();
    @Override
    public Certificados getEntidadId(Object id) {
        //return repositorio.seleccionarId(id);
        return null;
    }

    @Override
    public ArrayList<Certificados> getEntidades() {
        //return repositorio.seleccionarTodo();
        return null;
    }
}
