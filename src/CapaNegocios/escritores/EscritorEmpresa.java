package CapaNegocios.escritores;

import CapaDatos.repositorios.RepositorioEmpresa;
import CapaEntidades.Empresa;

public class EscritorEmpresa extends  Escritor<Empresa> {

    private RepositorioEmpresa repositorio = new RepositorioEmpresa();

    public EscritorEmpresa(int operacion, Empresa empresa) {
        super(operacion, empresa);
    }

    public EscritorEmpresa(int operacion, Empresa empresa, Empresa entidadCambio) {
        super(operacion, empresa, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {


        if (operacion == OPERACION_ALTA)
            return repositorio.alta(entidad);

        if (operacion == OPERACION_BAJA)
            return repositorio.baja(entidad.getIdEmpresa());

        if (operacion == OPERACION_CAMBIO)
            return repositorio.cambio(entidad.getIdEmpresa(),entidadCambio);



        return false;
    }
}
