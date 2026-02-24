/* Exercici 5
 *A partir d'un sencer que representa les hores treballades per un/a treballador/a i un real que representa el preu en € de cada hora, calcula que ha de cobrar aquesta persona en acabar la setmana. Suposa que totes les hores extra, les que passen de 40, doblen el preu.
* @author Pau Ferrer
*/

void main() {
    
    int hores= 50;
    double preu= 25;
    double hExtra = 0;
    double sou = 0;
    
    hExtra = hores-40;
    
    if (hores<40){
        hExtra = 0;
        
    }else{
    sou = (hores - hExtra) * preu + (hExtra *(preu *2));   
    }
   
    IO.println (sou);
    
        

}
