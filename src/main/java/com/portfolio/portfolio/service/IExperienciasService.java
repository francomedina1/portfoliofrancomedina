package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Experiencias;
import java.util.List;

public interface IExperienciasService {
    public void crearexperiencia(Experiencias experiencias);
    public void borrarexperiencias (long id);
    public List<Experiencias> verexperiencias();
}
