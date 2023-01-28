package com.demo.swagger.application.product.usecase;

import com.demo.swagger.shared.exception.DataNotFoundException;

public interface DeleteProductUseCase {
    boolean deleteProduct(Long id) throws DataNotFoundException;
}
