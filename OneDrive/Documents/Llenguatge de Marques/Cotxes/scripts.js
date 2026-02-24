document.addEventListener('DOMContentLoaded', function () {
	var tipo = document.getElementById('tipo');
	var marca = document.getElementById('marca');
	var model = document.getElementById('model');
	var anyInput = document.getElementById('any');
	var portes = document.getElementById('portes');
	var btnAfegir = document.getElementById('btn-afegir');
	var emptyState = document.getElementById('empty-state');
	var mainContent = document.querySelector('.main-content');

	var KEY = 'cotxes';
	var vehicles = JSON.parse(localStorage.getItem(KEY) || '[]');

	function save() {
		localStorage.setItem(KEY, JSON.stringify(vehicles));
	}

	function render() {
		var old = mainContent.querySelector('.vehicles-list');
		if (old) old.remove();

		if (vehicles.length === 0) {
			emptyState.style.display = '';
			return;
		}

		emptyState.style.display = 'none';

		var list = document.createElement('div');
		list.className = 'vehicles-list';

		for (var i = 0; i < vehicles.length; i++) {
			var v = vehicles[i];
			var card = document.createElement('div');
			card.className = 'vehicle-card';
			var html = '<h3>' + (v.marca || '') + ' ' + (v.model || '') + '</h3>' +
				'<p>Tipus: ' + (v.tipo || '') + '</p>' +
				'<p>Any: ' + (v.any || '') + '</p>' +
				'<p>Portes: ' + (v.portes || '') + '</p>' +
				'<button class="btn-delete" data-id="' + v.id + '">Eliminar</button>';
			card.innerHTML = html;
			list.appendChild(card);
		}

		mainContent.appendChild(list);
	}

	function addVehicle() {
		var v = {
			id: Date.now().toString(),
			tipo: tipo ? tipo.value : '',
			marca: marca ? marca.value : '',
			model: model ? model.value : '',
			any: anyInput ? anyInput.value : '',
			portes: portes ? portes.value : ''
		};

		if (!v.marca || !v.model) {
			alert('Introdueix almenys la marca i el model.');
			return;
		}

		vehicles.push(v);
		save();
		render();

		if (tipo) tipo.selectedIndex = 0;
		if (marca) marca.value = '';
		if (model) model.value = '';
		if (anyInput) anyInput.value = '';
		if (portes) portes.value = '';
	}

	if (btnAfegir) btnAfegir.addEventListener('click', addVehicle);

	if (mainContent) {
		mainContent.addEventListener('click', function (e) {
			var target = e.target;
			if (target && target.classList && target.classList.contains('btn-delete')) {
				var id = target.getAttribute('data-id');
				if (confirm('Eliminar aquest vehicle?')) {
					var newList = [];
					for (var j = 0; j < vehicles.length; j++) {
						if (vehicles[j].id !== id) newList.push(vehicles[j]);
					}
					vehicles = newList;
					save();
					render();
				}
			}
		});
	}

	if (portes) {
		portes.addEventListener('keydown', function (e) {
			if (e.key === 'Enter') addVehicle();
		});
	}

	render();
});