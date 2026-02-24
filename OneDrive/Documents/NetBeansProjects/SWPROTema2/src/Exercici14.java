/* Exercici 14

*Defineix dues variables de tipus sencer, anomenades inici i fi, i assigna-li valors, de manera que inici<=fi. Mostra per pantalla tots els sencers entre inici i fi (inclosos) utilitzant un while.
* @author Pau Ferrer

*/

void main() {

  int inici = 3;
  int fi = 20;

       
        if (inici <= fi) {
            int num = inici;
           
            while (num <= fi) {
                IO.println (num);
                num++;
            }
        } else {
                     
            IO.println ("Error: la variable 'inici' ha de ser menor o igual que 'fi'.");

        }
    }

    