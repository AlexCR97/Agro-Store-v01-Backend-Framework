package CapaEntidades;

import java.sql.Date;

public class Comentarios {

    private long idComentarios;
    private String idUsuario;
    private String comentario;
    private java.sql.Date fecha;
    private String respuesta;

    public Comentarios() {
    }

    public Comentarios(String idUsuario, String comentario, Date fecha, String respuesta) {
        this.idUsuario = idUsuario;
        this.comentario = comentario;
        this.fecha = fecha;
        this.respuesta = respuesta;
    }

    public Comentarios(long idComentarios, String idUsuario, String comentario, Date fecha, String respuesta) {
        this.idComentarios = idComentarios;
        this.idUsuario = idUsuario;
        this.comentario = comentario;
        this.fecha = fecha;
        this.respuesta = respuesta;
    }

    public long getIdComentarios() {
        return idComentarios;
    }

    public void setIdComentarios(long idComentarios) {
        this.idComentarios = idComentarios;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Comentarios{" +
                "idComentarios=" + idComentarios +
                ", idUsuario='" + idUsuario + '\'' +
                ", comentario='" + comentario + '\'' +
                ", fecha=" + fecha +
                ", respuesta='" + respuesta + '\'' +
                '}';
    }
}
