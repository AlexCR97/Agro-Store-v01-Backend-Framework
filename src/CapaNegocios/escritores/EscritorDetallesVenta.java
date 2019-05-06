package CapaNegocios.escritores;

import CapaEntidades.DetalleVenta;

public class EscritorDetallesVenta extends Escritor<DetalleVenta> {
    //private RepositorioDetalleVenta repositorio = new RepositorioDetallesVenta();
    public EscritorDetallesVenta(int operacion, DetalleVenta detalleVenta) {
        super(operacion, detalleVenta);
    }

    public EscritorDetallesVenta(int operacion, DetalleVenta detalleVenta, DetalleVenta entidadCambio) {
        super(operacion, detalleVenta, entidadCambio);
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
