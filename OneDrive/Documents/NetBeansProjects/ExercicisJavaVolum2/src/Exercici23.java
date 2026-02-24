/* Exercici 23

*Donat un nombre natural n, mostrar els n primers nombres de la successió de Fibonnacci: 0, 1, 1, 2, 3, 5, 8,
*En aquesta successió, els dos primers termes són 0 i 1. Es següents termes s'obtenen sumant els dos anteriors, 
*és a dir, el tercer terme s'obté sumant el primer i el segon; el quart sumant el segon i el tercer, ....

* @author Pau Ferrer
*/

void main ( ){
    
    int n = 10;
    int a = 0;
    int b = 1;
    int i;
    int seguent;

        IO.println("Successio de Fibonacci amb " + n + " termes:");

        for (i = 1; i <= n; i++) {
            IO.println(a);

            seguent = a + b; 
            a = b;            
            b = seguent;         
        }

     
}