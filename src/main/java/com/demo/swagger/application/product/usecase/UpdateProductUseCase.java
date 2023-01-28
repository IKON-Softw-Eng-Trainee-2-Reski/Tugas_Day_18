package com.demo.swagger.application.product.usecase;

import com.demo.swagger.application.product.entity.Product;
import com.demo.swagger.shared.exception.DataNotFoundException;

public interface UpdateProductUseCase {
    Product updateProduct(Long id, Product product) throws DataNotFoundException;
}
