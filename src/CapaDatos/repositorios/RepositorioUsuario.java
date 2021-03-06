package CapaDatos.repositorios;

import CapaDatos.contratos.IContrato;
import CapaEntidades.Usuario;

import java.sql.SQLException;
import java.util.ArrayList;

public class RepositorioUsuario extends Repositorio implements IContrato<Usuario> {

    public RepositorioUsuario(){
        this.sqlAlta = "insert into Usuario values (?, ?, ?, ?, ?)";
        this.sqlBaja = "delete from Usuario where IDUsuario = ?";
        this.sqlCambio = "update Usuario set " +
                "IDUsuario = ?, " +
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
        parametros.add(id);
        return ejecutarConsulta(sqlCambio);
    }

    @Override
    public Usuario seleccionarId(Object id) {
        parametros = new ArrayList<>();
        parametros.add(id);

        resultado = ejecutarLectura(sqlSeleccionarId);

        try {
            resultado.next();
            String idUsuario = resultado.getString("IDUsuario");
            byte[] foto = resultado.getBytes("Foto");
            int idtipo = resultado.getInt("IDTipo");
            long iddetalles= resultado.getLong("IDDetalles");
            String contraseña= resultado.getString("Contraseña");
            String correo = resultado.getString("Correo");
            return new Usuario(idUsuario,contraseña,idtipo,iddetalles,foto,correo);
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        finally {
            try { if (resultado != null) resultado.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (sentencia != null) sentencia.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (bd.getConexion() != null) bd.getConexion().close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }

    @Override
    public ArrayList<Usuario> seleccionarTodo() {
        parametros = new ArrayList<>();

        resultado = ejecutarLectura(sqlSeleccionarTodo);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            while (resultado.next()) {
                String idUsuario = resultado.getString("IDUsuario");
                byte[] foto = resultado.getBytes("Foto");
                int idtipo = resultado.getInt("IDTipo");
                long iddetalles= resultado.getLong("IDDetalles");
                String contraseña= resultado.getString("Contraseña");
                String correo = resultado.getString("Correo");
                usuarios.add(new Usuario(idUsuario,contraseña,idtipo,iddetalles,foto,correo));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        finally {
            try { if (resultado != null) resultado.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (sentencia != null) sentencia.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (bd.getConexion() != null) bd.getConexion().close(); } catch (SQLException e) { e.printStackTrace(); }
        }
        return usuarios;
    }
}
