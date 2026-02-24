
package trastos;

/**
 *
 * @author bypau
 */
public class ProvaTrasto {
    
    
    void main() {

        Trasto.setContador(10);
        IO.println("Contador inicial: " + Trasto.getContador());

        Trasto t1 = new Trasto("Cadira");
        Trasto t2 = new Trasto("Taula");
        Trasto t3 = new Trasto("Lampara");

        Trasto.setContador(25);

        IO.println("Contador vist des de t2: " + Trasto.getContador());

        IO.println(t1);
        IO.println(t2);
        IO.println(t3);
    }
    
}
