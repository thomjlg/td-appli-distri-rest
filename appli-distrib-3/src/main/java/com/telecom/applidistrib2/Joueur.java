package com.telecom.applidistrib2;

import javax.persistence.*;

@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long joueur_id;
    private String nom;

    @ManyToOne
    @JoinTable( name = "relation_table",
            joinColumns = @JoinColumn( name = "joueur_id" ),
            inverseJoinColumns = @JoinColumn( name = "equipe_id" ) )
    private Equipe equipe;


    public Long getId(){
        return joueur_id;
    }

    public void setId(Long id){
        this.joueur_id = id;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }


    @Override
    public String toString() {
        return this.nom;
    }

}


