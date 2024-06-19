package br.com.arq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.arq.entity.Users;
import br.com.arq.service.UsersService;

@RestController
@RequestMapping("/api/users")
@ResponseBody
public class UsersController {

	@Autowired
	private UsersService service;
	
	//Rota ou Route
	@PostMapping("/salvar")
	public ResponseEntity<?> salvar(@RequestBody Users users) {
		try {
			Users resp = service.saveUsers(users);
			return ResponseEntity.ok(resp);
		}catch(Exception ex) {
			return ResponseEntity.status(500).body(ex.getMessage());
		}
	}
	
	@GetMapping("/listar")
	public ResponseEntity<?> listar() {
		return ResponseEntity.status(200).body(service.users());
	}
	
	
}
