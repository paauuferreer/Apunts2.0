class user {
    constructor(name, email) {
        this.name = name;
        this.email = email;
    }

    set name(name) {
        if (name === "") {
            throw new Error("El nom no pot estar buit");
        }
        this._name = name;
    }
    
    set email(email) {
        if (email === "") {
            throw new Error("El email no pot estar buit");
        }
        this._email = email;
    }

    get name() {
        return this._name;
    }
    
    get email() {
        return this._email;
    }

    mostrarDetalls() {
        return `${this._name} - ${this._email}`;
    }
}