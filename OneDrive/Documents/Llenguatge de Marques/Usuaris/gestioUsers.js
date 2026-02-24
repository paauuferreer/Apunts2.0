class GestioUsers {
    constructor() {
        this.users = [];
    } 
    addUser(user) {
        this.users.push(user);
    }  

    removeUser(user) {
        this.users = this.users.filter(u => u.email !== user.email);
    }

    printUsers() {
        const listElement = document.getElementById("user-List");
        listElement.innerHTML = "";
        this.users.forEach(u => {
            let li = document.createElement("li");
             li.textContent = u.mostrarDetalls();
            listElement.appendChild(li);
        });

    }
}