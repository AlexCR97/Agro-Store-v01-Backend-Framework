package CapaNegocios.escritores;

import CapaEntidades.Empresa;

public class EscritorEmpresa extends  Escritor<Empresa> {
    //private RepositorioEmpresa repositorio = new RepositorioEmpresa();

    public EscritorEmpresa(int operacion, Empresa empresa) {
        super(operacion, empresa);
    }

    public EscritorEmpresa(int operacion, Empresa empresa, Empresa entidadCambio) {
        super(operacion, empresa, entidadCambio);
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
