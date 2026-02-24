package televisors;

/**
 * 
 * @author bypau
 */
public class televisor {
    
    //Atributs
    
    private int volum;
    
    private int canal;
    
    //Constructors
    public televisor(){
        volum=0;
        canal=1;
    }
    
    public televisor(int vol, int channel){
        volum=vol;
        canal=channel;
    }
    
    public televisor (int volum){
        this.volum=volum;
    }
    
    //Mètodes
    
    public void  incrementaVolum(){
       volum ++; 
    }
    
    public void setCanal(int canal){
        
        this.canal=canal;
    }
    
    //getter. Recupera el valor de l'atribut.
   public int getCanal(){
    
    //Mai IO.println(canal);
    return canal;
        
    }
   
}