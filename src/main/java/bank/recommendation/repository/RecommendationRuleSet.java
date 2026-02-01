package bank.recommendation.repository;



import bank.recommendation.DTO.ProductRecommendation;

import java.util.Optional;
import java.util.UUID;

public interface RecommendationRuleSet {
    Optional<ProductRecommendation> check (UUID userId);
}
