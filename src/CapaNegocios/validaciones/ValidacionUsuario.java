package CapaNegocios.validaciones;

import CapaEntidades.Usuario;

public class ValidacionUsuario extends Validacion<Usuario> {
    /*    private String idUsuario;
    private String contraseñaUsuario;
    private int idTipo;
    private long idDetalles;
    private byte[] foto;
    private String correo;
*/
    public ValidacionUsuario(Usuario usuario) {
        super(usuario);
    }

    public boolean validarIdUsuario(){
        if (entidad.getIdUsuario().isEmpty())
            return false;
        return true ;
    }
    public boolean validarContrasenaUsuario(){
        if (entidad.getContraseñaUsuario().isEmpty())
            return false;
        return true ;
    }
    public boolean validarIdTipo(){
        if (entidad.getIdTipo()==0)
            return false;
        return true ;
    }
    public boolean validarIdDetalles(){
        if (entidad.getIdDetalles()==0)
            return false;
        return true ;
    }
    public boolean validarFoto(){
        if (entidad.getFoto().length==0)
            return false;
        return true ;
    }
    public boolean validarCorreo(){
        if (entidad.getCorreo().isEmpty())
            return false;
        return true ;
    }
    @Override
    public boolean validar() {
        return validarIdUsuario() && validarContrasenaUsuario() && validarIdTipo() && validarIdDetalles() && validarFoto() && validarCorreo();

    }
}
