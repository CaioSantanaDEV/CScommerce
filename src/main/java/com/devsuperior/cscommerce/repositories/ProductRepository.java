package com.devsuperior.cscommerce.repositories;

import com.devsuperior.cscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
