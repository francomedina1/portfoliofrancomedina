package com.portfolio.portfolio.service;
import com.portfolio.portfolio.model.Skills;

import java.util.List;

public interface ISkillsService {
    public void crearskill(Skills skills);
    public void borrarskill (long id);
    public List<Skills> verskills();
}
