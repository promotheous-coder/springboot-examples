package com.luv4code.springdatajpa.productrepository;

import com.luv4code.springdatajpa.productentity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
