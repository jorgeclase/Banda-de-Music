package dominio;
import java.math.BigDecimal;

public class MusicoRefuerzo extends Musico {
    private BigDecimal pago;
    public MusicoRefuerzo(String nombre, String instrumento, BigDecimal pago) {
        super(nombre, instrumento);
        this.pago = pago;
    }
    @Override
    public String toString() {
        return nombre + ", " + instrumento + ", " + pago + " €";
    }
}