/* Exercici 38

*Genera sencers aleatòris entre un valor màxim i un valor mínim fins que els hagis generats tots. 
*Mostra els valors generats i quantes iteracions has necessitat per conseguir-ho.


* @author Pau Ferrer

 */
void main (){
    
    int min = 1;
    int max = 20;
    int[] numeros = new int[max - min + 1];
    int comptador = 0; 
    int iteracions = 0;
    int num;
    int i;

        while (comptador < numeros.length) {
            num = (int)(Math.random() * (max - min + 1)) + min;
            iteracions++;

          
            boolean jaExisteix = false;
            for (i = 0; i < comptador; i++) {
                if (numeros[i] == num) {
                    jaExisteix = true;
                    break;
                }
            }

            if (!jaExisteix) {
                numeros[comptador] = num;
                comptador++;
            }
        }

        IO.println("Numeros generats: ");
        for (i = 0; i < numeros.length; i++) {
            IO.println(numeros[i] + " ");
        }
            IO.println();
            IO.println("Iteracions necessaries: " + iteracions);
}

