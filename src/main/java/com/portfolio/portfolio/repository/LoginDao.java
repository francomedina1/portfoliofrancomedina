package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.Login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao extends JpaRepository<Login, Long>  {
    public boolean existsByUserAndPwd(String user, String pwd);
}
