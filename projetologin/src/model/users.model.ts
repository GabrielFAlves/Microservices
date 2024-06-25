export class Users{

    id ?: number;
    name ?: string;
    email ?: string;
    senha ?: string;
    status ?: string;

    constructor(
        id ?: number,
        name ?: string,
        email ?: string,
        senha ?: string,
        status ?: string,
    ){
        this.id = id;
        this.name = name;
        this.email = email;
        this.senha = senha;
        this.status = status;
    }

    
}