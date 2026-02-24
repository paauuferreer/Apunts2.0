/** Exercici 3

*Crea un fitxer amb un mètode que rebi un sencer i mostri per pantalla si el nombre es parell o no. 
* Crea un altre mètode que torni un sencer llegit del teclat. Utilitza'ls de manera coherent des del main.

* @author Pau Ferrer

*/

import java.util.Scanner;

    void main() {
        int numero = llegirEnter();
        esParell(numero);
    }

    void esParell(int n) {
        if (n % 2 == 0) {
            IO.println(n + " es parell.");
        } else {
            IO.println(n + " no es parell.");
        }
    }

    int llegirEnter() {
        Scanner sc = new Scanner(System.in);
        IO.print("Introdueix un numero sencer: ");
        int valor = sc.nextInt();
        return valor;
    }

