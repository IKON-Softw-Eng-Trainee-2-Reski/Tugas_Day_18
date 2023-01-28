package com.demo.swagger.application.product.usecase;

import com.demo.swagger.shared.exception.DataNotFoundException;
import com.demo.swagger.application.product.entity.Product;

public interface GetProductByIdUseCase {
    Product getProductById(Long id) throws DataNotFoundException;
}
