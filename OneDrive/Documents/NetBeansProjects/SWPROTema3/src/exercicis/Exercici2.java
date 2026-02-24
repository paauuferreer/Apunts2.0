/** Exercici 2

*Copia l'exercici anterior i modifica'l de la següent manera:

*Afegeix un mètode que llegeixi el nom de la persona del teclat, crida’l des del main,

*Posa el nom que torna el mètode dins una variable.

*Passa aquest nom al mètode simpatic.

* @author Pau Ferrer

*/
import java.util.Scanner;

  void main() {
      
      String nom = llegirNom(); 
     
      simpatic(nom);
    }
   String llegirNom() {
        Scanner sc = new Scanner(System.in);
        IO.println("Introdueix el teu nom: ");
        String nom = sc.nextLine();
        return nom;
    }

  void simpatic(String nom) {
        IO.println("Hola, " + nom + "! Encantat de saludar-te.");
    }


