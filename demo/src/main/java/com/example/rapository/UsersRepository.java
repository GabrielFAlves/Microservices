package com.example.rapository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Users;

public interface UsersRepository extends JpaRepository<Users, String> {

}
