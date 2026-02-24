import OrdenacioICerca.Ordenacio;

    void main() {

        int[] dades = {9, 4, 6, 2, 8, 1};

        IO.println("Array original:");
        IO.println(Arrays.toString(dades));

        Ordenacio.insertSort(dades);

        IO.println("Array ordenat amb insertSort:");
        IO.println(Arrays.toString(dades));
    }

