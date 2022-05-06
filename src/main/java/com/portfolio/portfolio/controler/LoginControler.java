package com.portfolio.portfolio.controler;

import com.portfolio.portfolio.model.Login;

import com.portfolio.portfolio.service.ILoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = {"https://portfoliofrancomedina-89f9b.web.app"})
public class LoginControler {
    @Autowired
    private ILoginService loginservice;
    @PostMapping("/login")
    @ResponseBody
    public boolean login(@RequestBody Login login)
    {
        return loginservice.login(login);
    }
}
