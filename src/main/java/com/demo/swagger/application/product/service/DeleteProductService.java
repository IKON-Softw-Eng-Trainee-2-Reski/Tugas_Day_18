package com.demo.swagger.application.product.service;

import com.demo.swagger.application.product.entity.Product;
import com.demo.swagger.application.product.repository.ProductRepository;
import com.demo.swagger.shared.exception.DataNotFoundException;
import com.demo.swagger.application.product.usecase.DeleteProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DeleteProductService implements DeleteProductUseCase {
    private final ProductRepository productRepository;
    @Override
    public boolean deleteProduct(Long id) throws DataNotFoundException {
        Optional<Product> product = productRepository.getProductById(id);
        if (product.isEmpty()){
            throw new DataNotFoundException(String.format("No product with id %s", id));
        }
        productRepository.deleteProduct(id);
        return true;
    }
}
