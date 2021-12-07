package com.telecom.applidistrib2;

import javax.persistence.*;
import java.util.List;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long equipe_id;
    private String label;
    @OneToMany
    @JoinTable( name = "relation_table",
            joinColumns = @JoinColumn( name = "equipe_id" ),
            inverseJoinColumns = @JoinColumn( name = "joueur_id" ) )
    private List<Joueur> joueurs;


    public Long getId(){
        return equipe_id;
    }

    public void setId(Long id){
        this.equipe_id = id;
    }

    public String getLabel(){
        return label;
    }

    public void setLabel(String label){
        this.label = label;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    @Override
    public String toString() {
        return this.label;
    }

}


