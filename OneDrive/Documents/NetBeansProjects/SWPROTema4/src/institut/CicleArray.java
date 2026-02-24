package institut;
/**
Copia la classe Cicle amb el nou nom CicleArray.

Afegeix un array d'objectes Modul com a atribut.

Modifica el constructor per que rebi un paràmetre amb el nombre de mòduls que tendrà com a màxim el cicle. Dins el constructor inicialitza l'array.

Crea un altre atribut numModuls que indiqui quants mòduls hem afegit al cicle. Inicialitza'l al constructor amb el valor adequat. Ha de tenir getter i setter?

Afegeix un mètode afegirModul que rebi com a paràmetre un objecte de tipus modul. Ha d'afegir el mòdul a l'array. Torna true si l'ha pogut afegir i false si no. 
* L'atribut numModuls ens pot servir per saber a quina posició insertar-lo.

Crea un mètode tornaModul que rebi com a paràmetre el nom d'un modul i torni el mòdul si es troba dins l'array de mòduls del cicle. Si no torna null. 
 * @author bypau
 */

public class CicleArray{
    
    //Atributs
    private String nom;
    private int nombreAlumnes;
    private final Modul[] moduls;  
    private int numModuls;
    int maxModuls;

    
    
    //Constructor 
    public CicleArray(String nom, int nombreAlumnes, int maxModuls){
        this.nom = nom;
        this.nombreAlumnes = nombreAlumnes;
        this.moduls = new Modul[maxModuls];
        this.numModuls = 0;
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
    
        public int getNumModuls() {
        return numModuls;
    }

    public void setNumModuls(int numModuls) {
        this.numModuls = numModuls;
    }
    
    // afegir un mòdul
    public boolean afegirModul(Modul modul) {
        if (numModuls < moduls.length) {  
            moduls[numModuls] = modul;
            numModuls++;
            return true;
        } else {
            return false; 
        }
    }

    // trobar un mòdul pel seu nom
    public Modul tornaModul(String nom) {
        for (int i = 0; i < numModuls; i++) {
            if (moduls[i].getNom().equalsIgnoreCase(nom)) {
                return moduls[i];
            }
        }
        return null; // no trobat
    }

    // toString
    @Override
    public String toString() {
        String info = "CicleArray{" +
                "nom='" + nom + '\'' +
                ", nombreAlumnes=" + nombreAlumnes +
                ", numModuls=" + numModuls +
                ", moduls=[";
        for (int i = 0; i < numModuls; i++) {
            info += moduls[i].getNom();
            if (i < numModuls - 1) info += ", ";
        }
        info += "]}";
        return info;
    }

    
}

