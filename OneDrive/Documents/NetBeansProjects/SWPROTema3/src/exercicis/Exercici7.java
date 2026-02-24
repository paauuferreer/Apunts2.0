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

import utilitats.UtilitatsConsola;


    void main() {

        int edat = UtilitatsConsola.llegirSencer("Introdueix la teva edat: ");
        double altura = UtilitatsConsola.llegirDouble("Introdueix la teva altura (en metres): ");
        String nom = UtilitatsConsola.llegirCadena("Introdueix el teu nom: ");

        IO.println("---------- RESULTAT ----------");
        IO.println("Nom: " + nom);
        IO.println("Edat: " + edat);
        IO.println("Altura: " + altura);
    }

