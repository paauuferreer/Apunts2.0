package institut;
/**
2.Crea una classe que representi el Cicle:

*Crea els atributs nom i nombreAlumnes.

*Genera tots els getters i setters. Ho pots fer amb les utilitats que proporciona l'IDE.

*Crea un constructor amb paràmetres per inicialitzar tots els atributs.

*Amb l'ajuda de l'IDE genera el mètode toString.
 
 * @author bypau
 */

public class Cicle{
    
    //Atributs
    private String nom;
    private int nombreAlumnes;
    
    //Constructor 
    public Cicle(String nom, int nombreAlumnes){
        this.nom = nom;
        this.nombreAlumnes = nombreAlumnes;
    }
    
    //Getter i Setter Nom
    public String getNom(){
        return nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    //Getter i Setter horesSetmanals
    public int getNombreAlumnes(){
        return nombreAlumnes;
    }
    
    public void setNombreAlumnes(int nombreAlumnes){
        this.nombreAlumnes = nombreAlumnes;
    }
    
    //Mètode toString
    @Override
    public String toString() {
    return "Cicle{" +
            "nom='" + nom + '\'' +
            ", nombreAlumnes=" + nombreAlumnes +
            '}';
}
    
    
}

