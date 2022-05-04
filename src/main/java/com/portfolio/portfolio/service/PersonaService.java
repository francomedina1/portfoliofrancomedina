package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Persona;
import com.portfolio.portfolio.repository.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements iPersonaService{

    @Autowired
    public PersonaDao persdao;


    @Override
    public void crearPersona(Persona persona) {
        persdao.save(persona);

    }

    @Override
    public Persona listarPersonas() {
        return persdao.findTopByOrderByIdDesc();

    }
}
