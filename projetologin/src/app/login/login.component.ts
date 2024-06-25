import { Component } from '@angular/core';
import { UsersService } from '../../services/users.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  email: string = '';
  senha: string = '';
  erro_msg: string = '';

  constructor(private service: UsersService, private router: Router) {

  }

  login() {
    const user = this.service.getLogin(this.email);

    if (user) {
      if (user.senha === this.senha) {
        localStorage.setItem('user', JSON.stringify(user));
        this.router.navigate(['/home']);
      } else {
        this.erro_msg = 'Senha incorreta';
      }
    } else {
      this.erro_msg = 'Usuário não encontrado';
    }
  }

}
