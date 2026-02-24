/* Exercici 29

*Escriu un programa que llegeixi un sencer de l'1 al 12 del teclat i ens digui el nombre de dies que té el mes corresponent. 
*Suposarem que febrer sempre té 28 dies.

* @author Pau Ferrer

 */
void main () {
  
    int mes = 2;
    int dies;
    int any = 2023;
    boolean traspas= (any % 4 == 0 && any % 100 != 0) || (any % 400 == 0);

    
    switch (mes) {
       
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            dies = 31;
            break;
            
        case 4:
        case 6:
        case 9:
        case 11:
            dies = 30;
            break;
            
        case 2:
             if (traspas) dies = 29;
            else dies = 28;
            break;
            
            default:
            IO.println("Numero de mes incorrecte");
             return;
             
             
        }
    
        IO.println("el mes " + mes + " te " +dies+ " dies.");
        
        
 }
            
    