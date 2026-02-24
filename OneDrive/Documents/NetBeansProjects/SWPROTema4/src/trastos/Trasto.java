
package trastos;

/**
 * Crea una altre paquet amb una classe anomenada Trasto:

Ha de tenir un atribut de tipus String per el nom del trasto

Crea el constructor amb paràmetre per el nom i el getter.

Afegeix un atribut de classe de tipus int, amb els corresponents getter i setter.

Programa el toString de manera que mostri els dos atributs.

Crea una classe amb main i dins del main comprova que tens accés als getters i setters de l'atribut de classe sense crear cap objecte, directament amb la classe.

Dins del main crea tres objectes Trasto. Utilitza el setter per modificar el valor de l’atribut de classe des d'un dels objectes. 
* Utilitza el getter des d'un altre dels objectes per comprovar que realment comparteixen l'atribut.

 
 *
 * @author bypau
 */
public class Trasto {
    
    //Atributs
    private String nom;
    private static int contador;
    
    //Constructor
    
    public Trasto (String nom){
        this.nom = nom;
    }
    
    //Getter nom
    public String getNom(){
        return nom;
    }
    
   //Getter i setter atribut
    public static int getContador(){
        return contador;
    }
    
    public static void setContador(int contador){
        Trasto.contador = contador;
    }
    
  
    
    //ToString
    @Override
    public String toString(){
        return "Trasto{" +
                "nom='" + nom + '\'' +
                ", contador=" + contador +
                '}';
    }
    
    
}
