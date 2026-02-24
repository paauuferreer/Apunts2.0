/*
*Array de int
*La classe ArrayInt tendrà les següents característiques:
*No pot imprimir res per consola ni demanar res per teclat.
*Ha de tenir un array de int com a atribut.
*Ha de tenir un atribut sencer que indiqui l'index de la primera posició buida de l'array.
*Al constructor ha de tenir un paràmetre que indiqui la longitud de l'array i l'ha de crear d'aquesta longitud. Ha d'inicialitzar de manera convenient l'atribut del punt anterior.
*Ha de tenir només el getter de l’array i de l'index de la primera posició buida.
*(Opcional) El get de l'array ha de tornar una còpia de l'array, si pot ser només de les posicions plenes.
*Ha detenir un mètode que indiqui si l'array és plè o no. Heu de montar el mecanisme necessari per saber-ho.
*Ha de tenir un mètode que permeti afegir un valor positiu (rebut com a paràmetre) a l’array sempre que no sigui ple. Ha de tornar true si l’ha afegit i false en cas contrari.
*(Opcional) Afegeix un constructor sense paràmetre. Inicialitza la classe amb un array de longitud 10.
*Afegeix un mètode que rebi un valor sencer per paràmetre i esborri la primera aparició d'aquest valor dins l'array. 
*Ha de compactar l'array de manera que no quedin buits i l'atribut que indica la primera posició buida sigui correcte.
*(Opcional) Afegeix un mètode que rebi un valor sencer per paràmetre i esborri totes les aparicions d'aquest valor dins l'array. 
*Ha de compactar l'array de manera que no quedin buits i l'atribut que indica la primera posició buida sigui correcte.
*(Opcional) Afegeix un mètode que torni el valor de la posició demanada per paràmetre. Si la posició està buida ha de tornar -1.
*(Opcional) Copia la classe ArrayInt a ArrayIntAmpliable. Modifica el necessari de manera que si l'array és ple i volem afegir un valor nou incrementi la longitud de l'array.
*Nota: Una vegada creat un array no es pot modificar la seva longitud. Com fer-ho?
*(Opcional) Al main comprova que l’array realmen es ampliable.


*/

public class ArrayInt {
    
    
    // Array d'enters

    private int[] array;
    
    // Index de la primera posició buida
    
    private int indexBuida;
    
    // Constructor amb paràmetre (longitud de l'array)
    
    public ArrayInt(int longitud){
        array = new int [longitud];
        indexBuida = 0;
    }
    
    //(Opcional) Constructor sense paràmetres  (longitud 10)
    
    public ArrayInt(){
        this(10);
   
    }
    
    // Getter de l'index de la primera posició buida
    
    public int getIndexBuida(){
        return indexBuida;
    }
    
    //Getter de l'array (torna copia nomes de les posicions plenes)
    
    public int[] getArray(){
        int[] copia = new int[indexBuida];
        for (int i = 0; i < indexBuida; i++){
            copia[i] = array[i];
        }
        return copia;
    }
    
    //Indica si l'array esta ple
    
    public boolean estaPle(){
        return indexBuida == array.length;
        
    }
    
    //Afageix un valor positiu a l'array si no es ple
    
    public boolean afegir(int valor){
        if (valor <= 0 || estaPle()){
            return false;
        }
        array[indexBuida] = valor;
        indexBuida++;
        return true;
    }
    
    //Esborra la primera aparició d'un valor i compacta l'array
    
    public boolean esborrarPrimeraAparicio(int valor) {
        for (int i = 0; i < indexBuida; i++){
            if (array[i] == valor){
                
                for (int j = i; j < indexBuida - 1; j++){
                array[j] = array [j + 1];
            }
             indexBuida--;
             return true;
            }
        }
        return false;
    }
    
    //(Opcional) Esborra totes les aparicions d'un valor
    
    public int esborrarTotesAparicions(int valor){
        int eliminats = 0;
        int i = 0;
        
        while (i < indexBuida){
            if (array[i] == valor){
                for (int j = i; j < indexBuida -1; j++){
                    array [j] = array[j + 1];
                }
                indexBuida--;
                eliminats++;
            }else{
                i++;
            }
        }
        return eliminats;
    }
    
    //(Opcional) Torna el valor d'una posicio)
    
    public int getValor(int posicio){
        if (posicio < 0 || posicio >= indexBuida){
            return -1;
        }
        return array[posicio];
    }

}





