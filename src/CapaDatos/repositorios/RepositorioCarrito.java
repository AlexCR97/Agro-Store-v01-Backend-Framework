package CapaDatos.repositorios;

import CapaEntidades.Carrito;
import CapaDatos.contratos.IContrato;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;

public class RepositorioCarrito extends Repositorio implements IContrato<Carrito>{
    public RepositorioCarrito(){
        this.sqlAlta="insert into Carrito values (?)";
        this.sqlBaja="delete from Carrito where IDCarrito = ?";
        this.sqlCambio="update Carrito set "+
                "IDUsuario = ?" +
                "where IDCarrito = ?";
        this.sqlSeleccionarId="select * from Carrito where IDCarrito = ?";
        this.sqlSeleccionarTodo="select * from Carrito";

    }

    @Override
    public boolean alta(Carrito e) {
        parametros = new ArrayList<>();
       // parametros.add(e.getIdCar());
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
    public boolean cambio(Object id, Carrito e) {
        parametros= new ArrayList<>();
        parametros.add(e.getIdCar());
        parametros.add(e.getIdUsuario());
        parametros.add(id);
        return ejecutarConsulta(sqlCambio);
    }

    @Override
    public Carrito seleccionarId(Object id) {
        parametros = new ArrayList<>();
        parametros.add(id);

        resultado = ejecutarLectura(sqlSeleccionarId);

        try {
            resultado.next();

            int IDCarrito = resultado.getInt("IDCarrito");
            String IDUsuario = resultado.getString("IDUsuario");

            return new Carrito(IDCarrito,IDUsuario);
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
    public ArrayList<Carrito> seleccionarTodo() {
        parametros = new ArrayList<>();

        resultado = ejecutarLectura(sqlSeleccionarTodo);
        ArrayList<Carrito> carrito = new ArrayList<>();

        try {
            while (resultado.next()) {
                int IDCarrito = resultado.getInt("IDCarrito");
                String IDUsuario = resultado.getString("IDUsuario");
                carrito.add(new Carrito(IDCarrito,IDUsuario));
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
        return carrito;
    }
}
