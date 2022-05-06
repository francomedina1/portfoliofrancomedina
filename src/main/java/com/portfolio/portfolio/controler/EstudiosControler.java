package com.portfolio.portfolio.controler;
import com.portfolio.portfolio.model.Estudios;
import com.portfolio.portfolio.service.IEstudiosService;
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
@CrossOrigin(origins = {"https://portfoliofrancomedina-89f9b.web.app"})
public class EstudiosControler {
    @Autowired
    private IEstudiosService estudiosService;

    @PostMapping("/estudios")
    public void agregarestudio(@RequestBody Estudios estudios){
        estudiosService.crearestudio(estudios);
    }
    @GetMapping("/estudios")
    @ResponseBody
    public List<Estudios> verestudios(){
        return estudiosService.verestudios();
    }

    @DeleteMapping("/estudios/{id}")
    public void borrarestudios(@PathVariable Long id) {
        estudiosService.borrarestudio(id);
    }
}
