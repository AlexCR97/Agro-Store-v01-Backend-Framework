package CapaPresentacion;

/*
    Esta capa sera utilizada meramente para pruebas
*/

import CapaEntidades.Empresa;
import CapaNegocios.lectores.LectorEmpresa;
import CapaNegocios.validaciones.ValidacionEmpresa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Agro Store v0.1");
        System.out.println("Backend framework");

        
        //quise empezar a calar registrando una empresa
        Empresa e = new Empresa("miguel","xico 513","8311162864","gonzalez@gmail.com");
        ValidacionEmpresa validacion = new ValidacionEmpresa(e);
        boolean validado= validacion.validar();
        if(!validado)
            return;
        LectorEmpresa lector = new LectorEmpresa();
        ArrayList<Empresa> empresas= lector.getEntidades();
        for (Empresa i: empresas) {
            System.out.println(i);

        }
    }

}
