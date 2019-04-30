package CapaNegocios.lectores;
import CapaEntidades.Detalles;
import java.util.ArrayList;
//import CapaDatos.repositorios.RepositorioProfesor
public class LectorDetalles extends Lector<Detalles> {
    //private RepositorioDetalles repositorio = new RepositorioDetalles();
    @Override
    public Detalles getEntidadId(Object id) {
        //return repositorio.seleccionarId(id);
        return null;
    }

    @Override
    public ArrayList<Detalles> getEntidades() {
        //return repositorio.seleccionarTodo();
        return null;
    }
}
