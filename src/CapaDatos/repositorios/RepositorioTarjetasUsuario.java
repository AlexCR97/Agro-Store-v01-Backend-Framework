package CapaDatos.repositorios;

import CapaDatos.contratos.IContrato;
import CapaEntidades.TarjetasUsuario;

import java.util.ArrayList;

public class RepositorioTarjetasUsuario extends Repositorio implements IContrato<TarjetasUsuario> {

    public RepositorioTarjetasUsuario(){
        this.sqlAlta = "insert into TarjetasUsuario values (?, ?)";
        this.sqlBaja = "delete from TarjetasUsuario where numTarjeta = ?";
        this.sqlCambio = "update TarjetasUsuario set " +
                "idUsuario = ? " +
                "where numTarjeta = ?";
        this.sqlSeleccionarId = "select * from TarjetasUsuario where numTarjeta = ?";
        this.sqlSeleccionarTodo = "select * from TarjetasUsuario";

    }

    @Override
    public boolean alta(TarjetasUsuario e) {
        parametros= new ArrayList<>();
        parametros.add(e.getNumTarjeta());
        parametros.add(e.getIdUsuario());
        return ejecutarConsulta(sqlAlta);
    }

    @Override
    public boolean baja(Object id) {
        parametros = new ArrayList<>();
        parametros.add(id);
        return ejecutarConsulta(sqlBaja);
    }

    @Override
    public boolean cambio(Object id, TarjetasUsuario e) {
        parametros= new ArrayList<>();
        parametros.add(e.getNumTarjeta());
        parametros.add(e.getIdUsuario());
        return ejecutarConsulta(sqlCambio);
    }

    @Override
    public TarjetasUsuario seleccionarId(Object id) {
        return null;
    }

    @Override
    public ArrayList<TarjetasUsuario> seleccionarTodo() {
        return null;
    }
}
