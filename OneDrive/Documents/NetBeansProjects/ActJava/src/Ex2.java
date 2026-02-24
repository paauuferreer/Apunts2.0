 void main() {
 int a=6;
 if(a<5){
    IO.println("Insuficient");

 }else if(a>=5 && a<6){
    IO.println("Suficient");

 }else if(a>=6 && a<7){
    IO.println("Be");
 
 }else if(a>=7 && a<9){
    IO.println("Notable");

 }else if(a>=9 && a<=10){
    IO.println("Exelent");

 }else if(a<0 || a>10){
    IO.println("Nota no valida");
 }
 }