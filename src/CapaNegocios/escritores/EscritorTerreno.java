package CapaNegocios.escritores;

import CapaEntidades.Terreno;

public class EscritorTerreno extends  Escritor<Terreno> {
    //private RepositorioTerreno repositorio = new RepositorioTerreno();
    public EscritorTerreno(int operacion, Terreno terreno) {
        super(operacion, terreno);
    }

    public EscritorTerreno(int operacion, Terreno terreno, Terreno entidadCambio) {
        super(operacion, terreno, entidadCambio);
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
