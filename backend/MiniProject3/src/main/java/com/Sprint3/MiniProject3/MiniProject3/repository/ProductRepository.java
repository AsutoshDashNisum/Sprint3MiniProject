package com.Sprint3.MiniProject3.MiniProject3.repository;

import com.Sprint3.MiniProject3.MiniProject3.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
