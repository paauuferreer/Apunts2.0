(function (){
    const KEY = 'cotxes';
    
    function load(){
        try {
            return JSON.parse(localStorage.getItem(KEY)) || [];
        } catch (e) {
            return [];
        }
    }

    function saveAll(arr) {
        try {
            localStorage.setItem(KEY, JSON.stringify(arr || []));
        } catch (e) {
            console.error("Error guardant dades", e);
        }
    }

    function add(item) {
        const all = load();
        all.push(item);
        saveAll(all);
        return item;
    }

    function remove(id) {
        const all = load();
        const filtered = all.filter(i => i.id !== id);
        saveAll(filtered);
    }

    window.basededades = {
        getAll: load,
        saveAll: saveAll,
        add: add,
        remove: remove
    };
})();
