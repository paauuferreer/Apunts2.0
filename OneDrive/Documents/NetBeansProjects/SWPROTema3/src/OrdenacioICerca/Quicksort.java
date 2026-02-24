import OrdenacioICerca.Ordenacio;

    void main() {

        int[] dades = {8, 3, 7, 4, 9, 2, 6};

        IO.println("Array original:");
        IO.println(Arrays.toString(dades));

        Ordenacio.quickSort(dades, 0, dades.length - 1);

        IO.println("Array ordenat amb quickSort:");
        IO.println(Arrays.toString(dades));
    }

