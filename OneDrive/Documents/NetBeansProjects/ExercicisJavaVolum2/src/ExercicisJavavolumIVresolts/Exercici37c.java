

/**
 * 37. Crea una classe que defineixi una matriu quadrada, pe 4x4, i: 1.
 * Inicialitzau-la de forma que cada casella tengui la suma de les seves
 * coordenades. 2. Mostrau la diagonal principal, [1,1], [2,2]... 3. Mostrau la
 * diagonal secundària [4,1][3,2]...
 *
 * @author joan
 */


void main() {
    int[][] m = new int[4][4];
        /*1.Inicialitzau-la de forma que cada casella tengui la suma de les seves 
         coordenades.*/
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[i].length; j++) {
            m[i][j] = i + j;
            System.out.print(m[i][j] + "\t");
        }
        IO.println();
    }
    /*2. Mostrau la diagonal principal, [1,1], [2,2]... */
    IO.println("Diagonal principal");
    for (int i = 0; i < m.length; i++) {
        System.out.print(m[i][i] + "\t");
    }
    IO.println();

    /*3. Mostrau la diagonal secundària [4,1][3,2]...*/
    IO.println("Diagonal secundaria");
    for (int i = 0, j = m.length - 1; i < m.length; i++, j--) {
        System.out.print(m[i][j] + "\t");
    }
    IO.println();
}
