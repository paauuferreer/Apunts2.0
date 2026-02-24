document.addEventListener('DOMContentLoaded', function() {
    const btAddUser = document.getElementById("btaddUser");
    const gestioUsers = new GestioUsers();
    const btLoadUsers = document.getElementById("btLoadUsers");

    btLoadUsers.addEventListener("click", function(event) {
        event.preventDefault();
        let users = [
            new user("John Doe", "john.doe@example.com"),
            new user("Jane Smith", "jane.smith@example.com"),
            new user("Alice Johnson", "alice.johnson@example.com")
        ];
        users.forEach(u => gestioUsers.addUser(u));
        gestioUsers.printUsers();
    });

    btAddUser.addEventListener("click", function(event) {
        event.preventDefault();
        const nameInput = document.getElementById("input-nom");
        const emailInput = document.getElementById("input-email");

        let name = nameInput.value.trim();
        let email = emailInput.value.trim();

        try {
            const newUser = new user(name, email);
            gestioUsers.addUser(newUser);
            gestioUsers.printUsers();
            nameInput.value = "";
            emailInput.value = "";
        } catch (err) {
            alert(err.message);
        }
    });
});