/* Exercici 34

*Escriu una classe que generi dos arrays de sencers de la mateixa longitud i els inicialitzi.

*1. Compara-los amb una igualtat v1==v2. Funciona? Escriu l'explicació per pantalla utilitzant un println.

*2. Compara-los correctament. Dos arrays són iguals si tenen la mateixa longitud i a més a cada posició tenen el mateix valor.
*Utilitzau una variable booleana per a guardar el resultat. 
*Imprimeix un println que ens informi del resultat de la comparació.

* @author Pau Ferrer

 */

    void main (){
        
        int [] v1 = new int [10];
        int [] v2 = new int [10];
        boolean iguals = true;
        int i;
      
        v1 [7]= 5;
        
        if (v1 == v2) {
            IO.println("v1 i v2 son iguals (==) — Pero aixo no es correcte!");
        } else {
            IO.println("v1 i v2 no son iguals amb ==, perque comparen les referencies (memoria).");
        }

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
            IO.println("Els dos arrays son iguals (mateixa mida i mateixos valors).");
        } else {
            IO.println("Els dos arrays no son iguals.");
        }
 }


        
        
        
    