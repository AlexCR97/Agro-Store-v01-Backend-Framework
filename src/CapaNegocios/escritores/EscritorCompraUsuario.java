package CapaNegocios.escritores;

import CapaEntidades.CompraUsuario;

public class EscritorCompraUsuario extends EscritorRelacion<CompraUsuario> {
    //private ReprositorioCompraUsuario respositorio = new RepositoioCompraUsuario();
    public EscritorCompraUsuario(int operacion, CompraUsuario compraUsuario) {
        super(operacion, compraUsuario);
    }

    public EscritorCompraUsuario(int operacion, CompraUsuario compraUsuario, CompraUsuario entidadCambio) {
        super(operacion, compraUsuario, entidadCambio);
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
