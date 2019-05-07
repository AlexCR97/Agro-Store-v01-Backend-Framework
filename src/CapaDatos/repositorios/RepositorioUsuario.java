package CapaDatos.repositorios;

import CapaDatos.contratos.IContrato;
import CapaEntidades.Usuario;

import java.util.ArrayList;

public class RepositorioUsuario extends Repositorio implements IContrato<Usuario> {

    public RepositorioUsuario(){
        this.sqlAlta = "insert into Usuario values (?, ?, ?, ?, ?)";
        this.sqlBaja = "delete from Usuario where IDUsuario = ?";
        this.sqlCambio = "update Usuario set " +
                "Contraseña = ?, " +
                "IDTipo = ?, " +
                "IDDetalles = ?, " +
                "Foto = ?, " +
                "Correo = ? " +
                "where IDUsuario = ?";
        this.sqlSeleccionarId = "select * from Usuario where IDUsuario = ?";
        this.sqlSeleccionarTodo = "select * from Usuario";


    }
    @Override
    public boolean alta(Usuario e) {
        parametros = new ArrayList<>();
        parametros.add(e.getIdUsuario());
        parametros.add(e.getContraseñaUsuario());
        parametros.add(e.getIdTipo());
        parametros.add(e.getIdDetalles());
        parametros.add(e.getFoto());
        parametros.add(e.getCorreo());
        return ejecutarConsulta(sqlAlta);

    }

    @Override
    public boolean baja(Object id) {
        parametros = new ArrayList<>();
        parametros.add(id);
        return ejecutarConsulta(sqlBaja);
    }

    @Override
    public boolean cambio(Object id, Usuario e) {
        parametros = new ArrayList<>();
        parametros.add(e.getIdUsuario());
        parametros.add(e.getContraseñaUsuario());
        parametros.add(e.getIdTipo());
        parametros.add(e.getIdDetalles());
        parametros.add(e.getFoto());
        parametros.add(e.getCorreo());
        return ejecutarConsulta(sqlCambio);
    }

    @Override
    public Usuario seleccionarId(Object id) {
        return null;
    }

    @Override
    public ArrayList<Usuario> seleccionarTodo() {
        return null;
    }
}
