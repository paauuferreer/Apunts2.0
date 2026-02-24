 /** Exercici 37

(Opcional) Torres de Hanoi. Tenim tres pals A, B i C i tres cercles de diferent mida. 
* Col·locam els tres cercles a un pal de manera que un cercle no pugui estar sobre d'un de menor radi. 
* Hem de pintar per pantalla els moviments que cal fer per moure els cercles a un altre pal de manera que no en posem cap sobre un altre menor. 
* Els cercles només es poden moure d'un pal a un altre, no es poden llevar.

* Recursivament el problema es pot veure de la següent manera: 
* Si hem de moure tres discs del pal A al C, primer he de moure 2 discs del pal A al B, moure el disc que queda a A al pal C i moure els 2 discs del pal B al C.

* @author Pau Ferrer

*/



    void hanoi(int n, char origen, char desti, char auxiliar) {

        if (n == 1) {
            IO.println("Moure disc de " + origen + " a " + desti);
        } else {

            hanoi(n - 1, origen, auxiliar, desti);

            IO.println("Moure disc de " + origen + " a " + desti);

            hanoi(n - 1, auxiliar, desti, origen);
        }
    }

    void main() {
        int n = 7; 
        hanoi(n, 'A', 'C', 'B');
    }

