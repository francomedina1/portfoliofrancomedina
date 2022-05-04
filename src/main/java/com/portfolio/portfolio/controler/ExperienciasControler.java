package com.portfolio.portfolio.controler;

import com.portfolio.portfolio.model.Experiencias;
import com.portfolio.portfolio.service.IExperienciasService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class ExperienciasControler {


    @Autowired
    private IExperienciasService experienciasService;

    @PostMapping("/experiencia")
    public void agregarexperiencia(@RequestBody Experiencias experiencias){
        experienciasService.crearexperiencia(experiencias);
    }
    @GetMapping("/experiencia")
    @ResponseBody
    public List<Experiencias> verexperiencia(){
        return experienciasService.verexperiencias();
    }

    @DeleteMapping("/experiencia/{id}")
    public void borrarexperiencia(@PathVariable Long id) {
        experienciasService.borrarexperiencias(id);
    }
}