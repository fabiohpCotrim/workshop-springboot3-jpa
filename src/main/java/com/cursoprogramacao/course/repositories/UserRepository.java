package com.cursoprogramacao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoprogramacao.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
