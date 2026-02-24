/* Exercici 12

*A l'exercici 5 afegeix el codi necessari per calcular l'IRPF. Suposa que si el salari no arriba a 300€ l'IRPF=10%, si esta entre 300 i 500 és el 20% i si és major o igual és el 30%. Mostra al final el salari brut, l'import de l'IRPF i el salari net.
* @author Pau Ferrer

*/

void main() {
    
    int hores = 200;
        double preu = 25;
        double hExtra = 0;
        double souBrut = 0;
        double souNet = 0;
        int irpf = 0;
        
        if (hores > 40) {
            hExtra = hores - 40;
        }
        
        souBrut = (hores - hExtra) * preu + (hExtra * (preu * 2));
        
        if (souBrut < 300) {
            irpf = 10;
        } else if (souBrut < 500) {
            irpf = 20;
        } else {
            irpf = 30;
        }

        souNet = souBrut - (souBrut * irpf / 100);
            
            IO.println (souBrut);
            IO.println (irpf+"%");
            IO.println (souNet);

        
}