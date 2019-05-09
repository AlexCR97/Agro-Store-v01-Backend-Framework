package CapaNegocios.escritores;

import CapaDatos.repositorios.RepositorioCertificados;
import CapaEntidades.Certificados;

public class EscritorCertificados extends Escritor<Certificados> {
    private RepositorioCertificados repositorio = new RepositorioCertificados();
    public EscritorCertificados(int operacion, Certificados certificados) {
        super(operacion, certificados);
    }

    public EscritorCertificados(int operacion, Certificados certificados, Certificados entidadCambio) {
        super(operacion, certificados, entidadCambio);
    }

    @Override
    public boolean ejecutarCambios() {
        if (operacion == OPERACION_ALTA)
            repositorio.alta(entidad);


        if (operacion == OPERACION_BAJA)
            return repositorio.baja(entidad.getIdCertificados());

        if (operacion == OPERACION_CAMBIO)
            return repositorio.cambio(entidad.getIdCertificados(),entidadCambio);

        return false;

    }
}
