package com.Sprint3.MiniProject3.MiniProject3.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Promotions {
    @Id
    private String promoCode;

    private String promoType;

    private String description;

    private Double promoAmount;


}
