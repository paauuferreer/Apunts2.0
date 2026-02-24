package executable;

import java.util.Random;
import utilitats.UtilitatsConsola;
import utilitats.OrdenacioICerca;

/**
 * 
 * @author bypau
 */
public class Executable {

    void main() {
        int longitud = UtilitatsConsola.llegirSencer("Introdueix la longitud de l'array a generar: ");
        
        if (longitud <= 0) {
            IO.println("La longitud ha de ser un numero positiu.");
            return;
        }

        int[] dades = generarArrayAleatori(longitud, 1000);
        
        IO.println("Array Original");
        mostrarArray(dades);

        long tempsInici = System.nanoTime();
        
        OrdenacioICerca.rapid(dades, 0, dades.length - 1);
        
        long tempsFinal = System.nanoTime();
        
        double tempsMilisegons = (tempsFinal - tempsInici) / 1_000_000.0;
        
        IO.println("Array Ordenat");
        mostrarArray(dades);
        
        System.out.printf("Temps d'execucio de l'ordenacio: %.4f ms", tempsMilisegons);
    }

    
    private int[] generarArrayAleatori(int mida, int limit) {
        int[] v = new int[mida];
        Random r = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(limit);
        }
        return v;
    }

    private void mostrarArray(int[] v) {
        if (v.length > 100) {
            IO.println("[L'array es massa gran per mostrar-lo completament (" + v.length + " elements)]");
            return;
        }
        for (int i = 0; i < v.length; i++) {
            IO.print(v[i] + (i == v.length - 1 ? "" : ", "));
        }
            IO.println();
    }
}