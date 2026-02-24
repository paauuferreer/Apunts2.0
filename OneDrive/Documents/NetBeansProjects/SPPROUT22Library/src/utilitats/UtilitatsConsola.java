
package utilitats;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UtilitatsConsola {

    /**
     * Llegeix un sencer del teclat. Si el que tecleja l'usuari no és un sencer
     * vàlid, avisa de l'error i torna a demanar un sencer.
     *
     * @param prompt El missatge que mostra al'usuari indicant quina dada ha
     * d'escriure.
     * @return El sencer escrit per l'usuari
     */
    public static int llegirSencer(String prompt) {
        Scanner teclat = new Scanner(System.in);
        int sencer = 0;
        boolean correcte = false;


        do {
            System.out.print(prompt);
            try {
                sencer = teclat.nextInt();
                correcte = true;

            } catch (InputMismatchException e) {
                System.err.println("Sencer incorrecte.");
                teclat.next();
            }
        } while (!correcte);
        return sencer;
    }

    /**
     * Llegeix una cadena del teclat.
     *
     * @param prompt El missatge que mostra al'usuari indicant quina dada ha
     * d'escriure.
     * @return La cadena escrita per l'usuari
     */
    public static  String llegirCadena(String prompt) {
        Scanner teclat = new Scanner(System.in);
        String cadena;


        System.out.print(prompt);
        cadena = teclat.next();
        return cadena;
    }

    /**
     * Llegeix un real del teclat. Si el que tecleja l'usuari no és un real
     * vàlid, avisa de l'error i torna a demanar un real.
     *
     * @param prompt El missatge que mostra al'usuari indicant quina dada ha
     * d'escriure.
     * @return El real escrit per l'usuari
     */
    public static double llegirDouble(String prompt) {
        Scanner teclat = new Scanner(System.in);
        double real = 0;
        boolean correcte = false;


        do {
            System.out.print(prompt);
            try {
                real = teclat.nextDouble();
                correcte = true;

            } catch (InputMismatchException e) {
                System.err.println("Real incorrecte.");
                teclat.next();
            }
        } while (!correcte);
        return real;
    }
    
    /** Mostra el menu per pantalla i demana a l'usuari l'opció a executar fins 
     * que l'usuari en pitja una de correcta.
     * 
     * @param titol El titol del menu
     * @param opcions La llista d'opcions, sense numero
     * @param pregunta La pregunta que es fa a l'usuari
     * @return L'opció vàlida elegida per l'usuari.
     */
    public static int gestionarMenu(String titol, String[] opcions, String pregunta){
        System.out.println(titol);
        int sencer;
        for(int i=0; i<opcions.length; i++){
            System.out.println((i+1)+". "+opcions[i]);
        }
        do{
            sencer=llegirSencer(pregunta);
        }while(sencer<1 || sencer>opcions.length);
        return sencer;
    }
}

