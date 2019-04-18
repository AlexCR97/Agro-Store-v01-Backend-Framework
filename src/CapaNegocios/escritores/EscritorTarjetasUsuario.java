package CapaNegocios.escritores;

import CapaEntidades.TarjetasUsuario;

public class EscritorTarjetasUsuario extends Escritor<TarjetasUsuario> {
    //private RepositorioTarjetasUsuario repositorio = new RepositorioTarjetasUsuario();
    public EscritorTarjetasUsuario(int operacion, TarjetasUsuario tarjetasUsuario) {
        super(operacion, tarjetasUsuario);
    }

    public EscritorTarjetasUsuario(int operacion, TarjetasUsuario tarjetasUsuario, TarjetasUsuario entidadCambio) {
        super(operacion, tarjetasUsuario, entidadCambio);
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
