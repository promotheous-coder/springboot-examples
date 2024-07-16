package com.luv4code.springdatajpa.orderrepository;

import com.luv4code.springdatajpa.orderentity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
