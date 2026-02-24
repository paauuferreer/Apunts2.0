 /** Exercici 35

*Crea un fitxer amb un mètode recursiu que calculi em màxim comú divisor de dos números utilitzant l'algorisme d'euclides: El mcd de m i n s'obté seguint el següent algorisme

 *Funció mcd (Sencer m, Sencer n)

*Enter residu ← m mod n

*Si residu = 0 llavors

*torna n

*Sino

*torna mcd(n, r)

*Fsi

*Ffunció

* @author Pau Ferrer


*/


int mcd(int m, int n) {
        int residu = m % n;
        if (residu == 0) {
            return n;
        } else {
            return mcd(n, residu);
        }
    }

    void main() {
        int m = 20;
        int n = 64;
        IO.println("El MCD de " + m + " i " + n + " es: " + mcd(m, n));
    }

