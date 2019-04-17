package CapaNegocios.escritores;
import CapaEntidades.Detalles;
//imports CapaDatos.repositorios.RepositoriosDetalles;
public class EscritorDetalles extends Escritor<Detalles>{

    //private RepositorioDetalles repositorio = new RepositorioDetaller();
    public EscritorDetalles(int operacion, Detalles detalles) {
        super(operacion, detalles);
    }

    public EscritorDetalles(int operacion, Detalles detalles, Detalles entidadCambio) {
        super(operacion, detalles, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
            //return repositorio.alta(entidad);
            return false;

        if (operacion == OPERACION_BAJA)
            //return repositorio.baja(entidad.getIdDetalles());
            return false;
        if (operacion == OPERACION_CAMBIO)
            //return repositorio.cambio(entidad,entidadCambio);
            return false;


        return false;
    }
}
