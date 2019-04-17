package CapaNegocios.validaciones;

import CapaEntidades.Detalles;

public class ValidacionDetalles extends Validacion <Detalles> {

    public ValidacionDetalles(Detalles detalles) {
        super(detalles);
    }

    /*    private long idDetalles;
    private String calle;
    private String colonia;
    private String cuidad;
    private String estado;
    private String pais;
    private int cp;
    private String escrituraOPermiso;
    private double estrellas;
    private String rfc;
    private String firmaElectronica;
    private String nombres;
    private String apellidos;

      */

    public boolean validarId(){
        return  true;
    }
    public boolean validarCalle(){
        return true;
    }
    public boolean validarCiudad(){
        return true;
    }
    public boolean validarColonia(){
        return true;
    }
    public boolean validarPais(){
        return true;
    }
    public boolean validarEstado(){
        return true;
    }
    public boolean validarCp(){
        return true;
    }
    public boolean validarEscrituraOPermiso(){
        return true;
    }


    @Override
    public boolean validar() {
        return validarCalle() && validarCp() && validarEscrituraOPermiso();

        //return false;
    }



}
