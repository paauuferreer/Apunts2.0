
public class Cronometre {

    private long inici;
    private long fi;
    private boolean enMarxa;

    
    public Cronometre() {
        inici = 0;
        fi = 0;
        enMarxa = false;
    }

    public void start() {
        if (!enMarxa) {
            inici = System.nanoTime();
            enMarxa = true;
        }
    }

    public void stop() {
        if (enMarxa) {
            fi = System.nanoTime();
            enMarxa = false;
        }
    }

    public long temps() {
        return fi - inici;
    }
}
