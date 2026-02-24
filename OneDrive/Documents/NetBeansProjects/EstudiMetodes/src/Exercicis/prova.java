void main(){
    int n = 4;
    boolean esPrimer = false;
    
    if (n < 2){
        esPrimer = false;
    }
    for ( int i = 2; i < n; i++){
       if(n % i == 0){
           esPrimer = false;
       }
        
    }
    esPrimer = true;
    IO.println(esPrimer);
}
