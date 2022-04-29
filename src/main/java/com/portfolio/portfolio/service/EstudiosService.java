package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Estudios;
import com.portfolio.portfolio.repository.EstudiosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EstudiosService implements IEstudiosService {

    @Autowired
    public EstudiosDao estudiosDao;


    @Override
    public void crearestudio(Estudios estudios) {
        estudiosDao.save(estudios);
    }

    @Override
    public void borrarestudio(long id) {
        estudiosDao.deleteById(id);

    }

    @Override
    public List<Estudios> verestudios() {
        return estudiosDao.findAll();
    }
}

