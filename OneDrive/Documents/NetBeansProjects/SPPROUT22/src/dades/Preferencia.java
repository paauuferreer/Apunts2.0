
package dades;

/**
 *
 * @author bypau
 */
public class Preferencia {
    int ordre;
    String nom;

    public Preferencia(int ordre, String nom) {
        this.ordre = ordre;
        this.nom = nom;
    }

    public int getOrdre() {
        return ordre;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Preferencia{" +
                "ordre=" + ordre +
                ", nom='" + nom + '\'' +
                '}';
    }
}

