package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.Experiencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciasDao extends JpaRepository<Experiencias, Long> {
}
