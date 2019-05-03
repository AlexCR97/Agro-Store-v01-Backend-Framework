package CapaNegocios.validaciones;

import CapaEntidades.Categorias;
import CapaEntidades.Certificados;
import CapaNegocios.lectores.Lector;

import java.util.ArrayList;

public class ValidacionCategorias extends Validacion<Categorias> {


    public ValidacionCategorias(Categorias categorias) {
        super(categorias);
    }

    public boolean validarIdCategoria(){
        if (entidad.getIdCategoria()==0)
            return false;
        return true;
    }
    public boolean validarNombre(){
        if (entidad.getNombre().isEmpty())
            return false;
        return true;
    }
    @Override
    public boolean validar() {
        return validarIdCategoria() && validarNombre();
    }
}
