package com.telecom.applidistrib2;

public class EquipeNotFoundException  extends RuntimeException {
    EquipeNotFoundException(Long id) {
        super("Equipe " + id + " inexistante.");
    }
}
