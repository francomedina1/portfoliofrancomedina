package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDao  extends JpaRepository<Persona, Long> {
    public Persona findTopByOrderByIdDesc();

}
