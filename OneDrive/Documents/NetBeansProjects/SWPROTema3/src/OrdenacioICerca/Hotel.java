/** Exercici Hotel
 * 
 * Tenim un hotel amb 20 habitacions, on les habitacions estan anomenades per lletres o paraules. 
 * Per a cada habitació volem saber quantes places té, a quina planta es troba i si en aquest moment està ocupada o no. 
 * Totes les variables que necessiteu per guardar aquesta informació han d'estar declarades al main.
 * Utilitza arrays paral·lels per guardar la informació. És a dir la informació d'una determinada habitació està guardada a la casella x de tots els arrays. 
 * Declara aquests arrays fora de qualsevol mètode.

    *Crea un mètode que inicialitzi la informació de l'hotel. Si voleu podeu utilitzar Math.random();

    *Fes un mètode que mostri la llista de les habitacions amb tota la informació: nom, places i planta i ocupades.

    *Crea un mètode que mostri el nom de totes les habitacions d'una determinada planta, passant la planta com a paràmetre.

    *Escriu un mètode que ens digui quantes habitacions tenim d'un determinat nombre de places i quines són.

    *Escriu un altre mètode que ens mostri les habitacions d'un nombre determinat de places que tenim buides. Si no n'hi ha cap ens ha d'avisar.
 * 
 * @author Pau Ferrer
 */
public class Hotel {

    static String[] nomHabitacio = new String[20];
    static int[] places = new int[20];
    static int[] planta = new int[20];
    static boolean[] ocupada = new boolean[20];

    void main() {

        inicialitzarHotel();
        mostrarHabitacions();

        IO.println("\nHabitacions de la planta 2:");
        mostrarHabitacionsPlanta(2);

        IO.println("\nHabitacions amb 3 places:");
        mostrarHabitacionsPerPlaces(3);

        IO.println("\nHabitacions buides amb 2 places:");
        mostrarHabitacionsBuidesPerPlaces(2);
    }

    public static void inicialitzarHotel() {
        for (int i = 0; i < 20; i++) {
            nomHabitacio[i] = "HAB-" + (i + 1);
            places[i] = (int) (Math.random() * 4) + 1; 
            planta[i] = (int) (Math.random() * 5) + 1;
            ocupada[i] = Math.random() < 0.5;
        }
    }

    
    public static void mostrarHabitacions() {
        for (int i = 0; i < 20; i++) {
            System.out.println(
                nomHabitacio[i] +
                " | Places: " + places[i] +
                " | Planta: " + planta[i] +
                " | Ocupada: " + (ocupada[i] ? "Si" : "No")
            );
        }
    }

    public static void mostrarHabitacionsPlanta(int p) {
        for (int i = 0; i < 20; i++) {
            if (planta[i] == p) {
                IO.println(nomHabitacio[i]);
            }
        }
    }

    public static void mostrarHabitacionsPerPlaces(int numPlaces) {
        int comptador = 0;

        for (int i = 0; i < 20; i++) {
            if (places[i] == numPlaces) {
                IO.println(nomHabitacio[i]);
                comptador++;
            }
        }

        IO.println("Total: " + comptador + " habitacions");
    }

    public static void mostrarHabitacionsBuidesPerPlaces(int numPlaces) {
        boolean trobada = false;

        for (int i = 0; i < 20; i++) {
            if (places[i] == numPlaces && !ocupada[i]) {
                IO.println(nomHabitacio[i]);
                trobada = true;
            }
        }

        if (!trobada) {
            IO.println("No hi ha cap habitacio buida amb " + numPlaces + " places.");
        }
    }
}
