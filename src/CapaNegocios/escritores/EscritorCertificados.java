package CapaNegocios.escritores;

import CapaEntidades.Certificados;

public class EscritorCertificados extends Escritor<Certificados> {
    //private RepositorioCertificados repositorio = new RepositorioCertificados();
    public EscritorCertificados(int operacion, Certificados certificados) {
        super(operacion, certificados);
    }

    public EscritorCertificados(int operacion, Certificados certificados, Certificados entidadCambio) {
        super(operacion, certificados, entidadCambio);
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
