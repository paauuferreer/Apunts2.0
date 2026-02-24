/** Exercici 13

*Crea un fitxer .java amb un mètode que rebi un array de sencers i torni la suma de tots els seus valors. Al main mostra aquest resultat.

* @author Pau Ferrer

*/

void main() {

        int[] numeros = {3, 5, 8, 2, 10};

        int resultat = sumarArray(numeros);

        IO.println("La suma dels valors es: " + resultat);
    }

    int sumarArray(int[] array) {
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        return suma;
}



    
    

