package com.pwc.agro.sentinal.repositories;

import com.pwc.agro.sentinal.dto.Production;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionRepository extends JpaRepository<Production, Integer> {
}
