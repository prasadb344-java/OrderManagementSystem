package com.prasad.ordermanagementsystem.controller;

import com.prasad.ordermanagementsystem.entity.Order;
import com.prasad.ordermanagementsystem.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping("/orders")
    public Order createOrder(@RequestBody Order order)
    {
        return orderService.createOrder(order);
    }
    @GetMapping("/orders")
    public List<Order> getAllOrders()
    {
        return orderService.getAllOrders();
    }
   /* @GetMapping("/orders/{id}")
    public Order getOrderById(@PathVariable Long id)
    {
        return orderService.getOrderById(id);
    }*/
   @GetMapping("/orders/{id}")
   public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
       return ResponseEntity.ok(orderService.getOrderById(id));
   }

    @PutMapping("/orders/{id}")
    public Order updateOrder(@PathVariable Long id,@RequestBody Order order)
    {
    return orderService.updateOrder(id, order);
    }
    @DeleteMapping("/orders/{id}")
    public void deleteOrder(@PathVariable Long id)
    {
            orderService.deleteOrder(id);
    }

}
