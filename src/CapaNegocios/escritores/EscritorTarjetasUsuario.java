package CapaNegocios.escritores;

import CapaDatos.repositorios.RepositorioTarjetasUsuario;
import CapaEntidades.TarjetasUsuario;

public class EscritorTarjetasUsuario extends EscritorRelacion<TarjetasUsuario> {
    //checar id
    private RepositorioTarjetasUsuario repositorio = new RepositorioTarjetasUsuario();

    public EscritorTarjetasUsuario(int operacion, TarjetasUsuario tarjetasUsuario) {
        super(operacion, tarjetasUsuario);
    }

    public EscritorTarjetasUsuario(int operacion, TarjetasUsuario tarjetasUsuario, TarjetasUsuario entidadCambio) {
        super(operacion, tarjetasUsuario, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
            repositorio.alta(entidad);


        if (operacion == OPERACION_BAJA)
            return repositorio.baja(entidad.getIdUsuario());

        if (operacion == OPERACION_CAMBIO)
            return repositorio.cambio(entidad.getIdUsuario(),entidadCambio);



        return false;

    }

}
