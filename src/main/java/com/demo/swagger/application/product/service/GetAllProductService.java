package com.demo.swagger.application.product.service;

import com.demo.swagger.application.product.entity.Product;
import com.demo.swagger.application.product.repository.ProductRepository;
import com.demo.swagger.application.product.usecase.GetAllProductUseCase;
import com.demo.swagger.shared.exception.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllProductService implements GetAllProductUseCase {
    private final ProductRepository productRepository;
    @Override
    public List<Product> getAllProduct() throws DataNotFoundException {
        List<Product> products = productRepository.getAllProducts();
        if (products.size() == 0){
            throw new DataNotFoundException("Data product not found");
        }
        return products;
    }
}
