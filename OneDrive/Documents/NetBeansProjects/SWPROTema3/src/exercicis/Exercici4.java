/** Exercici 4

*Crea un fitxer amb un mètode que rebi un sencer i torni si és parell o no. Aquest mètode no ha de mostrar res per pantalla. 
* Quin tipus de dades hauria de tornar aquest mètode?
* 
* Crea un altre mètode que torni un sencer llegit del teclat. Utilitza'ls de manera coherent des del main i informa a l'usuari del resultat.
* 
* Hauria de tornar un boolean, per saber si es enter o no.
* @author Pau Ferrer

*/

import java.util.Scanner;

void main() {

int numero = llegirEnter();

boolean resultat = esParell(numero);

if (resultat) {

    IO.println("El numero " + numero + " es parell.");

} else {

    IO.println("El numero " + numero + " no es parell.");
}
}
    int llegirEnter() {
    Scanner sc = new Scanner(System.in);
    IO.print("Introdueix un numero sencer: ");

    int valor = sc.nextInt();
    return valor;
    }
    boolean esParell(int n) {
    return n % 2 == 0;
}

