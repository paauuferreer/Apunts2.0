//Calcula la longitud d'una circumfència a partir del radi.
//2 * PI * r

void main(){
	String valor=IO.readln("Escriu el valor del radi: );
	double radi = Double.parseDouble(valor);
	final double PI = 3,14159;
	double longitud = 2 * PI * radi;
	IO.println("La longitud de la circurferència és: " + longitud);
}