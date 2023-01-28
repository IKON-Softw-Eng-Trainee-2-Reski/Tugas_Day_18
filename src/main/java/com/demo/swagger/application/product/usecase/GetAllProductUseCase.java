package com.demo.swagger.application.product.usecase;

import com.demo.swagger.application.product.entity.Product;
import com.demo.swagger.shared.exception.DataNotFoundException;

import java.util.List;

public interface GetAllProductUseCase {
    List<Product> getAllProduct() throws DataNotFoundException;
}
