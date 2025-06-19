package com.Sprint3.MiniProject3.MiniProject3.service;

import com.Sprint3.MiniProject3.MiniProject3.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product saveProduct(Product product);

    Product updateProduct(Integer id, Product updatedProduct);

    void deleteProduct(Integer id);
}
