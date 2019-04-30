package CapaNegocios.validaciones;

import CapaEntidades.Certificados;

public class ValidacionCertificados extends Validacion<Certificados> {

    public ValidacionCertificados(Certificados certificados) {
        super(certificados);
    }

    /*
             private int idCertificados;
        private String nombre;
        private java.sql.Timestamp vigencia;
        private String tituloCertificado;
        private java.sql.Timestamp fechaExpedido;
        private byte[] sello;
         */
    public boolean validarIdCertificados(){
        if (entidad.getIdCertificados()==0)
                return false;
        return true;
    }
    public boolean validarNombre(){
        if (entidad.getNombre().isEmpty())
            return false;
        return true;
    }
    public boolean validarVigencia(){

        return true;
    }
    public boolean validarTituloCertificado(){
        if (entidad.getTituloCertificado().isEmpty())
            return false;
        return true;

    }
    public boolean validarFechaExpedido(){

        return true;
    }
    public boolean validarSello(){
        if (entidad.getSello().length ==0)
            return false;
        return true;
    }
    @Override
    public boolean validar() {
        return validarIdCertificados() && validarNombre() && validarVigencia() && validarTituloCertificado() && validarFechaExpedido() && validarSello();
    }




}
