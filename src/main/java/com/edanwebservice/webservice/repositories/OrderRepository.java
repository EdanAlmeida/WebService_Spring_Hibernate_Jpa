package com.edanwebservice.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edanwebservice.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
