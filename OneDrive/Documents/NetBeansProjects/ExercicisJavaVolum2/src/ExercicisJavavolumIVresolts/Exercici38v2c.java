/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * 38 v2. Genera sencers aleatòris entre un valor màxim i un valor mínim fins que els hagis generats tots.
 * Mostra els valors generats i quantes iteracions has necessitat per aconseguir-ho.
 *
 * @author joan
 */


void main() {
    final int MAXIM = 20;
    final int MINIM = 15;
    /*Generam un array amb les posicions estrictament necessàries.*/
    /** En generar un booleà marcam la seva posicio a true  */
    boolean[] generat = new boolean[MAXIM - MINIM + 1];
    /*
     * Quan totes les posicions de l'array siguin true valdrà true i
     * acabarem.
     */
    boolean complet;
    int comptador = 0;

    for (int i = 0; i < generat.length; i++) {
        generat[i] = false;
    }
    do {
        int aleatori = MINIM + (int) (Math.random() * ((MAXIM - MINIM) + 1));
        // Hem de transformar l'aleatori a l'index que el representa.
        generat[aleatori - MINIM] = true;
        comptador++;

        IO.println("Aleatori: " + aleatori);
        //Comprova si els ha generat tots
        complet = true;

        for (int i = 0; i < generat.length && complet; i++) {
            complet = generat[i];
        }
    } while (!complet);
    System.out.printf("\nHa necessitat %d iteracions per generar-los tots\n", comptador);

}
