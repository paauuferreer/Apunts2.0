
package institut;

/**
 *4. Copia la classe Modul a Modul2. Modifica-la de manera que tengui un atribut tal que el seu tipus sigui la classe Cicle. 
 * Crea també els getters i setters i modifica el constructor de manera que pugui inicialitzar també aquest atribut..
 * Al main crea un objecte d'aquesta classe i mostra les seves dades.
 * @author bypau
 */
public class Modul2 {
    
        //Atributs
    private String nom;
    private int horesSetmanals;
    private Cicle tipus;
    
    //Constructor amb paràmetres
    public Modul2(String nom, int horesSetmanals, Cicle tipus){
        this.nom = nom;
        this.horesSetmanals = horesSetmanals;
        this.tipus = tipus;
    }
    
    //Getter i Setter Nom
    public String getNom(){
        return nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    //Getter i Setter horesSetmanals
    public int getHoresSetmanals(){
        return horesSetmanals;
    }
    
    public void setHoresSetmanals(int horesSetmanals){
        this.horesSetmanals = horesSetmanals;
    }
    
    //Getter i Setter Tipus
    
    public Cicle getTipus(){
        return tipus;
    }
    
    public void setTipus(Cicle tipus){
        this.tipus = tipus;
    }
    
    
    //Mètode toString
    @Override
    public String toString() {
    return "Modul2{" +
            "nom='" + nom + '\'' +
            ", horesSetmanals=" + horesSetmanals +
            ", tipus=" + tipus +
            '}';


}
    
    
}
