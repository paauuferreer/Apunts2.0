import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        int a = input.nextInt();

        System.out.print("b: ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("El major és a: " + a);
        } else if (b > a) {
            System.out.println("El major és b: " + b);
        } else {
            System.out.println("Els dos nombres són iguals.");
        }

        input.close();
    }
}
