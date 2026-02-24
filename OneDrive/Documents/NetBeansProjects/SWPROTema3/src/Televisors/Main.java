package televisors;


/**
 *
 * @author bypau
 */
public class Main {
    
    public static void main(){
        televisor lg; //Declaram la variable de tipus Televisor
        lg=new televisor(); //Cream l'objecte
        
        lg.incrementaVolum();
        
        televisor samsung = new televisor(8, 32);
        samsung .setCanal (25);
        
        IO.println(samsung.getCanal());
        IO.print(lg.getCanal());
        
    }
    
    
}
