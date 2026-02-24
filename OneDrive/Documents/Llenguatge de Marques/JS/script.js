/*
function ex1() {
let fruites = ['poma', 'pera', 'taronja', 'kiwi', 'Rem'];

for (let i =0; i <5; i++){
	console.log(fruites[i]);
}
}

ex1();

function ex2() {
let i = 0;
while (i <= 10) {
	console.log(i);
	i++;
}
}

ex2();

function ex3(max){
  return Math.floor(Math.random() * max);
}

console.log(ex3(100));

ex3();

function ex4(){
	let n = 3;
	if (n % 2 == 0){
		 console.log("Es parell")
} else {
			console.log("No es parell")
}
}

ex4();

function ex5(nom){
	console.log(`Hola, ${nom}!`);
}
ex5 ('Pau');

function ex6(radi) {
  return 2 * Math.PI * radi;
}
console.log(ex6(2)); 

function ex7(){
let n1 = parseFloat (prompt("Introdueix el primer nombre"));
let n2 = parseFloat (prompt("Introdueix el segon nombre"));

let suma = n1 + n2;
let resta = n1 - n2;
let multiplicacio = n1 * n2;
let divisio = n2 !== 0 ? n1 / n2 : "No es pot dividir entre 0";

alert(
  "Suma: " + suma + "\n" +
  "Resta: " + resta + "\n" +
  "Multiplicacio: " + multiplicacio + "\n" +
  "Divisio: " + divisio
);
}

function ex8(){
	const persona = {
		nom: 'Pau',
		edat: 18,
		profesio: 'Estudiant',
	};
	console.log(persona.nom, persona.edat, persona.profesio)
}

ex8();

function ex9(){
	let n1 = 6;
	let n2 = 6;

	if (n1 > n2){
		console.log("Es mes gran")
	}else if (n1 < n2){
		console.log("Es mes petit")
	}else{
		console.log("Son iguals")
	}
}

ex9();


function ex10(){
    let frase = prompt("Escriu una frase: ");
    let contador = 0;
    function comptarVocals(){
        for(let i = 0; i < frase.length; i++){
            let caracter = frase[i].toLowerCase();
            if(caracter==="a" || caracter==="e" || caracter==="i" || caracter==="o" || caracter==="u"){
                contador++;
            }
        }
        console.log(frase);
        console.log("Aquesta frase te " + contador + " vocals");
    }
    comptarVocals();

}

ex10();

function ex11(){

	let numeros = [1, 3, 5, 7, 8];
	let suma = 0;
		for (let i= 0; i < numeros.length; i++){
			suma = suma + numeros[i];
		}
		console.log(suma);

}

ex11();

function ex12(){

const cotxe = {

	marca: 'hyundai',
	model: 'coupe',
	any: 2004,

};
	if (cotxe.any <= 2016){
		console.log("El cotxe te mes de 10 anys");
	}else{
		console.log("El cotxe te menys de 10 anys");
	}

}

ex12();

function ex13(){
	let repetir = "la frase";
	let numeros = 5;
		for (let i= 0; i < numeros; i++){
			console.log(repetir);
		}
}

ex13();

function ex14(){
	let nota = 10;

	switch(nota){
	case 1 :
	case 2 :
	case 3 :
	case 4 :
		console.log ('Insuficient');
	break;
	case 5 :
		console.log('Suficient');
	break;
	case 6 :
		console.log('Be');
	break;
	case 7 :
	case 8 :
		console.log('Notable');
	break;
	case 9 :
	case 10 :
		console.log('Exelent');

	}
}

ex14();

function ex15(){
	let adivinar = prompt ("Escriu una nombre enter") ;
	let numero = Math.floor(Math.random() * (10 - 1 + 1)) + 1;
	if (adivinar == numero){
		console.log("L'has adavinat");
		console.log ("El valor es: " + numero);
	}else{
		console.log("Has fallat, torna a probar");
		console.log ("El valor es: " + numero);

	}

}

ex15();

function ex16(){

	let frase = " pasar a majuscules";
	let majuscules = frase.toUpperCase();
	let lletra = prompt ("Escriu una lletra");
	let comptador = 0;

	for (let i = 0; i < frase.length; i++){
		if (frase[i] === lletra){
			comptador++;
		}
	}

	console.log(majuscules);
	console.log("El text conte la lletra " + lletra + " " + comptador + " pics")

	
}

ex16();
*/

function ex17(){

	let array = ["Pau", "Fran", "Marc", "Lluis", "Pep", "Adria", "Alfonso"];
	let resultat = [];

	for (let i = 0; i < array.length; i++){
		if (array[i][0] === "A"){
			resultat.push(array[i]);

		}
	}

	console.log(resultat);
}

ex17();