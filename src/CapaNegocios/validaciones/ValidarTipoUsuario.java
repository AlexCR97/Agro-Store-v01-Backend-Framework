package CapaNegocios.validaciones;

import CapaEntidades.TipoUsuario;

public class ValidarTipoUsuario extends  Validacion<TipoUsuario> {
    /*    private int idTipo;
    private String tipoUsuario;*/

    public boolean validarIdTipo(){
        if (entidad.getIdTipo()==0)
            return false;
        return  true;
    }
    public boolean validarTipoUsuario(){
        if (entidad.getTipoUsuario().isEmpty())
            return false;
        return true ;
    }
    public ValidarTipoUsuario(TipoUsuario tipoUsuario) {
        super(tipoUsuario);
    }

    @Override
    public boolean validar() {
        return validarIdTipo() && validarTipoUsuario();
    }

}
