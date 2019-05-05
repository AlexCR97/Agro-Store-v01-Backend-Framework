package CapaNegocios.escritores;

import CapaEntidades.Venta;

public class EscritorVenta extends Escritor<Venta> {
    public EscritorVenta(int operacion, Venta venta) {
        super(operacion, venta);
    }

    public EscritorVenta(int operacion, Venta venta, Venta entidadCambio) {
        super(operacion, venta, entidadCambio);
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
