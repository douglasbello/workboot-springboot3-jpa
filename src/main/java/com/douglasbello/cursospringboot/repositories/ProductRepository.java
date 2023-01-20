package com.douglasbello.cursospringboot.repositories;

import com.douglasbello.cursospringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
