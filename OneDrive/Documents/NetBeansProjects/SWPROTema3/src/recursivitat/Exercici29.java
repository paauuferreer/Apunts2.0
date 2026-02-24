 /** Exercici 29
 
  *El factorial d'un natural es pot definir de forma recursiva com n!=n*(n-1)! Amb el cas especial 1!=1. 
  * Crea un fitxer amb un mètode que donat un paràmetre n torni (return) el factorial de n. Realitza el càlcul de forma recursiva.

* @author Pau Ferrer

*/

public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    void main() {
        int num = 5;

        long resultat = factorial(num);

        IO.println("El factorial de " + num + " es: " + resultat);
    }

