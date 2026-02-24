/** Exercici 5

*Crea un fitxer amb un mètode que rebi tres valors amb decimals i torni la mitjana d'aquests valors. Aquest mètode no ha de mostrar res per pantalla.

* @author Pau Ferrer

*/

import java.util.Scanner;



    void main() {
        Scanner sc = new Scanner(System.in);

        IO.print("Introdueix el primer valor: ");
        double valor1 = sc.nextDouble();

        IO.print("Introdueix el segon valor: ");
        double valor2 = sc.nextDouble();

        IO.print("Introdueix el tercer valor: ");
        double valor3 = sc.nextDouble();

        double mitjana = calcularMitjana(valor1, valor2, valor3);

        IO.println("La mitjana dels tres valors es: " + mitjana);
    }

    double calcularMitjana(double a, double b, double c) {
        return (a + b + c) / 3;
}
