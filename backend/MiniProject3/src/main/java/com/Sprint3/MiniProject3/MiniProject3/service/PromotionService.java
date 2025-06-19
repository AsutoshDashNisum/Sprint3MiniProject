package com.Sprint3.MiniProject3.MiniProject3.service;

import com.Sprint3.MiniProject3.MiniProject3.model.Promotions;
import java.util.List;

public interface PromotionService {
    List<Promotions> getAllPromotions();
    Promotions savePromotion(Promotions promo);
    Promotions updatePromotion(Integer id, Promotions promo);
    void deletePromotion(Integer id);

    Promotions updatePromotion(String promoCode, Promotions promo);

    void deletePromotion(String promoCode);
}
