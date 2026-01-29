package bank.recommendation.repository;


import bank.recommendation.entity.RuleStatistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RuleStatisticRepository extends JpaRepository<RuleStatistic, String> {
    Optional<RuleStatistic> findByRuleId(String ruleId);
}
