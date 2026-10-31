package com.prasad.ordermanagementsystem.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Customer name is required")
    private String customerName;

    @NotBlank(message = "Product name is required")
    private String productName;

    @NotNull(message = "Amount is required")
    @DecimalMin(
            value = "0.0",
            inclusive = false,
            message = "Amount must be greater than zero"
    )
    private Double amount;

    @NotBlank(message = "Status is required")
    @Pattern(
            regexp = "CREATED|PROCESSING|SHIPPED|DELIVERED|CANCELLED",
            message = "Status must be CREATED, PROCESSING, SHIPPED, DELIVERED, or CANCELLED"
    )
    private String Status;
    /*private String customerName;
    private String productName;
    private Double amount;
    private String Status;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
