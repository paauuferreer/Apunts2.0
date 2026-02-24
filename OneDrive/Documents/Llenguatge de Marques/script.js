// Array per emmagatzemar tots els productes
let inventari = [];
let filtreActiu = 'tots';
let textCerca = '';

// EXERCICI 1 
function crearProducte(nom, categoria, preu, quantitat, proveidor) {
    // TODO: Retorna l'objecte amb les propietats id, nom, categoria, preu, quantitat, proveidor i dataCreacio.
    // Consulta l'enunciat per saber el format exacte de l'ID.
}

// Funció per calcular el valor total d'un producte
function calcularValorTotal(producte) {
    return producte.preu * producte.quantitat;
}

// Funció per afegir un producte al sistema
function afegirProducte() {
    const nom = document.getElementById('nom').value.trim();
    const categoria = document.getElementById('categoria').value;
    const preu = document.getElementById('preu').value;
    const quantitat = document.getElementById('quantitat').value;
    const proveidor = document.getElementById('proveidor').value.trim();

    // EXERCICI 2: Validacions
    // TODO: Implementa les validacions especificades a l'enunciat abans de crear el producte.

    // Creació i registre del producte
    const nouProducte = crearProducte(nom, categoria, preu, quantitat, proveidor);
    
    if (nouProducte) {
        inventari.push(nouProducte);
    }

    // Netejar el formulari
    document.getElementById('nom').value = '';
    document.getElementById('categoria').value = '';
    document.getElementById('preu').value = '';
    document.getElementById('quantitat').value = '';
    document.getElementById('proveidor').value = '';

    // Actualitzar la interfície
    mostrarInventari();
    actualitzarEstadistiques();
}

// EXERCICI 3
function obtenirEstatEstoc(quantitat) {
    // TODO: Retorna l'string corresponent a l'estat segons la quantitat.
    // Consulta la taula d'estats a l'enunciat de l'examen.    
}

// Funció per renderitzar la taula d'inventari
function mostrarInventari() {
    const cosTaula = document.getElementById('cos-taula');

    // Filtratge inicial
    let productesFiltrats = inventari;

    // EXERCICI 4: Filtre de Categoria
    // TODO: Implementa el filtratge segons la variable filtreActiu.

    // Aplicar filtre de text
    if (textCerca) {
        productesFiltrats = productesFiltrats.filter(function (p) {
            return p.nom.toLowerCase().includes(textCerca.toLowerCase()) ||
                p.proveidor.toLowerCase().includes(textCerca.toLowerCase());
        });
    }

    // Missatge si no hi ha resultats
    if (productesFiltrats.length === 0) {
        cosTaula.innerHTML = '<tr><td colspan="8" class="missatge-buit">No s\'han trobat productes</td></tr>';
        return;
    }

    // Generació de l'HTML
    let html = '';
    productesFiltrats.forEach(function (producte) {
        console.log(producte);
        const estatEstoc = obtenirEstatEstoc(producte.quantitat);
        const valorTotal = calcularValorTotal(producte);

        // EXERCICI 5: Generació HTML
        // TODO: Genera la fila <tr> amb les dades.
        // REVISA L'ENUNCIAT: Hi ha un requisit específic per a l'etiqueta <tr>.

    });

    cosTaula.innerHTML = html;
}

// Auxiliar per formatar noms de categories
function getNomCategoria(categoria) {
    const noms = {
        electronics: 'Electrònica',
        clothing: 'Roba',
        food: 'Alimentació',
        books: 'Llibres',
        toys: 'Joguines',
        other: 'Altres'
    };
    return noms[categoria] || categoria;
}

// EXERCICI 6: Implementa els càlculs estadístics
function actualitzarEstadistiques() {
    const totalProductes = inventari.length;

    // TODO: Calcula els totals requerits usant mètodes d'array (reduce/filter).
    const valorTotal = 0;
    const estocBaix = 0;
    const senseEstoc = 0;

    // Actualització del DOM
    document.getElementById('total-productes').textContent = totalProductes;
    document.getElementById('valor-total').textContent = valorTotal.toFixed(2) + '€';
    document.getElementById('estoc-baix').textContent = estocBaix;
    document.getElementById('sense-estoc').textContent = senseEstoc;
}

// Funció per modificar la quantitat d'un producte
function editarQuantitat(id) {
    const producte = inventari.find(function (p) {
        return p.id === id;
    });

    if (!producte) return;

    const novaQuantitat = prompt(`Editar quantitat de "${producte.nom}"\nQuantitat actual: ${producte.quantitat}`, producte.quantitat);

    if (novaQuantitat !== null && !isNaN(novaQuantitat)) {
        producte.quantitat = parseInt(novaQuantitat);
        mostrarInventari();
        actualitzarEstadistiques();
    }
}

// EXERCICI 7: Implementa l'eliminació d'un producte
function eliminarProducte(id) {
    // TODO: 
    // 1. Trobar el producte per ID
    // 2. Demanar confirmació a l'usuari
    // 3. Eliminar el producte de l'array 'inventari'
    // 4. Actualitzar la vista
}

// Gestió de filtres
function canviarFiltre(categoria) {
    filtreActiu = categoria;
    const botons = document.querySelectorAll('.boto-filtre');
    botons.forEach(function (boto) {
        boto.classList.remove('actiu');
    });
    event.target.classList.add('actiu');
    mostrarInventari();
}

function filtrarProductes() {
    textCerca = document.getElementById('cerca').value;
    mostrarInventari();
}

// Aqui podeu posar les dades de prova

mostrarInventari();
actualitzarEstadistiques();