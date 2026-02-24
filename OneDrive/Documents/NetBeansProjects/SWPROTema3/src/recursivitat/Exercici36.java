 /** Exercici 36

*(Opcional) Escriviu fitxer amb un un mètode recursiu que ens digui si una cadena de caràcters és simètrica.

* @author Pau Ferrer

*/

    public static boolean esSimetrica(String s) {

        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }


        String interior = s.substring(1, s.length() - 1);

        return esSimetrica(interior);
    }

    void main() {

        String paraula = "soosooss";   

        if (esSimetrica(paraula)) {
            IO.println("La paraula es simetrica.");
        } else {
            IO.println("La paraula NO es simetrica.");
        }
    
}
