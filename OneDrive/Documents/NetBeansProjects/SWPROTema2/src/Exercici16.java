/* Exercici 16
*Repeteix l'exercici amb un do{}while().
* @author Pau Ferrer

*/
void main() {
    int inici = 3;
    int fi = 10;

    if (inici <= fi) {
        int num = inici;

        do {
            IO.println(num);
            num++;
        } while (num <= fi);
    } else {
        IO.println("Error: la variable 'inici' ha de ser menor o igual que 'fi'.");
    }
}
