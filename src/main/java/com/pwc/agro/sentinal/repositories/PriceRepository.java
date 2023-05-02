package com.pwc.agro.sentinal.repositories;

import com.pwc.agro.sentinal.dto.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Integer> {
}
