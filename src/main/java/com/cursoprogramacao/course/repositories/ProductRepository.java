package com.cursoprogramacao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoprogramacao.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
