package CapaNegocios.escritores;

import CapaDatos.repositorios.RepositorioCategorias;
import CapaEntidades.Categorias;

public class EscritorCategorias extends  Escritor<Categorias> {
    private RepositorioCategorias repositorio = new RepositorioCategorias();
    public EscritorCategorias(int operacion, Categorias categorias) {
        super(operacion, categorias);
    }

    public EscritorCategorias(int operacion, Categorias categorias, Categorias entidadCambio) {
        super(operacion, categorias, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
            return repositorio.alta(entidad);


        if (operacion == OPERACION_BAJA)
            return repositorio.baja(entidad.getIdCategoria());

        if (operacion == OPERACION_CAMBIO)
            return repositorio.cambio(entidad.getIdCategoria(),entidadCambio);



        return false;

    }
}
