/* Exercici 32

*Escriu una classe que crei un array de 10 sencers, els inicialitzi de 1 a 10 i els mostri per pantalla.

* @author Pau Ferrer

*/

void main (){
    
    int[] vector = new int[10];
    int i;
        
        for (i = 0; i < vector.length; i++) {
            vector[i] = i +1;
        }

        for (i = 0; i < vector.length; i++) {
            IO.println(vector[i]);
        }
}

