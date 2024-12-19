package com.red.Ex1Tp2;

public class Personnage {
    private Orientation orientation;

    public Personnage() {
        this.orientation = Orientation.NORD; // Orientation initiale
    }
    //Modification de la méthode tourner pour gérer le cas d'un seul quart de tour
    public Orientation tourner(int fois) {
        Orientation[] orientations = Orientation.values();
        int index = (orientation.ordinal() + fois) % orientations.length;
        this.orientation = orientations[index];
        return this.orientation;
    }

}
