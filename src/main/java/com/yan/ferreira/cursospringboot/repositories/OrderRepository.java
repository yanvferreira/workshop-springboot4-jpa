package com.yan.ferreira.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yan.ferreira.cursospringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
