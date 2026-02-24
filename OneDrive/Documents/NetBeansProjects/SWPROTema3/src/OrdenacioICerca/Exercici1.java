import OrdenacioICerca.Ordenacio;

    void main() {

        int[] dades = {8, 4, 6, 2, 9, 1};
        int cercat = 6;

        IO.println("Array original:");
        IO.println(Arrays.toString(dades));

        Ordenacio.bimbolla(dades);

        IO.println("Array ordenado:");
        IO.println(Arrays.toString(dades));

        int pos = Ordenacio.CercaBinaria(dades, cercat);

        if (pos != -1) {
            IO.println("El valor " + cercat + " esta en la posicion " + pos);
        } else {
            IO.println("El valor no se encuentra en el array");
        }
    }

