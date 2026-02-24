/* Exercici 33

*Escriu una classe que crei un array de 10 sencers, els inicialitzi aleatòriament de 100 a 200 i els mostri per pantalla.

*Min + (int)(Math.random() * ((Max - Min) + 1))

* @author Pau Ferrer

 */

    void main (){
    
    int[] vector = new int[10];
    int i;
        
       for (i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 101) +100;
                        
            IO.println(vector[i]);

        }

        
          
       
}
