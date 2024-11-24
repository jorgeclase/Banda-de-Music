
import java.math.BigDecimal;
import java.time.LocalDate;
import dominio.*;

public class Principal {
    
    public static void main(String[] args) {
        Orquesta orq = new Orquesta("Orquesta Sinfónica de la Ciudad");
        Concierto conc1 = new Concierto(LocalDate.of(2024, 11, 24));
        orq.annadirConcierto(conc1); 
        Maestro maestro = new Maestro("Juan Pérez García");
        conc1.annadirParticipante(maestro);
        Instrumentista inst1 = new Instrumentista("Ana López", "Violín", 12345);
        conc1.annadirParticipante(inst1);

        Solista sol1 = new Solista("Carlos Díaz", "Piano", new BigDecimal("150.00"));
        conc1.annadirParticipante(sol1);
        Concierto conc2 = new Concierto(LocalDate.of(2028, 6, 21));
        orq.annadirConcierto(conc2); 
        conc2.annadirParticipante(maestro);
        conc2.annadirParticipante(inst1);
        Solista sol2 = new Solista("María Rodríguez", "Canto", new BigDecimal("180.00"));
        conc2.annadirParticipante(sol2);
        System.out.println(orq);
    }
}