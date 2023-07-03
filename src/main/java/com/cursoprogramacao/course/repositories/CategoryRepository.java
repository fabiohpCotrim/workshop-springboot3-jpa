package com.cursoprogramacao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoprogramacao.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
