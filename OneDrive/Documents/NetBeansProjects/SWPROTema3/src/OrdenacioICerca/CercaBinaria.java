import OrdenacioICerca.Ordenacio;

    void main() {

        int[] dades = {1, 3, 5, 7, 9, 11};
        int cercat = 7;

        int posicio = Ordenacio.CercaBinaria(dades, cercat);

        if (posicio != -1) {
            IO.println("Valor trobat en la posicio: " + posicio);
        } else {
            IO.println("Valor no trobat");
        }
    }





