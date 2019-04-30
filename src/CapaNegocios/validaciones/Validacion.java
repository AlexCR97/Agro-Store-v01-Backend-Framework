package CapaNegocios.validaciones;

public  abstract class   Validacion<Entidad> {
    protected Entidad entidad;

    public Validacion(Entidad entidad) {
        this.entidad = entidad;
    }
    public abstract boolean validar();
}
