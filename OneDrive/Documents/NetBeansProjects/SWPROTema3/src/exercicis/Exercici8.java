/** Exercici 8

* Crea un fiter amb main. Copia dins aquest fitxer els mètodes dels exercicis 3, 4 i 5 que miren si un nombre és parell o no i el que torna la mitjana. 
* Els mètodes que llegeixen el teclat no els copiïs.
*Des del main crida aquests mètodes utilitzant la classe UtilitatsConsola per llegir els valors demanats.


* @author Pau Ferrer

*/
import utilitats.UtilitatsConsola;


    void main() {
        // Exercici 3: Comprovar si un nombre és parell
        int numero = UtilitatsConsola.llegirSencer("Introdueix un numero enter: ");
        boolean parell = esParell(numero);
        if (parell) {
            IO.println(numero + " es parell.");
        } else {
            IO.println(numero + " no es parell.");
        }

        // Exercici 4: Tornar la mitjana de tres decimals
        double valor1 = UtilitatsConsola.llegirDouble("Introdueix el primer valor decimal: ");
        double valor2 = UtilitatsConsola.llegirDouble("Introdueix el segon valor decimal: ");
        double valor3 = UtilitatsConsola.llegirDouble("Introdueix el tercer valor decimal: ");
        double mitjana = calcularMitjana(valor1, valor2, valor3);
            IO.println("La mitjana dels tres valors es: " + mitjana);
    }

    // Mètode de l'exercici 3: comprovar si un enter és parell
    boolean esParell(int n) {
        return n % 2 == 0;
    }

    // Mètode de l'exercici 4: calcular la mitjana de tres decimals
    double calcularMitjana(double a, double b, double c) {
        return (a + b + c) / 3;
}

