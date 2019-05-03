package CapaNegocios.escritores;

import CapaEntidades.EmpresaCertificados;

public class EscritorEmpresaCertificados extends EscritorRelacion<EmpresaCertificados> {
    //private RepositorioEmpresaCertificados repositorio = new RepositorioEmpresaCertificados();
    public EscritorEmpresaCertificados(int operacion, EmpresaCertificados empresaCertificados) {
        super(operacion, empresaCertificados);
    }

    public EscritorEmpresaCertificados(int operacion, EmpresaCertificados empresaCertificados, EmpresaCertificados entidadCambio) {
        super(operacion, empresaCertificados, entidadCambio);
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
