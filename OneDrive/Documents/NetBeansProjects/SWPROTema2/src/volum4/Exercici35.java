/* Exercici 35

*Escriu un altre classe que generi aleatòriament la longitud de dos arrays(mínim 2). 
*Crea els arrays d'aquestes longituds. Els valors poden ser seqüencials o aleatoris, com vulguis. Compara-los. 
*Evidentment si no tenen la mateixa longitud no són iguals.

* @author Pau Ferrer

 */
void main(){
   
int longitud1 = (int)(Math.random() * 9) +2;
int longitud2 = (int)(Math.random() * 9) + 2;
int[] v1 = new int[longitud1];
int[] v2 = new int[longitud2];
boolean iguals = true;
int i;

        IO.println("Longitud v1: " + longitud1);
        IO.println("Longitud v2: " + longitud2);

       for (i = 0; i < v1.length; i++) {
            v1[i] = i + 1;
        }
        for (i = 0; i < v2.length; i++) {
            v2[i] = i + 1;
        }

        IO.print("v1: ");
        for (i = 0; i < v1.length; i++) {
            IO.print(v1[i] + " ");
        }
        IO.println();

        IO.print("v2: ");
        for (i = 0; i < v2.length; i++) {
            IO.print(v2[i] + " ");
        }
        IO.println();
        
        if (v1.length != v2.length) {
            iguals = false;
        } else {
            for (i = 0; i < v1.length; i++) {
                if (v1[i] != v2[i]) {
                    iguals = false;
                    break;
                }
            }
        }
        
        if (iguals) {
            IO.println("Els dos arrays son iguals.");
        } else {
            IO.println("Els dos arrays no son iguals.");
        }
}

