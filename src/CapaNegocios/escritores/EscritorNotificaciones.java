package CapaNegocios.escritores;

import CapaEntidades.Notificaciones;

public class EscritorNotificaciones extends Escritor<Notificaciones> {
    //private RepositorioNotificaciones repositorio = new RepositorioNotificaciones();
    public EscritorNotificaciones(int operacion, Notificaciones notificaciones) {
        super(operacion, notificaciones);
    }

    public EscritorNotificaciones(int operacion, Notificaciones notificaciones, Notificaciones entidadCambio) {
        super(operacion, notificaciones, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
            //repositorio.alta(entidad);
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
