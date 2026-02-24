/* Simple DB module that wraps localStorage for the app.
   Exposes a synchronous API on `window.basededades`:
     - getAll() -> Array
     - saveAll(array)
     - add(item) -> item
     - remove(id)
*/
(function () {
    const KEY = 'cotxes';

    function load() {
        try {
            return JSON.parse(localStorage.getItem(KEY) || '[]');
        } catch (e) {
            return [];
        }
    }

    function saveAll(arr) {
        try {
            localStorage.setItem(KEY, JSON.stringify(arr || []));
        } catch (e) {
            console.error('Failed to save DB', e);
        }
    }

    function add(item) {
        const all = load();
        all.push(item);
        saveAll(all);
        return item;
    }

    function remove(id) {
        const all = load().filter(i => i.id !== id);
        saveAll(all);
    }

    window.basededades = {
        getAll: load,
        saveAll: saveAll,
        add: add,
        remove: remove,
    };
})();
