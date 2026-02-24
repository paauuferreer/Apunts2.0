/* Exercici 19

*Crea un programa que recorri els 10 primers sencers. Si el nombre és 5 ha d'executar una instrucció continue, si no l'ha de mostrar per pantalla. 
*Repeteix-lo amb un break. Quina és la diferència? Mostra explicació per pantalla.
* @author Pau Ferrer
*/
void main() {
    IO.println("Exemple amb 'continue':");

    for (int i = 1; i <= 10; i++) {
        if (i == 5) {
            continue; 
        }
        IO.println(i);
    }

    IO.println("Explicacio: el 'continue' fa que quan i = 5, " +
               "no s'executi el codi que ve despres i passi directament al seguent valor del bucle.");


    IO.println("Exemple amb 'break':");

    for (int i = 1; i <= 10; i++) {
        if (i == 5) {
            break; 
        }
        IO.println(i);
    }

    IO.println("Explicacio: el 'break' fa que quan i = 5, " +
               "s'aturi completament el bucle i no es continui executant.");

    IO.println("Diferencia principal:");
    IO.println("   'continue' salta nomes una iteracio del bucle (no mostra el 5).");
    IO.println("   'break' finalitza tot el bucle quan arriba al 5.");
}

