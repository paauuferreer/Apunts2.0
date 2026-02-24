 /** Exercici 28  
 
  * A un fitxer nou, escriu un mètode que calculi de forma recursiva la suma dels n primers enters, és a dir, la suma dels 5 primers enters és 5 més la suma dels 4 primers enters.

* @author Pau Ferrer

*/
int sumaPrimersEnters(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumaPrimersEnters(n - 1);
    }

    void main() {
        int resultat = sumaPrimersEnters(5);
        IO.println("La suma dels 5 primers enters es: " + resultat);
    }
