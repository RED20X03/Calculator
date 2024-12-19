package com.red.Ex1Tp2;

public class Personnage {
    private Orientation orientation;

    public Personnage() {
        this.orientation = Orientation.NORD; // Orientation initiale
    }
    //Modification de la méthode tourner pour gérer le cas d'un seul quart de tour
    public Orientation tourner(int fois) {
        Orientation[] orientations = Orientation.values();
        // Calcule le nouvel index en prenant en compte les dépassements
        int index = (orientation.ordinal() + fois) % orientations.length;

        // Ajuste les indices négatifs pour rester dans les limites du tableau
        if (index < 0) {
            index += orientations.length;
        }

        // Met à jour l'orientation actuelle
        this.orientation = orientations[index];
        return this.orientation;
    }


}
