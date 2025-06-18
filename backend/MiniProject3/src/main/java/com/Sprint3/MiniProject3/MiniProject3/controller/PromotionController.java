package com.Sprint3.MiniProject3.MiniProject3.controller;

import com.Sprint3.MiniProject3.MiniProject3.model.Promotions;
import com.Sprint3.MiniProject3.MiniProject3.service.PromotionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/promotions")
public class PromotionController {

    private final PromotionService service;

    public PromotionController(PromotionService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Promotions>> getAll() {
        return ResponseEntity.ok(service.getAllPromotions());
    }

    @PostMapping
    public ResponseEntity<Promotions> addPromo(@RequestBody Promotions promo) {
        return ResponseEntity.ok(service.savePromotion(promo));
    }
}
