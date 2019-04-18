package CapaNegocios.validaciones;

import CapaEntidades.Usuario;

public class ValidacionUsuario extends Validacion<Usuario> {
    public ValidacionUsuario(Usuario usuario) {
        super(usuario);
    }

    @Override
    public boolean validar() {
        return false;
    }
}
