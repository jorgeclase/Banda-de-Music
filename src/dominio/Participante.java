public abstract class Participante {
    protected String nombre;
    public Participante(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public abstract String toString();
}
