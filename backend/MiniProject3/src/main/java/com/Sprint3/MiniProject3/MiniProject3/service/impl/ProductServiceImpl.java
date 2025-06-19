package com.Sprint3.MiniProject3.MiniProject3.service.impl;

import com.Sprint3.MiniProject3.MiniProject3.model.Product;
import com.Sprint3.MiniProject3.MiniProject3.repository.ProductRepository;
import com.Sprint3.MiniProject3.MiniProject3.service.ProductService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Product updateProduct(Integer id, Product updatedProduct) {
        Optional<Product> optionalProduct = repository.findById(id);
        if (optionalProduct.isEmpty()) {
            throw new RuntimeException("Product with ID " + id + " not found");
        }

        Product existingProduct = optionalProduct.get();
        existingProduct.setName(updatedProduct.getName());
        existingProduct.setSku(updatedProduct.getSku());
        existingProduct.setCategoryName(updatedProduct.getCategoryName());
        existingProduct.setSize(updatedProduct.getSize());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setDiscount(updatedProduct.getDiscount());
        existingProduct.setDiscountPrice(updatedProduct.getDiscountPrice());

        return repository.save(existingProduct);
    }

    @Override
    public void deleteProduct(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Product with ID " + id + " does not exist");
        }
        repository.deleteById(id);
    }
}
