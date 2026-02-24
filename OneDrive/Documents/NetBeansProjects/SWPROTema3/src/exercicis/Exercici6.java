/** Exercici 6

*Crea un fitxer amb un mètode amb tres paràmetres de tipus sencer (anomenats a, b i c), que els ordeni de manera que al final el valor més petit estigui dins la a i el major dins la c.

*Al main crea i inicialitza tres variables de tipus sencer x, y, z i mostra-les per pantalla.

*Passa-les al mètode i en acabar torna-les a imprimir. Apareixen ordenades? Per què?

* NO apareixen ordenats perquè Java passa una còpia dels valors (passatge per valor), no les variables originals.

* @author Pau Ferrer

*/

void main() {
        int x = 12;
        int y = 5;
        int z = 20;

        IO.println("Abans d'ordenar: x=" + x + ", y=" + y + ", z=" + z);

        ordenar(x, y, z);

        IO.println("Despres d'ordenar: x=" + x + ", y=" + y + ", z=" + z);
        
}

void ordenar(int a, int b, int c) {
        int temp;

        if (a > b) { temp = a; a = b; b = temp; }
        if (b > c) { temp = b; b = c; c = temp; }
        if (a > b) { temp = a; a = b; b = temp; }

        IO.println("(Dins del metode) Ordenats: a=" + a + ", b=" + b + ", c=" + c);
    }

