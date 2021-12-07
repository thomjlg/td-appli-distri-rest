package com.telecom.applidistrib2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyService {
    @Autowired
    private RepositoryEquipe equipeRepository;

    public List<Equipe> getEquipes(){
        return equipeRepository.findAll();
    }

    public Optional<Equipe> getEquipe(Long id){
        return equipeRepository.findById(id);
    }

    public Equipe createEquipe(Equipe e){
        return equipeRepository.save(e);
    }

    public Equipe updateEquipe(Equipe e){
        return equipeRepository.save(e);
    }


}
