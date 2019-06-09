package CapaEntidades;

import java.math.BigDecimal;

public class ProductoTerreno {
    private long idNumProduc;
    private long idProducto;
    private long idTerreno;
    private java.math.BigDecimal precio;
    private int hectareas;
    private String descripcion;

    public ProductoTerreno() {
    }

    public ProductoTerreno(long idProducto, long idTerreno, BigDecimal precio, int hectareas, String descripcion) {
        this.idProducto = idProducto;
        this.idTerreno = idTerreno;
        this.precio = precio;
        this.hectareas = hectareas;
        this.descripcion = descripcion;
    }

    public ProductoTerreno(long idNumProduc, long idProducto, long idTerreno, BigDecimal precio, int hectareas, String descripcion) {
        this.idNumProduc = idNumProduc;
        this.idProducto = idProducto;
        this.idTerreno = idTerreno;
        this.precio = precio;
        this.hectareas = hectareas;
        this.descripcion = descripcion;
    }

    public long getIdNumProduc() {
        return idNumProduc;
    }

    public void setIdNumProduc(long idNumProduc) {
        this.idNumProduc = idNumProduc;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public long getIdTerreno() {
        return idTerreno;
    }

    public void setIdTerreno(long idTerreno) {
        this.idTerreno = idTerreno;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getHectareas() {
        return hectareas;
    }

    public void setHectareas(int hectareas) {
        this.hectareas = hectareas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ProductoTerreno{" +
                "idNumProduc=" + idNumProduc +
                ", idProducto=" + idProducto +
                ", idTerreno=" + idTerreno +
                ", precio=" + precio +
                ", hectareas=" + hectareas +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
