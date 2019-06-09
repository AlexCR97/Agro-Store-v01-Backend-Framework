package CapaEntidades;

public class ComentariosProductos {

    private long idComentarios;
    private int idProductoTerreno;

    public ComentariosProductos() {
    }

    public ComentariosProductos(long idComentarios, int idProductoTerreno) {
        this.idComentarios = idComentarios;
        this.idProductoTerreno = idProductoTerreno;
    }

    public long getIdComentarios() {
        return idComentarios;
    }

    public void setIdComentarios(long idComentarios) {
        this.idComentarios = idComentarios;
    }

    public int getIdProductoTerreno() {
        return idProductoTerreno;
    }

    public void setIdProductoTerreno(int idProductoTerreno) {
        this.idProductoTerreno = idProductoTerreno;
    }

    @Override
    public String toString() {
        return "ComentariosProductos{" +
                "idComentarios=" + idComentarios +
                ", idProductoTerreno=" + idProductoTerreno +
                '}';
    }
}
