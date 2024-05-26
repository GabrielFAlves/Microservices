package com.example;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Users;
import com.example.rapository.UsersRepository;

@SpringBootApplication
public class UsersserviceApplication implements CommandLineRunner {
	
	@Autowired
	private UsersRepository usersRepository;

	public static void main(String[] args) {
		SpringApplication.run(UsersserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Users users = new Users(UUID.randomUUID().toString(),"Gabriel", "gabriel@gmail.com", "123456", "ACTIVE", UUID.randomUUID().toString());
			usersRepository.save(users);
			
			System.out.println(usersRepository.findAll()); 
			
	}

}
