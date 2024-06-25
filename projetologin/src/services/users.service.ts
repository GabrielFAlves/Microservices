import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Users } from "../model/users.model";

// const URL = 'http://localhost:3000/users';

@Injectable()
export class UsersService {
    
    private users: Users[] = [
        {
            id: 1,
            name: 'Gabriel',
            email: 'gabriel@gmail.com',
            senha: '123',
            status: 'created'
        },
        {
            id: 2,
            name: 'Gustavo',
            email: 'gustavo@gmail.com',
            senha: '123',
            status: 'created'
        },
        {
            id: 3,
            name: 'Guilherme',
            email: 'guilherme@gmail.com',
            senha: '123',
            status: 'created'
        }];

    constructor(private http: HttpClient) {

    }

    getLogin(email: string): Users | undefined{
        return this.users.find(user => user.email === email);
    }
}
