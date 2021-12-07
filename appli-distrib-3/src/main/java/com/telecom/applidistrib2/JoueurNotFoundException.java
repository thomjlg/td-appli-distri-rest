package com.telecom.applidistrib2;

public class JoueurNotFoundException  extends RuntimeException {
    JoueurNotFoundException(Long id) {
        super("Joueur " + id + " inconnu.");
    }
}
