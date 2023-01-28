package com.demo.swagger.application.product.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    @NotEmpty(message = "Product Name Required")
    private String name;
    @NotEmpty(message = "Product Desc Required")
    private String description;

    private int stock;

    private int price;
}
