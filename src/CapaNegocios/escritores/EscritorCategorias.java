package CapaNegocios.escritores;

import CapaEntidades.Categorias;

public class EscritorCategorias extends  Escritor<Categorias> {
    //private RepositorioCategorias repositorio = new RepositorioCategorias();
    public EscritorCategorias(int operacion, Categorias categorias) {
        super(operacion, categorias);
    }

    public EscritorCategorias(int operacion, Categorias categorias, Categorias entidadCambio) {
        super(operacion, categorias, entidadCambio);
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
