package com.douglasbello.cursospringboot.repositories;

import com.douglasbello.cursospringboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
