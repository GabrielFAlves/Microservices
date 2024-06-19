package com.example.rapository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {

    public Users findByEmail(String email);
    public List<Users> findByName(String name);

}
