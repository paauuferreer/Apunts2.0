
package institut;
import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author bypau
 */
public class Cronometre {
    
    private Instant inici;
    private Instant fi;

    public void iniciar() {
        inici = Instant.now();
    }

    public void aturar() {
        fi = Instant.now();
    }

    public long getTempsNanosegons() {
        return Duration.between(inici, fi).toNanos();
    }
}

    

