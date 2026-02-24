/* Exercici 21

*Crea un programa que donat un nombre sencer mostri per pantalla tots els seus divisors, per exemple, per a 6 mostraria 1, 2, 3, 6.

* @author Pau Ferrer
*/

void main ( ){
    
    int num = 50;
    int i;

        IO.println("Els divisors de " + num + " son: ");

        for  (i = 1; i <= num; i++) {
            if (num % i == 0) {
                IO.println(i);
            }
        }

    
}

