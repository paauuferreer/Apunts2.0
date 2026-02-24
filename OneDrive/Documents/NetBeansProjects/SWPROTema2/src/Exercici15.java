/* Exercici 15
*Repeteix l'exercici anterior utilitzant un for.
* @author Pau Ferrer

*/
void main() {
    int inici = 3;
    int fi = 10;

    if (inici <= fi) {
        for (int num = inici; num <= fi; num++) {
            IO.println(num);
        }
    } else {
        IO.println("Error: la variable 'inici' ha de ser menor o igual que 'fi'.");
    }
}
