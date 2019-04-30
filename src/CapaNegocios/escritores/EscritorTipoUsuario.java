package CapaNegocios.escritores;

import CapaEntidades.Usuario;

public class EscritorTipoUsuario extends Escritor<Usuario> {
    public EscritorTipoUsuario(int operacion, Usuario usuario) {
        super(operacion, usuario);
    }

    public EscritorTipoUsuario(int operacion, Usuario usuario, Usuario entidadCambio) {
        super(operacion, usuario, entidadCambio);
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