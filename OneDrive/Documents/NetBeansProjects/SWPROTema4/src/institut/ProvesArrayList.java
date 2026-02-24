
package institut;

/**
 * Crea una classe anomenada ProvesArrayList que tengui main:

Declara un mètode void sense paràmetres anomenat proves. Dins ell faràs totes les proves que es demanin.

Al main crida el mètode proves.

Declara un atribut de tipus ArrayList de mòduls. Inicialitza'l al constructor.

Crea un mètode mostraLlistaIndex que mostri per pantalla tots els mòduls que hi hagi a la llista, amb la posició que ocupen. Utilitza el primer for dels apunts.

Crea un mètode mostraLlista que mostri per pantalla tots els mòduls que hi hagi a la llista. Utilitza el segon for dels apunts.

Dins proves:

Crea quatre mòduls amb dades distints i afegeix-los a la llista.

Crida el mètode mostraLlista.

Recupera el mòdul que ocupa la tercera posició i mostra'l per pantalla.

Elimina el mòdul amb index 2.

Crida el mètode mostraLlistaIndex.

Crea un mòdul nou, assigna’l a una variable i afegeix-lo a la posició 2.

Crida el mètode mostraLlistaIndex.

Elimina el mòdul creat anteriorment sense utilitzar l'index.

Crida el mètode mostraLlistaIndex.

Crea un mòdul nou, assigna'l a la variable altre i substitueix el que hi hagi a la posició 1 per aquest.

Crida el mètode mostraLlistaIndex.
 *
 * @author bypau
 */
import java.util.ArrayList;

public class ProvesArrayList {
    
  
    private final ArrayList<Modul> llistaModuls;

    // Constructor
    public ProvesArrayList() {
        llistaModuls = new ArrayList<>();
    }

    void main() {
        ProvesArrayList proves = new ProvesArrayList();
        proves.proves();
    }

    public void proves() {

        Modul m1 = new Modul("Programacio", 6);
        Modul m2 = new Modul("Bases de Dades", 5);
        Modul m3 = new Modul("Sistemes", 4);
        Modul m4 = new Modul("Redes", 3);

        llistaModuls.add(m1);
        llistaModuls.add(m2);
        llistaModuls.add(m3);
        llistaModuls.add(m4);

        IO.println("LLISTA AMB EL SEGON FOR:");
        mostraLlista();
        IO.println("\n----------------------\n");

        // Recuperar el mòdul de la tercera posició (index 2)
        Modul recuperat = llistaModuls.get(2);
        IO.println("MODUL DE LA TERCERA POSICIO:");
        IO.println(recuperat);
        IO.println("\n----------------------\n");

        // Eliminar el mòdul amb index 2
        llistaModuls.remove(2);

        // Mostrar la llista amb el primer for (amb index)
        IO.println("LLISTA DESPRES D'ELIMINAR INDEX 2:");
        mostraLlistaIndex();
        IO.println("\n----------------------\n");

        // Crear un mòdul nou i afegir-lo a la posició 2
        Modul nou = new Modul("Enginyeria", 7);
        llistaModuls.add(2, nou);

        IO.println("LLISTA DESPRES D'AFEGIR NOU A POSICIO 2:");
        mostraLlistaIndex();
        IO.println("\n----------------------\n");

        // Eliminar el mòdul creat anteriorment sense utilitzar index
        llistaModuls.remove(nou);

        System.out.println("LLISTA DESPRES D'ELIMINAR EL MODUL NOU:");
        mostraLlistaIndex();
        IO.println("\n----------------------\n");

        // Crear un mòdul nou i substituir el que hi ha a la posició 1
        Modul altre = new Modul("Matematiques", 5);
        llistaModuls.set(1, altre);

        IO.println("LLISTA DESPRES DE SUBSTITUIR POSICIO 1:");
        mostraLlistaIndex();
    }

    // Mostra llista amb el primer for (index)
    public void mostraLlistaIndex() {
        for (int i = 0; i < llistaModuls.size(); i++) {
            IO.println("Posicio " + i + ": " + llistaModuls.get(i));
        }
    }

    // Mostra llista amb el segon for (foreach)
    public void mostraLlista() {
        for (Modul m : llistaModuls) {
            IO.println(m);
        }
    }
}

