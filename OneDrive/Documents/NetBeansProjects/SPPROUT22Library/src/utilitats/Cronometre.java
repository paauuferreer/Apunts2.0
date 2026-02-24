
package utilitats;

/**
 *
 * @author bypau
 *//** Cronòmetre. calcula el temps transcorregut entre que s'execute start i stop.
 * El mètode temps torna el resultat.
 * Per utilitar-lo
 *      1. Ccrea un objecte d'aquesta classe, Cronometre c= new Cronometre();
 *      2. Crida el mètode start, c.start();
 *      3. Executa el codi a cronometrar,
 *      4. Crida el mètode stop,
 *      %. Crida el mètode temps per obtenir el resultat. println(c.temps());
 *
 * @author joan
 */
public class Cronometre {

    private long inici;
    private long fi;
    private boolean enMarxa;

    /**
     * Inicialitza el cronòmetre
     */
    public Cronometre() {
        inici = 0;
        fi = 0;
        enMarxa = false;
    }

    //Guarda l'instant de temps inicial
    public void start() {
        if (!enMarxa) {
            inici = System.nanoTime();//.currentTimeMillis();
            enMarxa = true;
        }
    }

    //Guarada l'estat de temps final
    public void stop() {
        if (enMarxa) {
            fi = System.nanoTime();//.currentTimeMillis();
            enMarxa = false;
        }
    }

    //Calcula la diferència de temps, en nanosegons.
    public long temps() {
        return fi - inici;
    }
}

