package com.Sprint3.MiniProject3.MiniProject3.service.impl;

import com.Sprint3.MiniProject3.MiniProject3.model.Product;
import com.Sprint3.MiniProject3.MiniProject3.repository.ProductRepository;
import com.Sprint3.MiniProject3.MiniProject3.service.ProductService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }
}
