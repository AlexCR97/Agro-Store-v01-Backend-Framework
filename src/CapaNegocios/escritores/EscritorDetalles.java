package CapaNegocios.escritores;
import CapaEntidades.DetallesUsuario;

//imports CapaDatos.repositorios.RepositoriosDetalles;
public class EscritorDetalles extends Escritor<DetallesUsuario>{

    //private RepositorioDetallesUsuario repositorio = new RepositorioDetaller();
    public EscritorDetalles(int operacion, DetallesUsuario detallesUsuario) {
        super(operacion, detallesUsuario);
    }

    public EscritorDetalles(int operacion, DetallesUsuario detallesUsuario, DetallesUsuario entidadCambio) {
        super(operacion, detallesUsuario, entidadCambio);
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
