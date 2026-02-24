/* Exercici 24

*Comprova si un nombre és primer o no utilitzant un for i un booleà.

* @author Pau Ferrer
*/
void main( ){
   
    int nombre = 5;
    boolean esPrimer = true;
    int i;
    
     if (nombre <= 1) {
            esPrimer = false;
        } else {
            for (i = 2; i <= nombre / 2; i++) {  
                if (nombre % i == 0) {
                    esPrimer = false; 
                }
            }
        }

        if (esPrimer) {
            IO.println(nombre + " es un nombre primer.");
        } else {
            IO.println(nombre + " no es un nombre primer.");
    }
}