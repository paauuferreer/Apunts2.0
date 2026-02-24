import java.util.Scanner;

void main() {

    double mitja = llegirDecimals();
    mostrarMitja(mitja);

}

double llegirDecimals() {
    Scanner sc = new Scanner(System.in);

    IO.print("Introduce el primer número: ");
    double a = sc.nextDouble();

    IO.print("Introduce el segundo número: ");
    double b = sc.nextDouble();

    IO.print("Introduce el tercer número: ");
    double c = sc.nextDouble();

    double mitja = (a + b + c) / 3;
    return mitja;
}

void mostrarMitja(double mitja) {
    IO.println("La mitja dels tres valors es: " + mitja);
}
