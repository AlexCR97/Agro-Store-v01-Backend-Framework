package CapaNegocios.escritores;

import CapaDatos.repositorios.RepositorioTerrenosUsuario;
import CapaEntidades.TerrenosUsuario;

public class EscritorTerrenosUsuario extends EscritorRelacion<TerrenosUsuario> {
    //check id
    private RepositorioTerrenosUsuario repositorio= new RepositorioTerrenosUsuario();
    public EscritorTerrenosUsuario(int operacion, TerrenosUsuario terrenosUsuario) {
        super(operacion, terrenosUsuario);
    }

    public EscritorTerrenosUsuario(int operacion, TerrenosUsuario terrenosUsuario, TerrenosUsuario entidadCambio) {
        super(operacion, terrenosUsuario, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
            repositorio.alta(entidad);


        if (operacion == OPERACION_BAJA)
            return repositorio.baja(entidad.getIdTerreno());

        if (operacion == OPERACION_CAMBIO)
            return repositorio.cambio(entidad.getIdTerreno(),entidadCambio);



        return false;

    }
}
