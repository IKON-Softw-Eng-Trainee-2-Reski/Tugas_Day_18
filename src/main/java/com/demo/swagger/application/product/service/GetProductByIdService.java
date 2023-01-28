package com.demo.swagger.application.product.service;

import com.demo.swagger.application.product.entity.Product;
import com.demo.swagger.application.product.repository.ProductRepository;
import com.demo.swagger.application.product.usecase.GetProductByIdUseCase;
import com.demo.swagger.shared.exception.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GetProductByIdService implements GetProductByIdUseCase {
    private final ProductRepository productRepository;
    @Override
    public Product getProductById(Long id) throws DataNotFoundException {
        Optional<Product> product = productRepository.getProductById(id);
        if (product.isEmpty()){
            throw new DataNotFoundException(String.format("Data product with id %s not found", id));
        }
        return product.get();
    }
}
