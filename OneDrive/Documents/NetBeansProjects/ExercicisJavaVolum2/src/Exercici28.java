/* Exercici 28

*Al programa anterior elimina els break del switch. 
*Que passa? Torna'l a escriure de forma que amb el mínim de codi obtinguem el resultat correcte.

* @author Pau Ferrer

* Llevar els break fa que les vocals es mostrin també com consonants.

*/



void main ( ){
          for (char lletra = 'A'; lletra <= 'Z'; lletra++) {
            switch (lletra) {
                case 'A': case 'E': case 'I': case 'O': case 'U':
                    IO.println(lletra + " es una vocal");
                    break;
                default:
                    IO.println(lletra + " es una consonant");
                    break;
            }
        }
}
