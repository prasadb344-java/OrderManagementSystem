package com.prasad.ordermanagementsystem;

public class OrderNotFoundException  extends RuntimeException {

    public OrderNotFoundException(String message) {
        super(message);
    }
}