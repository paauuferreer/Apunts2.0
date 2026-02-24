import java.util.Scanner;

void main(){
    int enter = llegirEnter();
    
    parellONo(enter);
  
}
   
int llegirEnter(){
    Scanner sc = new Scanner(System.in);
    IO.println("Introdueix un nombre enter");
    int enter = sc.nextInt();
    return enter;
}

    
void parellONo(int enter){
     if (enter % 2 != 0){
         IO.println("No es enter.");
     }else{
         IO.println("Es enter.");
     }
     
}
    
