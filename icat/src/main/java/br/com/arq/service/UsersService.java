package br.com.arq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.arq.entity.Users;
import br.com.arq.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository repository;
	
	public Users saveUsers(Users users) {
		Users resp = repository.save(users);
		return resp;		
	}
	
	public List<Users> users() {
		List<Users> resp = repository.findAll();
		return resp;
	}
	
}
