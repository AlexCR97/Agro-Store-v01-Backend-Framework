package CapaNegocios.lectores;
import CapaEntidades.DetallesUsuario;

import java.util.ArrayList;
//import CapaDatos.repositorios.RepositorioProfesor
public class LectorDetalles extends Lector<DetallesUsuario> {
    //private RepositorioDetallesUsuario repositorio = new RepositorioDetallesUsuario();
    @Override
    public DetallesUsuario getEntidadId(Object id) {
        //return repositorio.seleccionarId(id);
        return null;
    }

    @Override
    public ArrayList<DetallesUsuario> getEntidades() {
        //return repositorio.seleccionarTodo();
        return null;
    }
}
