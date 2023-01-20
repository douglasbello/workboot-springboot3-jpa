package com.douglasbello.cursospringboot.repositories;

import com.douglasbello.cursospringboot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
