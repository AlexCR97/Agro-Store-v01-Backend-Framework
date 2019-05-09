package CapaNegocios.lectores;
import CapaDatos.repositorios.RepositorioDetallesUsuario;
import CapaEntidades.DetallesUsuario;

import java.util.ArrayList;
public class LectorDetalles extends Lector<DetallesUsuario> {
    private RepositorioDetallesUsuario repositorio = new RepositorioDetallesUsuario();
    @Override
    public DetallesUsuario getEntidadId(Object id) {
        return repositorio.seleccionarId(id);

    }

    @Override
    public ArrayList<DetallesUsuario> getEntidades() {
        return repositorio.seleccionarTodo();

    }
}
