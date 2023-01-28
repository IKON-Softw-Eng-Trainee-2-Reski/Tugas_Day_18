package com.demo.swagger.application.product.usecase;

import com.demo.swagger.application.product.entity.Product;

public interface CreateProductUseCase {
    Product createProduct(Product product);
}
