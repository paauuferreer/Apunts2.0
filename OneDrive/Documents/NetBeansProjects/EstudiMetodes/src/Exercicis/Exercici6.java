import java.util.Scanner;

void main(){
    ordenarValors();
}
void ordenarValors(){
    Scanner sc = new Scanner(System.in);

  IO.print("Introduce el primer numero: ");
    int  a = sc.nextInt();

    IO.print("Introduce el segundo numero: ");
    int  b = sc.nextInt();

    IO.print("Introduce el tercer numero: ");
    int  c = sc.nextInt();
    
    IO.println("Els valors fora ordenar son: a: " +a+ " b: " +b+ " c: " +c);
    
    int aux = 0;
    int aux2 = 0;
    int aux3 = 0;
    
    if(a < b && a < c){
        aux = a;
    }else if( b < a && b < c){
        aux = b;
    }else{
        aux = c;
    }
    
    if (a > b && a > c){
        aux2 = a;
    }else if( b > a && b > c){
        aux2 = b;
    }else{
        aux2 = c;
    }
    
    if ( a < b && a > c || a > b && a < c){
        aux3 = a;
    }else if ( b < a && b > c || b > a && b < c){
        aux3 = b;
    }else{
        aux3 = c;
    }
    
    a = aux;
    b = aux3;
    c = aux2;
    
    IO.println("Els valors ordenats son: a: " +a+ " b: " +b+ " c: " +c);

            
}                     