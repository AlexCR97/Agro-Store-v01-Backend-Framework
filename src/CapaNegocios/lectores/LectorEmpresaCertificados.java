package CapaNegocios.lectores;

import CapaDatos.repositorios.RepositorioEmpresaCertificados;
import CapaEntidades.EmpresaCertificados;
import java.util.ArrayList;

public class LectorEmpresaCertificados extends LectorRelacion<EmpresaCertificados> {
    private RepositorioEmpresaCertificados repositorio= new RepositorioEmpresaCertificados();
    @Override
    public EmpresaCertificados getEntidadId(Object id) {
        return repositorio.seleccionarId(id);
    }

    @Override
    public ArrayList<EmpresaCertificados> getEntidades() {
        return repositorio.seleccionarTodo();

    }

    @Override
    public ArrayList<EmpresaCertificados> getEntidadesId(Object id) {
        return null;
    }
}
