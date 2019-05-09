package CapaNegocios.escritores;

import CapaDatos.repositorios.RepositorioTarjetas;
import CapaEntidades.Tarjetas;

public class EscritorTarjetas extends  Escritor<Tarjetas> {
    //checar id
    private RepositorioTarjetas repositorio = new RepositorioTarjetas();
    public EscritorTarjetas(int operacion, Tarjetas tarjetas) {
        super(operacion, tarjetas);

    }

    public EscritorTarjetas(int operacion, Tarjetas tarjetas, Tarjetas entidadCambio) {
        super(operacion, tarjetas, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
             return  repositorio.alta(entidad);

        if (operacion == OPERACION_BAJA)
            return repositorio.baja(entidad.getNumTarjeta());

        if  (operacion == OPERACION_CAMBIO)
            return  repositorio.cambio(entidad.getNumTarjeta(),entidadCambio);


        return false;
    }


}
