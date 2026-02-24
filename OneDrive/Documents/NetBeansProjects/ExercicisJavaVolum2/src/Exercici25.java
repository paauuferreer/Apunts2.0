/* Exercici 25

*Comprova si un nombre és primer o no utilitzant un while.

* @author Pau Ferrer
*/
void main ( ){
    
    int nombre = 5;
    boolean esPrimer = true;
    int i;
    
            i = 2;

        if (nombre <= 1) {
            esPrimer = false; 
        } else {
            while (i <= nombre / 2 && esPrimer) {
                if (nombre % i == 0) {
                    esPrimer = false;
                }
                i++;
            }
        }

        if (esPrimer) {
            IO.println(nombre + " es un nombre primer.");
        } else {
            IO.println(nombre + " no es un nombre primer.");
        }
    
    
}