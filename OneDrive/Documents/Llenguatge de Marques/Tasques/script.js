// Elements
const inputTasca = document.getElementById("inputTasca");
const botoAfegir = document.getElementById(".boto-afegir");
const llistaTasques = document.getElementById("llistaTasques");
const botoEliminarTot = document.getElementById(".boto-eliminar-tot");
const estadistiques = document.getElementById("estadistiques");
const filtres = document.getElementById(".boto-filtre");

//Estat

let tasques = [];
let filtreActual = "Totes";

//Funcions

//Boto-afegir

botoAfegir.addEventListener("click", () => {
    const text = inputTasca.value.trim();
    if (text === "") return;

    tasques.push({ text, completada: false});
    inputTasca.value = "";

    renderTasques();
});

function renderTasques(){
    llistaTasques.innerHTML = "";

    if (tasques.length === 0) {
        llistaTasques.innerHTML =`
        <li class="missatge-buit">
            No hi ha tasques. Afageix-ne una!
            </li>
         `;
        return;
    }

    tasques.forEach((tasca) => {
        const li = document.createElement("li");
        li.classList.add("tasca");

        li.innerHTML=`
            <input type="checkbox" class="checkbox">
            span class="text-tasca">${tasca.text}</span>
            <button class="boto-eliminar">X</button>
        `;
        llistaTasques.appendChild(li);
    });
}