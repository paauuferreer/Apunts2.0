import java.util.Scanner;

void main(){
    String nom = llegirNom();
    
    simpatic(nom);
    
}

String llegirNom(){
    Scanner sc = new Scanner(System.in);
    IO.println("Introdueix el teu nom");
    String nom = sc.nextLine();
    return nom;
}

void simpatic (String nom){
    IO.println("Hola " + nom + " com estas?");
}