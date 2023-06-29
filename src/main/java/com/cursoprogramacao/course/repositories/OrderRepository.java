package com.cursoprogramacao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoprogramacao.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
