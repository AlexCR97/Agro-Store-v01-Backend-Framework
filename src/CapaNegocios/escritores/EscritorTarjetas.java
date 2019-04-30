package CapaNegocios.escritores;

import CapaEntidades.Tarjetas;

public class EscritorTarjetas extends  Escritor<Tarjetas> {
    //private RepositorioTarjetas repositorio = new RepositorioTarjetas();
    public EscritorTarjetas(int operacion, Tarjetas tarjetas) {
        super(operacion, tarjetas);

    }

    public EscritorTarjetas(int operacion, Tarjetas tarjetas, Tarjetas entidadCambio) {
        super(operacion, tarjetas, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
            // return  repositorio.
            return false;
        if (operacion == OPERACION_BAJA)
            return false;
        if  (operacion == OPERACION_CAMBIO)
            return  false;


        return false;
    }


}
