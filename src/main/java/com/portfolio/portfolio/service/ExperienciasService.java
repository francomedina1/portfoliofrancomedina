package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Experiencias;
import com.portfolio.portfolio.repository.ExperienciasDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciasService implements IExperienciasService {

    @Autowired
    public ExperienciasDao experinciasdao;


    @Override
    public void crearexperiencia(Experiencias experiencias) {
        experinciasdao.save(experiencias);

    }

    @Override
    public void borrarexperiencias(long id) {
        experinciasdao.deleteById(id);

    }

    @Override
    public List<Experiencias> verexperiencias() {
        return experinciasdao.findAll();
    }
}

