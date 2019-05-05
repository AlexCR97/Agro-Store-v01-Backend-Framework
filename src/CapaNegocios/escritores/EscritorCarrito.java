package CapaNegocios.escritores;

import CapaEntidades.Carrito;

public class EscritorCarrito extends Escritor<Carrito> {
    //private RepositorioCarrito repositorio = new RepositorioCarrito();
    public EscritorCarrito(int operacion, Carrito carrito) {
        super(operacion, carrito);
    }

    public EscritorCarrito(int operacion, Carrito carrito, Carrito entidadCambio) {
        super(operacion, carrito, entidadCambio);
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
