/** Exercici 9

*Realitza un programa que permeti executar les següents accions:

* Trobar el major de dos sencers.

* Trobar el major de tres sencers.

* Mostrar la relació entre dos sencers a<b o a=b o a> b

* Per a cada una d'elles has de crear un mètode que faci els càlculs necessaris.

* El main s'encarregarà de

* Mostrar a l'usuari les opcions possibles i demanar-li quina vol executar.

* Llegir l'opció que ha pitjat l'usuari.

* Per a cada opció llegir les dades necessàries.

* Cridar al mètode adequat passant-li les dades necessàries com a paràmetres.


* @author Pau Ferrer

*/

import utilitats.UtilitatsConsola;


    void main() {

        boolean sortir = false;

        while (!sortir) {

            IO.println("MENU");
            IO.println("1. Trobar el major de dos sencers");
            IO.println("2. Trobar el major de tres sencers");
            IO.println("3. Mostrar relacio entre dos sencers");
            IO.println("0. Sortir");
            int opcio = UtilitatsConsola.llegirSencer("Opcio: ");

            switch (opcio) {

                case 1:
                    int a = UtilitatsConsola.llegirSencer("Introdueix el primer nombre: ");
                    int b = UtilitatsConsola.llegirSencer("Introdueix el segon nombre: ");
                    IO.println("El major es: " + majorDeDos(a, b));
                    break;

                case 2:
                    int x = UtilitatsConsola.llegirSencer("Primer nombre: ");
                    int y = UtilitatsConsola.llegirSencer("Segon nombre: ");
                    int z = UtilitatsConsola.llegirSencer("Tercer nombre: ");
                    IO.println("El major es: " + majorDeTres(x, y, z));
                    break;

                case 3:
                    int n1 = UtilitatsConsola.llegirSencer("Primer nombre: ");
                    int n2 = UtilitatsConsola.llegirSencer("Segon nombre: ");
                    IO.println(relacio(n1, n2));
                    break;

                case 0:
                    sortir = true;
                    break;

                default:
                    IO.println("Opcio no valida.");
            }
        }

        IO.println("Programa finalitzat.");
    }


    int majorDeDos(int a, int b) {
        return (a > b) ? a : b;
    }

    int majorDeTres(int a, int b, int c) {
        int major = a;
        if (b > major) major = b;
        if (c > major) major = c;
        return major;
    }

    String relacio(int a, int b) {
        if (a < b) return a + " < " + b;
        else if (a > b) return a + " > " + b;
        else return a + " = " + b;
}
