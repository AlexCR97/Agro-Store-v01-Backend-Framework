package CapaDatos.repositorios;

import CapaDatos.contratos.IContrato;
import CapaEntidades.Tarjetas;

import java.util.ArrayList;

public class RepositorioTarjetas extends Repositorio implements IContrato<Tarjetas> {
    public RepositorioTarjetas(){



    }
    @Override
    public boolean alta(Tarjetas e) {
        return false;
    }

    @Override
    public boolean baja(Object id) {
        return false;
    }

    @Override
    public boolean cambio(Object id, Tarjetas e) {
        return false;
    }

    @Override
    public Tarjetas seleccionarId(Object id) {
        return null;
    }

    @Override
    public ArrayList<Tarjetas> seleccionarTodo() {
        return null;
    }
}
