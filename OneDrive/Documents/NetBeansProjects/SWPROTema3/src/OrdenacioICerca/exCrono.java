 import OrdenacioICerca.Ordenacio;

    public static void main(String[] args) {

        Cronometre c = new Cronometre();

        c.start();

        for (int i = 0; i < 1_000_000; i++) {
            int x = i * i;
        }

        c.stop(); 

        IO.println("Temps mitja (nanosegons): " + c.temps());
    }

