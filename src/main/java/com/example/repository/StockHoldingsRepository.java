package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.StockHoldings;

public interface StockHoldingsRepository extends JpaRepository<StockHoldings, Long>{

}
