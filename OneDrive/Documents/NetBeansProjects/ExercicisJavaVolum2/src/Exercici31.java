/* Exercici 31

*Mostra un sencer aleatori entre un valor màxim i un mínim. Per a generar els números aleatòriament pots utilitzar Math.random(). 
*Torna un double entre 0 i 1 (no inclòs). Per obtenir un nombre dins el rang demanat [min, max] inclosos, hauràs de fer...
* @author Pau Ferrer

 */
void main (){
    
    int min = 0;
    int max = 1;
    double aleatori = min +(Math.random()*(max-min));
        IO.println(aleatori);
}