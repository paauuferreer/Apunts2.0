package institut;

/**
 * 1. Crea una classe que representi un Modul(assignatura) d'uns estudis.

*Defineix com a atributs el nom i les horesSetmanals.

*Genera tots els getters i setters. Ho pots fer amb les utilitats que proporciona l'IDE.

*Crea un constructor amb paràmetres per inicialitzar tots els atributs.

*Amb l'ajuda de l'IDE genera el mètode toString
 
 * @author bypau
 */

  
public class Modul {

    // Variable de classe per portar el recompte
    private static int comptador = 0;

    // Atributs
    private final int id;
    private String nom;
    private int horesSetmanals;

    // Constructor
    public Modul(String nom, int horesSetmanals){
        comptador++;
        this.id = comptador;
        this.nom = nom;
        this.horesSetmanals = horesSetmanals;
    }

    // Mètode de classe
    public static int getComptador() {
        return comptador;
    }

    // Getters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public int getHoresSetmanals() { return horesSetmanals; }

    // Setters
    public void setNom(String nom) { this.nom = nom; }
    public void setHoresSetmanals(int horesSetmanals) { this.horesSetmanals = horesSetmanals; }

    @Override
    public String toString() {
        return "Modul{id=" + id +
                ", nom='" + nom + '\'' +
                ", horesSetmanals=" + horesSetmanals +
                '}';
    }
}
