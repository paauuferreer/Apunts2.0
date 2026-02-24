function calculadora() {
    console.log("Se està obrint l'script");

    let display = document.getElementById("display");
    let num1 = null;
    let num2 = null;
    let operacio = null;

    let botons = document.querySelectorAll("button");

    // Funcions modulars
    function sumar(a, b) { return a + b; }
    function restar(a, b) { return a - b; }
    function multiplicar(a, b) { return a * b; }
    function dividir(a, b) { return a / b; }

    botons.forEach(boton => {
        boton.addEventListener("click", function () {

            let valor = boton.textContent;
            console.log("Botón pulsado:", valor);

            // Números
            if (valor >= "0" && valor <= "9") {
                display.value += valor;

            // Decimal
            } else if (valor === ".") {
                if (!display.value.includes(".")) {
                    display.value += ".";
                }

            // Operacions
            } else if (valor === "+" || valor === "-" || valor === "*" || valor === "/") {
                if (display.value !== "") { // solo si hay un número
                    num1 = Number(display.value);
                    operacio = valor;
                    display.value = "";
                }

            // Igual
            } else if (valor === "=") {
                if (operacio && display.value !== "") {
                    num2 = Number(display.value);
                    let resultat;

                    switch (operacio) {
                        case "+":
                            resultat = sumar(num1, num2);
                            break;
                        case "-":
                            resultat = restar(num1, num2);
                            break;
                        case "*":
                            resultat = multiplicar(num1, num2);
                            break;
                        case "/":
                            resultat = (num2 === 0) ? "Error" : dividir(num1, num2);
                            break;
                    }

                    display.value = resultat;

                    // reset opcional per seguir calculant
                    num1 = resultat === "Error" ? null : resultat;
                    num2 = null;
                    operacio = null;
                }

            // borrar tot
            } else if (valor === "C") {
                display.value = "";
                num1 = null;
                num2 = null;
                operacio = null;

            // borrar display
            } else if (valor === "CE") {
                display.value = "";

            // borrar darrer digit
            } else if (valor === "DEL") {
                display.value = display.value.slice(0, -1);
            }

        });
    });
}

calculadora();
