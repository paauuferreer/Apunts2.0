// Array per emmagatzemar tots els productes
let inventari = [];
let filtreActiu = 'tots';
let textCerca = '';

// EXERCICI 1: 
function crearProducte(nom, categoria, preu, quantitat, proveidor) {
    // ID: NOM-CATEGORIA-Timestamp
    const id = nom.toUpperCase() + "-" + categoria.toUpperCase() + "-" + Date.now();
    
    return {
        id: id,
        nom: nom,
        categoria: categoria,
        preu: parseFloat(preu),
        quantitat: parseInt(quantitat),
        proveidor: proveidor,
        dataCreacio: new Date().toLocaleString()
    };
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
    if (nom === "" || proveidor === "") {
        alert("El nom i el proveïdor són obligatoris.");
        return;
    }
    if (preu <= 0 || preu === "") {
        alert("El preu ha de ser un número positiu.");
        return;
    }
    if (quantitat < 0 || quantitat === "") {
        alert("La quantitat no pot ser negativa.");
        return;
    }
    if (categoria === "") {
        alert("Has de seleccionar una categoria.");
        return;
    }

    // Creació i registre del producte
    const nouProducte = crearProducte(nom, categoria, preu, quantitat, proveidor);
    
    if (nouProducte) {
        inventari.push(nouProducte);
        
        // Netejar el formulari
        document.getElementById('nom').value = "";
        document.getElementById('preu').value = "";
        document.getElementById('quantitat').value = "";
        document.getElementById('proveidor').value = "";
        
        mostrarInventari();
        actualitzarEstadistiques();
    }
}

//Gestio de la taula:
function mostrarInventari() {
    const cosTaula = document.getElementById('cos-taula');
    
    // Netejar el contingut actual 
    cosTaula.innerHTML = '';

    // EXERCICI 3: Filtratge 
    const productesFiltrats = inventari.filter(function(p) {
        const coincideixFiltre = filtreActiu === 'tots' || p.categoria === filtreActiu;
        const coincideixCerca = p.nom.toLowerCase().includes(textCerca.toLowerCase());
        return coincideixFiltre && coincideixCerca;
    });

    if (productesFiltrats.length === 0) {
        cosTaula.innerHTML = '<tr><td colspan="8" class="missatge-buit">No s\'han trobat productes.</td></tr>';
        return;
    }

    // EXERCICI 4: Generació de files
    productesFiltrats.forEach(function(p) {
        const valorTotal = calcularValorTotal(p);
        const fila = document.createElement('tr');
        
        // EXERCICI 5: Estoc baix (menys de 5 unitats)
        const classeEstoc = p.quantitat < 5 ? 'stock-baix' : '';

        fila.innerHTML = `
            <td>${p.id}</td>
            <td>${p.nom}</td>
            <td><span class="badge badge-${p.categoria}">${p.categoria}</span></td>
            <td>${p.preu.toFixed(2)}€</td>
            <td class="${classeEstoc}">${p.quantitat}</td>
            <td>${valorTotal.toFixed(2)}€</td>
            <td>${p.proveidor}</td>
            <td>
                <div class="accions">
                    <button class="boto boto-accio boto-editar" onclick="editarQuantitat('${p.id}')">Editar</button>
                    <button class="boto boto-accio boto-eliminar" onclick="eliminarProducte('${p.id}')">Eliminar</button>
                </div>
            </td>
        `;
        cosTaula.appendChild(fila);
    });
}

// EXERCICI 6: Actualitzar Estadistiques
function actualitzarEstadistiques() {
    const totalProductes = inventari.length;
    
    // Calcular valor total utilizant reduce 
    let valorTotalInventari = 0;
    inventari.forEach(function(p) {
        valorTotalInventari += calcularValorTotal(p);
    });

    const estocBaix = inventari.filter(function(p) { 
        return p.quantitat > 0 && p.quantitat < 5; 
    }).length;
    
    const senseEstoc = inventari.filter(function(p) { 
        return p.quantitat === 0; 
    }).length;

    // Actualització del DOM
    document.getElementById('total-productes').textContent = totalProductes;
    document.getElementById('valor-total').textContent = valorTotalInventari.toFixed(2) + '€';
    document.getElementById('estoc-baix').textContent = estocBaix;
    document.getElementById('sense-estoc').textContent = senseEstoc;
}

// Funció per modificar la quantitat d'un producteç

function editarQuantitat(id) {
    const producte = inventari.find(function (p) {
        return p.id === id;
    });

    if (!producte) return;

    const novaQuantitat = prompt(`Editar quantitat de "${producte.nom}"\nQuantitat actual: ${producte.quantitat}`, producte.quantitat);

    if (novaQuantitat !== null && !isNaN(novaQuantitat) && novaQuantitat.trim() !== "") {
        producte.quantitat = parseInt(novaQuantitat);
        mostrarInventari();
        actualitzarEstadistiques();
    }
}

// EXERCICI 7: Implementa l'eliminació d'un producte
function eliminarProducte(id) {
    // 1. Trobar el producte per ID per a la confirmació
    const producte = inventari.find(function(p) {
        return p.id === id;
    });

    if (!producte) return;

    // 2. Demanar confirmació
    const confirmar = confirm("Estás segur que vols eliminar el producte: " + producte.nom + "?");

    if (confirmar) {
        // 3. Eliminar de l'array
        inventari = inventari.filter(function(p) {
            return p.id !== id;
        });

        // 4. Actualitzar la vista
        mostrarInventari();
        actualitzarEstadistiques();
    }
}

// Gestió de filtres
function canviarFiltre(categoria) {
    filtreActiu = categoria;
    const botons = document.querySelectorAll('.boto-filtre');
    botons.forEach(function (boto) {
        if (boto.textContent.toLowerCase() === categoria.toLowerCase() || 
           (categoria === 'tots' && boto.textContent.toLowerCase() === 'tots els productes')) {
            boto.classList.add('actiu');
        } else {
            boto.classList.remove('actiu');
        }
    });
    mostrarInventari();
}

// EXERCICI 8: Cercador en temps real
document.getElementById('cerca').addEventListener('input', function(e) {
    textCerca = e.target.value;
    mostrarInventari();
});

// Inicialització
mostrarInventari();
actualitzarEstadistiques();