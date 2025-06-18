package com.Sprint3.MiniProject3.MiniProject3.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productID;

    private String name;

    @Column(unique = true)
    private String sku;

    private String categoryName;
    private String size;
    private Double price;
    private Integer discount;
    private Double discountPrice;
}
