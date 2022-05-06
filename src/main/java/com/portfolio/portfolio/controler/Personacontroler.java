package com.portfolio.portfolio.controler;

import com.portfolio.portfolio.model.Persona;
import com.portfolio.portfolio.service.iPersonaService;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@CrossOrigin(origins = {"https://portfoliofrancomedina-89f9b.web.app"})
public class Personacontroler {

    @Autowired
    private iPersonaService personserv;

    @PostMapping("/persona")
    public void agregarPersona(@RequestBody Persona persona){
        personserv.crearPersona(persona);
    }
    @GetMapping("/persona")
    @ResponseBody
    public Persona verPersona(){
        return personserv.listarPersonas();
    }



}
