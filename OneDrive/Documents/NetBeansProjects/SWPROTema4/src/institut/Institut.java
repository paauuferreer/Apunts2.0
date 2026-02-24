package institut;

public class Institut {

    void main() {

        CicleArray cicle = new CicleArray("DAM", 25, 5);

        IO.println("Estat inicial CicleArray:");
        IO.println(cicle);

        Modul modul1 = new Modul("Programacio", 6);
        Modul modul2 = new Modul("Bases de Dades", 5);
        Modul modul3 = new Modul("Sistemes", 4);

        boolean afegit1 = cicle.afegirModul(modul1);
        boolean afegit2 = cicle.afegirModul(modul2);
        boolean afegit3 = cicle.afegirModul(modul3);

        IO.println("\nDespres d'afegir moduls:");
        IO.println(cicle);

        IO.println("\nResultats afegirModul:");
        IO.println(modul1.getNom() + " afegit? " + afegit1);
        IO.println(modul2.getNom() + " afegit? " + afegit2);
        IO.println(modul3.getNom() + " afegit? " + afegit3);

        IO.println("\nCercar un modul pel nom:");
        Modul trobat = cicle.tornaModul("Bases de Dades");
       
        if (trobat != null) {
            IO.println("Modul trobat: " + trobat);
        } else {
            IO.println("Modul no trobat.");
        }

        Modul noTrobat = cicle.tornaModul("Filosofia");
        if (noTrobat != null) {
            IO.println("Modul trobat: " + noTrobat);
        } else {
            IO.println("Modul 'Filosofia' no trobat.");
        }
    }
}
