void main(){
    int[] numeros = {1, 2, 3, 4, 5, 6};
    int resultat = sumarArray(numeros);
    
    IO.println("La suma dels valors de l'array es: " + resultat);
}


int sumarArray(int[] array){
    int suma = 0;
    
    for (int i = 0; i < array.length; i++){
        suma  = suma + array[i];
    }
    return suma;
}