package com.portfolio.portfolio.controler;


import com.portfolio.portfolio.model.Skills;
import com.portfolio.portfolio.service.ISkillsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@CrossOrigin(origins = {"https://portfoliofrancomedina-89f9b.web.app"})
public class SkillsControler {
    @Autowired
    private ISkillsService skillsService;

    @PostMapping("/skills")
    public void agregarskills(@RequestBody Skills skills){
        skillsService.crearskill(skills);
    }
    @GetMapping("/skills")
    @ResponseBody
    public List<Skills> verskills(){
        return skillsService.verskills();
    }

    @DeleteMapping("/skills/{id}")
    public void borrarskill(@PathVariable Long id) {
        skillsService.borrarskill(id);
    }
}
