package com.portfolio.portfolio.service;


import com.portfolio.portfolio.model.Estudios;


import java.util.List;

public interface IEstudiosService {
    public void crearestudio(Estudios estudios);
    public void borrarestudio (long id);
    public List<Estudios> verestudios();
}
