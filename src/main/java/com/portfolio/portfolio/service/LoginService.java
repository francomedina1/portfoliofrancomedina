package com.portfolio.portfolio.service;


import com.portfolio.portfolio.model.Login;
import com.portfolio.portfolio.repository.LoginDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService{
    @Autowired
    public LoginDao loginDao;

    @Override
    public boolean login(Login login)
    {
        return loginDao.existsByUserAndPwd(login.getUser(), login.getPwd());
    }
}
