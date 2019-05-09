package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioCertificados;
import CapaEntidades.Certificados;

import java.util.ArrayList;

public class LectorCertificados extends  Lector<Certificados> {
    private RepositorioCertificados repositorio = new RepositorioCertificados();
    @Override
    public Certificados getEntidadId(Object id) {
        return repositorio.seleccionarId(id);

    }

    @Override
    public ArrayList<Certificados> getEntidades() {
        return repositorio.seleccionarTodo();

    }
}
