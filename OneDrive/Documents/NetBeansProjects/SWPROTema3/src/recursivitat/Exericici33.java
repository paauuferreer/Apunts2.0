 /** Exercici 33

*Copia l'exercici anterior i modifica'l de forma que el mètode que calcula el terme n-èssim mostri per pantalla el terme que està calculant, n. 
* Executa el programa per calcular només un terme de la sèrie, no els 10 primers. Creus que el mètode recursiu és eficient? Per què?

* @author Pau Ferrer

* No, no és eficient, perquè recalcula moltes vegades els mateixos resultats.

*/

    public static int fibonacci(int n) {

        IO.println("Calculant fib(" + n + ")");

        if (n == 0) {
            return 0;   
        }
        if (n == 1) {
            return 1;   
        }

        return fibonacci(n - 1) + fibonacci(n - 2);  
    }

    void main() {

        int terme = 6;   
        IO.println("Resultat: " + fibonacci(terme));
    }

