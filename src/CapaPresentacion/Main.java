package CapaPresentacion;

/*
    Esta capa sera utilizada meramente para pruebas
*/

import CapaDatos.conexiones.BaseDeDatos;

public class Main {

    public static void main(String[] args) {
        System.out.println("Agro Store v0.1");
        System.out.println("Backend framework");
        System.out.println("Acabo de hacer este nuevo cambio (miguel capa datos)");
        BaseDeDatos obj = new BaseDeDatos("localhost","AgroStore","miguelgm", "papasote21");
        obj.getConnection();
    }

}
