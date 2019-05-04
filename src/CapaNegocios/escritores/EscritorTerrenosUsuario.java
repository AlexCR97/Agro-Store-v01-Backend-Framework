package CapaNegocios.escritores;

import CapaEntidades.TerrenosUsuario;

public class EscritorTerrenosUsuario extends EscritorRelacion<TerrenosUsuario> {
    //private RepositorioTerrenosUsuario repo= new RepositorioTerrenosUsuario();
    public EscritorTerrenosUsuario(int operacion, TerrenosUsuario terrenosUsuario) {
        super(operacion, terrenosUsuario);
    }

    public EscritorTerrenosUsuario(int operacion, TerrenosUsuario terrenosUsuario, TerrenosUsuario entidadCambio) {
        super(operacion, terrenosUsuario, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
            //repositorio.alta(entidad);
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
