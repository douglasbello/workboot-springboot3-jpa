package com.douglasbello.cursospringboot.repositories;

import com.douglasbello.cursospringboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
