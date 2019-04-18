package CapaNegocios.validaciones;

import CapaEntidades.TarjetasUsuario;

public class ValidacionTarjetasUsuario extends Validacion<TarjetasUsuario> {
    public ValidacionTarjetasUsuario(TarjetasUsuario tarjetasUsuario) {
        super(tarjetasUsuario);
    }

    @Override
    public boolean validar() {
        return false;
    }
}
