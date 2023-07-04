package com.cursoprogramacao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoprogramacao.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
