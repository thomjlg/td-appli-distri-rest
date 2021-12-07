package com.telecom.applidistrib2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class MyController {

    @Autowired
    private MyService service;

    @GetMapping(path= "/equipes", produces = "application/json")
    public List<Equipe> getEquipes(){
        return service.getEquipes();
    }

    @PostMapping(path= "/equipes", consumes = "application/json", produces = "application/json")
    public Equipe createEquipe(@RequestBody Equipe equipe){
        return service.createEquipe(equipe);
    }

    @GetMapping("/equipes/{id}")
    Equipe oneEquipe(@PathVariable Long id) {
        return service.getEquipe(id)
                .orElseThrow(() -> new EquipeNotFoundException(id));
    }

}
