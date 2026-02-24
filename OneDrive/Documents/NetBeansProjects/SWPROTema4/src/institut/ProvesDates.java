
package institut;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author bypau
 */
public class ProvesDates {
    
    void main() {

        // Data avui
        LocalDate avui = LocalDate.now();
        IO.println("Data avui: " + avui);

        // Hora actual
        LocalTime ara = LocalTime.now();
        IO.println("Hora actual: " + ara);

        // Data i hora actual
        LocalDateTime araTot = LocalDateTime.now();
        IO.println("Data i hora actual: " + araTot);

        // 6 gener 2034
        LocalDate reis = LocalDate.of(2034, 1, 6);
        IO.println("6 gener 2034: " + reis);

        // Hora final classe (exemple)
        LocalTime fiClasse = LocalTime.of(14, 30);
        IO.println("Fi classe: " + fiClasse);

        // Instant + 12 minuts
        Instant instant = Instant.now();
        Instant mes12 = instant.plus(12, ChronoUnit.MINUTES);
        IO.println("Instant +12 min: " + mes12);

        // Format personalitzat
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        IO.println("Format personalitzat: " + araTot.format(formatter));

        // Dies viscuts (canvia la teva data de naixement)
        LocalDate naixement = LocalDate.of(2007, 8, 15);
        long diesViscuts = ChronoUnit.DAYS.between(naixement, avui);
        IO.println("Dies viscuts: " + diesViscuts);
    }
}

    

