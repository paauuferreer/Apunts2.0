/* Exercici 4

*Intercanvia els valors de dues variables del mateix tipus. Mostra-les per pantalla abans i després de fer el canvi. Per exemple si a=2 i b=3, al final a=3 i b=2.
* @author Pau Ferrer

*/
void main() {
    int a = 5;
    int b = 7;

    IO.println("Abans de l'intercanvi:");
    IO.println("a: " + a);
    IO.println("b: " + b);

    int aux = a; 
    a = b;       
    b = aux;     

    IO.println("Despres de l'intercanvi:");
    IO.println("a: " + a);
    IO.println("b: " + b);
}

