

/**
 * 34. Escriviu una classe que generi dos vectors de sencers de la mateixa
 * longitud i els inicialitzi.
 * 1. Comparau-los amb una igualtat v1==v2.
 * Funciona? Escriviu l'explicació per pantalla utilitzant un println.
 * 2.Comparau-los correctament. Utilitzau una variable booleana per a guardar el
 * resultat. Imprimiu un println que ens informi del resultat de la comparació.
 *
 * @author joan
 */


void main() {

    boolean iguals = true;
    int[] vector1 = new int[10];
    int[] vector2 = new int[vector1.length];
    for (int index = 0; index < vector1.length; index++) {
        vector1[index] = index + 1;
        vector2[index] = index + 1;
    }

    if (vector1 == vector2) {
        IO.println("Són iguals");
    }
    IO.println("Amb vector1==vector2 comparam les referencies on estan guardats els vectors, i mai seran la mateixa.");

    //Comparam els vectors posició a posició
    for (int index = 0; index < vector1.length && iguals; index++) {
        if (vector1[index] != vector2[index]) {
            iguals = false;
        }
    }
    if (iguals) {
        IO.println("Són iguals");
    } else {
        IO.println("Són diferents");

    }
}
