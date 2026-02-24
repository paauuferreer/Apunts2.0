import java.util.Scanner;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demanam el nombre de notes
        System.out.print("Introdueix el nombre de notes: ");
        int numNotes = sc.nextInt();

        double[] notes = new double[numNotes];

        // Llegim les notes
        for (int i = 0; i < numNotes; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notes[i] = sc.nextDouble();
        }

        // Mostram les notes
        mostrarNotes(notes);

        // Calculam i mostram la mitjana
        double mitjana = calcularMitjana(notes);
        System.out.println("La mitjana és: " + mitjana);

        sc.close();
    }

    // Mètode que mostra les notes
    public static void mostrarNotes(double[] notes) {
        System.out.print("Notes: ");
        for (int i = 0; i < notes.length; i++) {
            System.out.print(notes[i] + " ");
        }
        System.out.println();
    }

    // Mètode que calcula la mitjana
    public static double calcularMitjana(double[] notes) {
        double suma = 0;
        for (int i = 0; i < notes.length; i++) {
            suma += notes[i];
        }
        return suma / notes.length;
    }

