/* Exercici 17

*Quina diferència hi ha entre els tres exercicis si inici>fi? Mostra l'explicació per pantalla.
* @author Pau Ferrer
*/
void main() {
    int inici = 10;
    int fi = 3;

    IO.println("Comparacio dels tres bucles quan inici > fi:\n");

    IO.println("Bucle while:");
    int num = inici;
    while (num <= fi) {
        IO.println(num);
        num++;
    }
    IO.println("El bucle while no s'executa perque la condicio es falsa d'entrada.\n");

    IO.println("Bucle for:");
    for (int i = inici; i <= fi; i++) {
        IO.println(i);
    }
    IO.println("El bucle for tampoc s'executa perque la condicio es falsa des del principi.");

    IO.println("Bucle do...while:");
    int x = inici;
    do {
        IO.println(x);
        x++;
    } while (x <= fi);
    IO.println("El bucle do...while s'executa una vegada, encara que la condicio sigui falsa, " +
               "perque comprova la condicio despres d'executar el bloc.");
}
