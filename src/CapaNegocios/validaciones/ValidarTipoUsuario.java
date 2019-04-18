package CapaNegocios.validaciones;

import CapaEntidades.TipoUsuario;

public class ValidarTipoUsuario extends  Validacion<TipoUsuario> {
    public ValidarTipoUsuario(TipoUsuario tipoUsuario) {
        super(tipoUsuario);
    }

    @Override
    public boolean validar() {
        return false;
    }

}
