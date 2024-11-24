


public class MusicoSocio extends Musico {
    private int numeroSocio;
    public MusicoSocio(String nombre, String instrumento, int numeroSocio) {
        super(nombre, instrumento);
        this.numeroSocio = numeroSocio;
    }
    @Override
    public String toString() {
        return nombre + ", " + instrumento + ", número de socio: " + numeroSocio;
    }
}
