package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Skills;
import com.portfolio.portfolio.repository.SkillsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService implements ISkillsService{

    @Autowired
    public SkillsDao skillsDao;


    @Override
    public void crearskill(Skills skills) {
        skillsDao.save(skills);

    }

    @Override
    public void borrarskill(long id) {
        skillsDao.deleteById(id);

    }

    @Override
    public List<Skills> verskills() {
        return skillsDao.findAll();
    }
}
