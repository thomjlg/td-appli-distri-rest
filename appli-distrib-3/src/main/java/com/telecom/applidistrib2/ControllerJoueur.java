package com.telecom.applidistrib2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class ControllerJoueur {

    @Autowired
    private ServiceJoueur service;

    @GetMapping(path= "/joueurs", produces = "application/json")
    public List<Joueur> getJoueurs(){
        return service.getJoueurs();
    }

    @PostMapping(path= "/joueurs", consumes = "application/json", produces = "application/json")
    public Joueur createJoueur(@RequestBody Joueur joueur){
        return service.createJoueur(joueur);
    }


    @GetMapping("/joueurs/{id}")
    Joueur oneJoueur(@PathVariable Long id) {
        return service.getJoueur(id)
                .orElseThrow(() -> new JoueurNotFoundException(id));
    }

}
