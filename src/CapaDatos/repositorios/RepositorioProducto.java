package CapaDatos.repositorios;

import CapaDatos.contratos.IContrato;
import CapaEntidades.Producto;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.Bidi;
import java.util.ArrayList;

public class RepositorioProducto extends Repositorio implements IContrato<Producto> {

    public RepositorioProducto(){
        this.sqlAlta = "insert into Producto values (?, ?, ?, ?, ?, ?)";
        this.sqlBaja = "delete from Producto where IDProducto = ?";
        this.sqlCambio = "update Producto set " +
                "IDProducto = ?," +
                "Producto = ?, " +
                "PrecioTonelada = ?, " +
                "PrecioKilogramo = ?, " +
                "Foto = ?, " +
                "Temporada = ?, " +
                "IDCategoria = ? " +
                "where IDProducto = ?";
        this.sqlSeleccionarId = "select * from Producto where IDProducto = ?";
        this.sqlSeleccionarTodo = "select * from Producto";

    }
    @Override
    public boolean alta(Producto e) {
        parametros = new ArrayList<>();
        //parametros.add(e.getIdProducto());
        parametros.add(e.getProducto());
        parametros.add(e.getPrecioTonelada());
        parametros.add(e.getPrecioKilogramo());
        parametros.add(e.getFoto());
        parametros.add(e.getIdCategoria());
        return ejecutarConsulta(sqlAlta);
    }

    @Override
    public boolean baja(Object id) {
        parametros = new ArrayList<>();
        parametros.add(id);
        return ejecutarConsulta(sqlBaja);
    }

    @Override
    public boolean cambio(Object id, Producto e) {
        parametros = new ArrayList<>();
        parametros.add(e.getIdProducto());
        parametros.add(e.getProducto());
        parametros.add(e.getPrecioTonelada());
        parametros.add(e.getPrecioKilogramo());
        parametros.add(e.getFoto());
        parametros.add(e.getIdCategoria());
        parametros.add(id);
        return ejecutarConsulta(sqlAlta);
    }

    @Override
    public Producto seleccionarId(Object id) {
        parametros = new ArrayList<>();
        parametros.add(id);

        resultado = ejecutarLectura(sqlSeleccionarId);

        try {
            resultado.next();
            long IDProducto = resultado.getLong("IDProducto");
            String Producto = resultado.getString("Producto");
            BigDecimal precioTonelada= resultado.getBigDecimal("PrecioTonelada");
            BigDecimal precioKilogramo =resultado.getBigDecimal("PrecioKilogramo");
            byte[] foto = resultado.getBytes("Foto");
            boolean temporada= resultado.getBoolean("Temporada");
            int IDCategoria= resultado.getInt("IDCategoria");


            return new Producto(IDProducto,Producto,precioTonelada,foto,temporada,IDCategoria,precioKilogramo);
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
    public ArrayList<Producto> seleccionarTodo() {
        parametros = new ArrayList<>();

        resultado = ejecutarLectura(sqlSeleccionarTodo);
        ArrayList<Producto> productos = new ArrayList<>();

        try {
            while (resultado.next()) {
                long IDProducto = resultado.getLong("IDProducto");
                String Producto = resultado.getString("Producto");
                BigDecimal precioTonelada= resultado.getBigDecimal("PrecioTonelada");
                BigDecimal precioKilogramo =resultado.getBigDecimal("PrecioKilogramo");
                byte[] foto = resultado.getBytes("Foto");
                boolean temporada= resultado.getBoolean("Temporada");
                int IDCategoria= resultado.getInt("IDCategoria");
                productos.add(new Producto(IDProducto,Producto,precioTonelada,foto,temporada,IDCategoria,precioKilogramo));
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
        return productos;
    }
    }

