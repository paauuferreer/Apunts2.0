import java.util.Scanner;

public class MajorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix el primer nombre (a): ");
        int a = input.nextInt();

        System.out.print("Introdueix el segon nombre (b): ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("El major és a: " + a);
        } else if (b > a) {
            System.out.println("El major és b: " + b);
        } else {
            System.out.println("Els dos nombres són iguals.");
        }g

        input.close();
    }
}
