package com.devsuperior.cscommerce.services;
import com.devsuperior.cscommerce.entities.Product;
import com.devsuperior.cscommerce.dto.ProductDTO;


import com.devsuperior.cscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Optional<Product> result = repository.findById(id);
        Product product = result.get();
        return new ProductDTO(product);


    }
}


