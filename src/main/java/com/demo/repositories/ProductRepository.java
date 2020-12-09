package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.demo.entities.Product;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
