public class habitacio {
    
    private int places;
    private int planta;
    private String nom;
    private boolean ocupada;
    
    public habitacio (int places, int planta, String nom, boolean ocupada){
        setNom(nom);
        this.places=places;
        this.planta=planta;
        this.ocupada=ocupada;
    }
    
    public int getPlaces(){
        return places;
    }
    
    public void setPlaces (int places){
        if (places>0 && places <=5){
            this.places = places;
        }
    }
    
    public int getPlanta(){
        return planta;
    }
    
    public void setPlanta (int planta){
        this.planta=planta;
    }
    
    public string getNom(){
        return nom;
    }
}