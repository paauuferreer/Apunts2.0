

/**
 * 33. Escriu una classe que crei un vector de 10 sencers, els inicialitzi
 * aleatòriament de 100 a 200 i els mostri per pantalla.
 *
 * @author joan
 */


/**
 * @param args the command line arguments
 */
void main() {
    final int MAXIM = 200;
    final int MINIM = 100;
    final int QUANTITAT = 10;

    int[] vector = new int[QUANTITAT];

    for (int index = 0; index < vector.length; index++) {
        vector[index] = MINIM + (int) (Math.random() * (MAXIM - MINIM + 1));
    }

    //Mostrar-los per pantalla
    for (int index = 0; index < vector.length; index++) {
        System.out.print(vector[index] + "\t");
    }
    IO.println();
}
