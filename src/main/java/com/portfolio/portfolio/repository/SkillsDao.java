package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsDao extends JpaRepository<Skills, Long> {
}
