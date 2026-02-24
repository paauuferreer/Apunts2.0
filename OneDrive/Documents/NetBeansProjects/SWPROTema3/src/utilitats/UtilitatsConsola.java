/** Exercici 7

*Fins ara cada vegada que volem llegir un sencer o un double del teclat hem hagut de crear un mètode al mateix fitxer. Volem que sigui més fàcil reutilitzar el codi. 
* Ho farem de la següent manera:

*Crea el paquet utilitats. Dins el paquet crea la classe UtilitatsConsola amb les següents característiques:

*No tendrà main.

*Tendra un mètode public static llegirSencer que tornarà un int. Tendrà un paràmetre de tipus String que serà el text que es mostrarà a l'usuari per que sàpiga quina dada es demana.

*Tendra un mètode public static llegirDouble que tornarà un double. Basau-vos en el mètode anterior.

*Tendra un mètode public static llegirCadena que tornarà un String. 

* Tendrà un paràmetre també de tipus String que serà el text que es mostrarà a l'usuari per que sàpiga quina dada es demana.

* A partir d'ara utilitzau aquesta classe quan necessiteu llegir dades de teclat. Per fer-ho haureu de fer dues passes:

*Importar la classe al principi del fitxer.

* import utilitats.UtilitatsConsola;

* En voler utilitzar un dels mètodes heu de posar el nom de la classe abans del del mètode:

* int quantitatNotes = UtilitatsConsola.llegirSencer("Nombre de notes: ");

* @author Pau Ferrer

*/

package utilitats;

import java.util.Scanner;

public class UtilitatsConsola {

    public static int llegirSencer(String missatge) {
        Scanner sc = new Scanner(System.in);
        IO.print(missatge);
        return sc.nextInt();
    }
    
    public static double llegirDouble(String missatge) {
        Scanner sc = new Scanner(System.in);
        IO.print(missatge);
        return sc.nextDouble();
    }

    public static String llegirCadena(String missatge) {
        Scanner sc = new Scanner(System.in);
        IO.print(missatge);
        return sc.nextLine();
    }
    
    public static void mostrarArray(int[] array) {

    IO.print("[");

    for (int i = 0; i < array.length; i++) {
        IO.print(array[i]);

        if (i < array.length - 1) {
            IO.print(", ");
        }
    }

    IO.println("]");
}
    
    public static void mostrarArray(boolean[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        if (i < array.length - 1) System.out.print(", ");
    }
    System.out.println("]");
}

public static void mostrarArray(double[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        if (i < array.length - 1) System.out.print(", ");
    }
    System.out.println("]");
}

public static void mostrarArray(String[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        if (i < array.length - 1) System.out.print(", ");
    }
    System.out.println("]");
}


}
