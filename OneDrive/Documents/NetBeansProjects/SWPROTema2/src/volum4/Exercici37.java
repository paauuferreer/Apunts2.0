/* Exercici 37

*Crea una classe que defineixi una matriu quadrada, pe 4x4, i:

*Inicialitza-la de forma que cada casella tengui la suma de les seves coordenades.

*Mostra la diagonal principal, [0,0],[1,1], [2,2]...

*Mostra la diagonal secundària [3,0],[2,1]...

* @author Pau Ferrer

 */

void main (){
    
    int n = 4; 
    int[][] matriu = new int[n][n];
    int i;
    int j;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                matriu[i][j] = i + j;
            }
        }

        IO.println("Matriu completa:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                IO.println(matriu[i][j] + "\t");
            }
            IO.println();
        }

        IO.print("Diagonal principal: ");
        for (i = 0; i < n; i++) {
            IO.print(matriu[i][i] + " ");
        }
        IO.println();

        IO.println("Diagonal secundaria: ");
        for (i = 0; i < n; i++) {
            IO.print(matriu[n-1-i][i] + " ");
        }
        IO.println();
}
