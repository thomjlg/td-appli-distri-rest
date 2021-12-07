package com.telecom.applidistrib2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceJoueur {
    @Autowired
    private RepositoryJoueur joueurRepository;

    public List<Joueur> getJoueurs(){
        return joueurRepository.findAll();
    }

    public Optional<Joueur> getJoueur(Long id){
        return joueurRepository.findById(id);
    }

    public Joueur createJoueur(Joueur e){
        return joueurRepository.save(e);
    }

    public Joueur updateJoueur(Joueur e){
        return joueurRepository.save(e);
    }
}
