/** Exercici 14

*Crea un fitxer .java amb un mètode que rebi un array de sencers i torni la suma de tots els seus valors. Al main mostra aquest resultat.

* @author Pau Ferrer

*/

import utilitats.UtilitatsConsola;
import java.util.Random;


    void main() {

        int[] array1 = generarArrayAleatori(5, 1, 10);
        int[] array2 = generarArrayAleatori(8, -3, 3);
        int[] array3 = generarArrayAleatori(12, 100, 200);

        IO.print("Array 1: ");
        UtilitatsConsola.mostrarArray(array1);

        IO.print("Array 2: ");
        UtilitatsConsola.mostrarArray(array2);

        IO.print("Array 3: ");
        UtilitatsConsola.mostrarArray(array3);
    }

    int[] generarArrayAleatori(int longitud, int min, int max) {

        int[] array = new int[longitud];
        Random r = new Random();

        for (int i = 0; i < longitud; i++) {
            array[i] = r.nextInt(max - min + 1) + min;
        }

        return array;
}

