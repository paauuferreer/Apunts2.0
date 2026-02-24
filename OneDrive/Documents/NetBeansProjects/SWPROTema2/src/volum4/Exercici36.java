/* Exercici 36

* Escriviu una classe que generi un valor aleatòri entre dos i quatre. 
*Ha d'utilitzar aquest valor per crear un array de sencers d'aquesta longitud. Ha d'omplir l'array aleatòriament. 
*Posteriorment l'ha d'ordenar utilitzant l'algorisme de l'exercici 13. 
*Per ordenar-lo vos heu d'assegurar que l'array tengui tres posicions, sinó l'algorisme no funciona. 
*Si es pot ordenar(per que tengui tres posicions) ha de mostrar per pantalla l'array ordenat. 
*Si no, ha d'avisar que no ho pot ordenar.

* @author Pau Ferrer

 */
void main (){
    
        int longitud = (int)(Math.random() * 3) + 2;         
        int[] nums = new int[longitud];
        int i;
        int temp;
        
        IO.println("Longitud generada: " + longitud);

        for (i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 100) + 1;
        }

        IO.println("Array original: ");
        for (i = 0; i < nums.length; i++) {
            IO.println(nums[i] + " ");
        }
        IO.println();

       if (nums.length == 3) {
            if (nums[0] > nums[1]) {
                temp = nums[0];
                nums[0] = nums[1];
                nums[1] = temp;
            }
            if (nums[1] > nums[2]) {
                temp = nums[1];
                nums[1] = nums[2];
                nums[2] = temp;
            }
            if (nums[0] > nums[1]) {
                temp = nums[0];
                nums[0] = nums[1];
                nums[1] = temp;
            }

            IO.println("Array ordenat: ");
            for (i = 0; i < nums.length; i++) {
                IO.println(nums[i] + " ");
            }
            IO.println();
            
        } else {
            IO.println("No es pot ordenar perquè l'array no té 3 posicions.");
        }
}

