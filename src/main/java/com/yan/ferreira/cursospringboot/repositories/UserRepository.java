package com.yan.ferreira.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yan.ferreira.cursospringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
