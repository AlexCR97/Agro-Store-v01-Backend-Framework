package CapaNegocios.escritores;

import CapaEntidades.UsuarioNotificaciones;

public class EscritorUsuarioNotificaciones extends  EscritorRelacion<UsuarioNotificaciones> {
    //private RepositorioUsuarioNotificaciones repositorio = new RepositorioUsuarioNotificaciones();

    public EscritorUsuarioNotificaciones(int operacion, UsuarioNotificaciones usuarioNotificaciones) {
        super(operacion, usuarioNotificaciones);
    }

    public EscritorUsuarioNotificaciones(int operacion, UsuarioNotificaciones usuarioNotificaciones, UsuarioNotificaciones entidadCambio) {
        super(operacion, usuarioNotificaciones, entidadCambio);
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
