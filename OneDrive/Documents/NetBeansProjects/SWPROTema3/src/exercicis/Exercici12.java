/** Exercici 12

*Escriu un mètode que rebi qualsevol quantitat de valors sencers i torni el màxim del valors que ha rebut.Prohibit utilitzar arrays com a paràmetre.

* @author Pau Ferrer

*/

void main() {
    int m = maxim(4, 10, -2, 7);
    IO.println("El maxim es: " + m);
}

int maxim(int... valors) {

    if (valors.length == 0) {
        IO.println("No s'ha introduit cap valor.");
        return 0;  
    }

    int max = valors[0];

    for (int v : valors) {
        if (v > max) {
            max = v;
        }
    }

    return max;
}


