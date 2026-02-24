/* Exercici 18

*Repeteix l'exercici 14 de forma que mostri només els nombres parells.
* @author Pau Ferrer
*/
void main() {
    int inici = 3;
    int fi = 15;

    if (inici <= fi) {
        int num = inici;

        while (num <= fi) {
            if (num % 2 == 0) {  
                IO.println(num);
            }
            num++;  
        }
    } else {
        IO.println("Error: la variable 'inici' ha de ser menor o igual que 'fi'.");
    }
}
