package com.prasad.ordermanagementsystem.repository;

import com.prasad.ordermanagementsystem.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
