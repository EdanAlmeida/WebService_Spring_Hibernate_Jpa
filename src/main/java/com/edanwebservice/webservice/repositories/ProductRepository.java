package com.edanwebservice.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edanwebservice.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
