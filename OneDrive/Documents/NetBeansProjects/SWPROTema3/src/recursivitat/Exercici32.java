 /** Exercici 32

*  Escriu fitxer amb un mètode que calculi el terme n-essim de la sèrie de Fibonacci de forma recursiva. 
* Des del main crida aquest mètode per a mostrar els 10 primers termes de la successió.

* @author Pau Ferrer

*/

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;          
        }
        if (n == 1) {
            return 1;          
        }
        return fibonacci(n - 1) + fibonacci(n - 2);    
    }

    void main() {

        IO.println("Els 10 primers termes de Fibonacci son:");

        for (int i = 0; i < 10; i++) {
            IO.print(fibonacci(i) + " ");
        }
    }

