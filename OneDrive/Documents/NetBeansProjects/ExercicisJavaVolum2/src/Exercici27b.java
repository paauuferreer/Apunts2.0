/* Exercici 27b

*Mostra les lletres de l'alfabet i al costat indica si es tracta d'una vocal o d'una consonant. En farem tres versions:

*Amb un if per a cada vocal if() else if....

*Amb un sol if() else

*Amb un switchI amb un case per a cada vocal. Recorda posar break a cada case

*Nota: Les variables de tipus char que necessitau per aquest exercici es poden incrementar i decrementar com si fossin un int. Per exemple:

           * char lletra='A';

           * lletra++;

           * System.out.println(lletra);

           * // Mostrarà per pantalla B

* @author Pau Ferrer
*/
void main (){
    
     for (char lletra = 'A'; lletra <= 'Z'; lletra++) {
            if ("AEIOU".indexOf(lletra) != -1) {
                IO.println(lletra + " es una vocal");
            } else {
                IO.println(lletra + " es una consonant");
            }
        }
}
    
