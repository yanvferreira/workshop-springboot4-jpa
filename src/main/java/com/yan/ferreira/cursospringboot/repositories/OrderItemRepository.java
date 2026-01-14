package com.yan.ferreira.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yan.ferreira.cursospringboot.entities.OrderItem;
import com.yan.ferreira.cursospringboot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
