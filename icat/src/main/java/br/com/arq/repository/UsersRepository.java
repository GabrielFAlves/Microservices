package br.com.arq.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.arq.entity.Users;

//CRTL + SHIFT + O

@Repository
public interface UsersRepository extends JpaRepository<Users,Long>{

	public Users findByEmail(String email);
	public List<Users> findByName(String name);
	
}
