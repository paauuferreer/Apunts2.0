/** Exercici 11

*Escriu un mètode que pugui rebre qualsevol nombre de paraules i torni una cadena formada concatenant aquestes paraules. Prohibit utilitzar arrays com a paràmetre.

* @author Pau Ferrer

*/

void main() {
    String frase = concatenarParaules("Hola", " ", "que", " ", "tal?");
    IO.println(frase);
}

String concatenarParaules(String... paraules) {
    String resultat = "";

    for (String p : paraules) {
        resultat += p;
    }

    return resultat;
}

