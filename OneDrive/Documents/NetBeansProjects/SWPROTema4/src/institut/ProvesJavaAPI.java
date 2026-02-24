
package institut;

/**
 *
 * @author bypau
 */
public class ProvesJavaAPI {
    
    void main() {

        //BOXING / UNBOXING
        Integer a = 10;
        Integer b = 5;

        int suma = a + b;  // unboxing automàtic
        IO.println("Suma: " + suma);

        // MATH
        IO.println("Potencia 2^3: " + Math.pow(2, 3));
        IO.println("Log(10): " + Math.log(10));
        IO.println("Sin(45°): " + Math.sin(Math.toRadians(45)));
        IO.println("Cos(45°): " + Math.cos(Math.toRadians(45)));

        // STRING API
        String text = "Joan, Toni, Miquel";

        // Majúscules
        IO.println("Majuscules: " + text.toUpperCase());

        // Substring
        IO.println("Part del text: " + text.substring(0, 4));

        // Split
        String[] noms = text.split(",");
        for (String nom : noms) {
            IO.println("Nom: " + nom.trim());
        }

        // Treure primer caràcter
        IO.println("Sense primer caracter: " + text.substring(1));
    }
}

    
