public class hotel1{
    private String  nom;
    private habitacio[] habitacions;
    
    public Hotel (String nom) {
        this.nom = nom;
        Random random =new Random();
        habitacions =new  Habitacio[10];
        for (int index=0; index <habitacions.length; index ++){
            Habitacio nova = new Habitacio(
                        random.nextInt(1,6),
                        random.nextInt(1,20),
                        "Habitacio" + index,
                        random.nextBoolean()
            );
            habitacions[index]=nova;
        }
    }
    
    public hotel1 (String nom, Habitacio[] habitacions){
        this.nom=nom;
        this.habitacions=habitacions;
    }
    
    public String getNom(){
        return nom;
    }
}