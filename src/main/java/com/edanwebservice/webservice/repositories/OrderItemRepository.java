package com.edanwebservice.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edanwebservice.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
