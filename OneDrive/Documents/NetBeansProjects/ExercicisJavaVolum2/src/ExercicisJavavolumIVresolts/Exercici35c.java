

/**
 * 35. Escriviu un altre classe que generi aleatòriament la longitud de dos
 * arrays(mínim 2). Creau els arrays d'aquestes longituds i comparau-los.
 * Evidentment si no tenen la mateixa longitud no són iguals.
 *
 * @author joan
 */


void main() {

    boolean iguals = true;
    int[] vector1 = new int[2 + (int) (Math.random() * 101)];
    int[] vector2 = new int[2 + (int) (Math.random() * 101)];
    for (int index = 0; index < vector1.length; index++) {
        vector1[index] = 1 + (int) (Math.random() * 101);
    }
    for (int index = 0; index < vector2.length; index++) {
        vector2[index] = 1 + (int) (Math.random() * 101);
    }

    if (vector1.length != vector2.length) {
        iguals = false;
    } else {
        //Comparam els vectors posició a posició
        for (int index = 0; index < vector1.length && iguals; index++) {
            if (vector1[index] != vector2[index]) {
                iguals = false;
            }
        }
    }
    if (iguals) {
        IO.println("Són iguals");
    } else {
        IO.println("Són diferents");

    }
}
