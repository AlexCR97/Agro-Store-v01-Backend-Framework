package CapaNegocios.validaciones;

import CapaEntidades.Tarjetas;

public class ValidacionTarjetas extends Validacion<Tarjetas>  {
    public ValidacionTarjetas(Tarjetas tarjetas) {
        super(tarjetas);
    }

    @Override
    public boolean validar() {
        return false;
    }
}
