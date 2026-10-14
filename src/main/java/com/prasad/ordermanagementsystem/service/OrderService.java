package com.prasad.ordermanagementsystem.service;
import com.prasad.ordermanagementsystem.OrderNotFoundException;
import com.prasad.ordermanagementsystem.entity.Order;
import com.prasad.ordermanagementsystem.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {


    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() ->
                        new OrderNotFoundException(
                                "Order not found with id: " + id
                        )
                );
    }

    /*public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found with id: " + id));
    }*/

    public Order updateOrder(Long id, Order updatedOrder) {

        Order existingOrder = orderRepository.findById(id)
                .orElse(null);

        if (existingOrder == null) {
            return null;
        }

        existingOrder.setCustomerName(updatedOrder.getCustomerName());
        existingOrder.setProductName(updatedOrder.getProductName());
        existingOrder.setAmount(updatedOrder.getAmount());
        existingOrder.setStatus(updatedOrder.getStatus());

        return orderRepository.save(existingOrder);
    }
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
