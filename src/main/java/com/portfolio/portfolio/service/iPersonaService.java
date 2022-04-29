package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Persona;

import java.util.List;

public interface iPersonaService {

    public void crearPersona(Persona persona);
    public List<Persona> listarPersonas();
}
