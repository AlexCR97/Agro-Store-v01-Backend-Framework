package CapaNegocios.escritores;

import CapaEntidades.Tarjetas;

public class EscritorTarjeta extends  Escritor<Tarjetas> {
    public EscritorTarjeta(int operacion, Tarjetas tarjetas) {
        super(operacion, tarjetas);
    }

    public EscritorTarjeta(int operacion, Tarjetas tarjetas, Tarjetas entidadCambio) {
        super(operacion, tarjetas, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
            return false;


        return false;
    }


}
