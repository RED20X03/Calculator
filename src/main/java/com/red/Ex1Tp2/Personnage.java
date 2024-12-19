package com.red.Ex1Tp2;

public class Personnage {
    private Orientation orientation;

    public Personnage() {
        this.orientation = Orientation.NORD; // Orientation initiale
    }

    public Orientation tourner(int fois) {
        return orientation; // Implémentation vide qui garantit l'échec
    }
}
