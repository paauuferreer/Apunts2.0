/* Exercici 3

*Donat un temps expressat en segons, descomposa'l en hores, minuts i segons. 1 Hora = 3600 segons i 1 minut= 60 segons. Per exemple 3662 ens ha de donar 1 hora, 1 minut i 2 segons.

* @author Pau Ferrer

*/
void main() {

    int introduit = 6500;
    int hores = introduit / 3600;
    int restant = introduit - (hores * 3600);
    int minuts = restant / 60;
    int restant1 = restant - (minuts * 60);
    int segons = restant1;
    
          IO.println("Hores: "+hores );
             IO.println("Minuts: "+minuts );
                IO.println("Segons: "+segons );





}