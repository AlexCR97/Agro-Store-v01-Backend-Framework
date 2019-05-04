package CapaNegocios.escritores;

import CapaEntidades.UsuarioCertificado;

public class EscritorUsuarioCertificado extends EscritorRelacion<UsuarioCertificado> {
    //private RepositorioUsuarioCertificado repositorio = new RepositorioUsuarioCertificado();

    public EscritorUsuarioCertificado(int operacion, UsuarioCertificado usuarioCertificado) {
        super(operacion, usuarioCertificado);
    }

    public EscritorUsuarioCertificado(int operacion, UsuarioCertificado usuarioCertificado, UsuarioCertificado entidadCambio) {
        super(operacion, usuarioCertificado, entidadCambio);
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
