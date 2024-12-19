package com.red.Ex1Tp2;

public class Personnage {
    private Orientation orientation;

    public Personnage() {
        this.orientation = Orientation.NORD; // Orientation initiale
    }

    public Orientation tourner(int fois) {
        Orientation[] orientations = Orientation.values();
        int index = (orientation.ordinal() + fois) % orientations.length;
        if (index < 0) {
            index += orientations.length; // Gérer les indices négatifs
        }
        this.orientation = orientations[index];
        return this.orientation;
    }

    public Orientation getOrientation() {
        return orientation;
    }
}

