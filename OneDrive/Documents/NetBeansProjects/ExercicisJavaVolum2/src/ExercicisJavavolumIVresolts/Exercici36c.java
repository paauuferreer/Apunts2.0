

/**
 * 36. Escriviu una classe que ompli aleatòriament un un array d'entre dos i quatre sencers i
 * l'ordeni (com a l'exercici 12). Heu d'assegurar-vos que l'array tengui tres
 * posicions. Si es pot ordenar(per que tengui tres posicions) ha de mostrar per pantalla l'array ordenat. Si
 * no ha d'avisar que no ho pot ordenar.
 *
 * @author joan
 */


void main() {

    int longitud = 2 + (int) (Math.random() * 3);
    int[] vector = new int[longitud];

    for (int index = 0; index < vector.length; index++) {
        vector[index] = 1 + (int) (Math.random() * 101);
    }

    if (vector.length != 3) {
        IO.println("La longitud de l'array és " + longitud + " i només puc ordenar-lo si es de tres posicions");
    } else {
        //Mostrar-lo desordenat
        IO.println("Array original");
        for (int index = 0; index < vector.length; index++) {
            System.out.print(vector[index] + "\t");
        }
        IO.println("");
        //Col·locam el major a c
        if (vector[0] > vector[1]) {
            int aux = vector[0];
            vector[0] = vector[1];
            vector[1] = aux;
        }
        if (vector[0] > vector[2]) {
            int aux = vector[0];
            vector[0] = vector[2];
            vector[2] = aux;
        }
        //Colocam els altres dos.
        if (vector[1] > vector[2]) {
            int aux = vector[2];
            vector[2] = vector[1];
            vector[1] = aux;
        }
        //Mostrar-lo ordenat
        IO.println("Array ordenat");
        for (int index = 0; index < vector.length; index++) {
            System.out.print(vector[index] + "\t");
        }
        IO.println("");
    }
}
