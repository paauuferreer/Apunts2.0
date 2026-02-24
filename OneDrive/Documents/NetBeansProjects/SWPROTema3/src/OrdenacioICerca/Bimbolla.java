import OrdenacioICerca.Ordenacio;

    void main() {

        int[] dades = {6, 2, 9, 1, 4};

        IO.println("Array original:");
        IO.println(Arrays.toString(dades));

        Ordenacio.bimbolla(dades);

        IO.println("Array ordenat amb bimbolla:");
        IO.println(Arrays.toString(dades));
    }
