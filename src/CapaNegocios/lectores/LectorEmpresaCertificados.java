package CapaNegocios.lectores;

import CapaEntidades.EmpresaCertificados;

import java.util.ArrayList;

public class LectorEmpresaCertificados extends Lector<EmpresaCertificados> {
    //private RepositorioEmpresaCertificados repositorio= new RepositorioEmpresaCertificados();
    @Override
    public EmpresaCertificados getEntidadId(Object id) {
        //return repositorio.seleccionarId(id);
        return null;
    }

    @Override
    public ArrayList<EmpresaCertificados> getEntidades() {
        // return repositorio.selectionarTodo();
        return null;
    }
}
