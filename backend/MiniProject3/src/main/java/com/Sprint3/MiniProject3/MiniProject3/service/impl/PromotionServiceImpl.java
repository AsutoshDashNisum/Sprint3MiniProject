package com.Sprint3.MiniProject3.MiniProject3.service.impl;

import com.Sprint3.MiniProject3.MiniProject3.model.Promotions;
import com.Sprint3.MiniProject3.MiniProject3.repository.PromotionsRepository;
import com.Sprint3.MiniProject3.MiniProject3.service.PromotionService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PromotionServiceImpl implements PromotionService {

    private final PromotionsRepository repository;

    public PromotionServiceImpl(PromotionsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Promotions> getAllPromotions() {
        return repository.findAll();
    }

    @Override
    public Promotions savePromotion(Promotions promo) {
        return repository.save(promo);
    }

}
