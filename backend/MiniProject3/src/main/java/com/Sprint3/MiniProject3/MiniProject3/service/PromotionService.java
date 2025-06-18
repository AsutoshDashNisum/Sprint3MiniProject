package com.Sprint3.MiniProject3.MiniProject3.service;

import com.Sprint3.MiniProject3.MiniProject3.model.Promotions;
import java.util.List;

public interface PromotionService {
    List<Promotions> getAllPromotions();
    Promotions savePromotion(Promotions promo);
}
