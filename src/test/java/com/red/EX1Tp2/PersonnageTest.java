package com.red.EX1Tp2;

import com.red.Ex1Tp2.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
public class PersonnageTest {

    @Test
    void testTournerUneFois() {
        Personnage p = new Personnage();
        assertEquals(Orientation.EST, p.tourner(1));
    }
    @Test
    void testTournerDeuxFois() {
        Personnage p = new Personnage();
        assertEquals(Orientation.SUD, p.tourner(2)); // Deux quarts de tour
    }

    @Test
    void testTournerTroisFois() {
        Personnage p = new Personnage();
        assertEquals(Orientation.OUEST, p.tourner(3)); // Trois quarts de tour
    }

    @Test
    void testTournerQuatreFois() {
        Personnage p = new Personnage();
        assertEquals(Orientation.NORD, p.tourner(4)); // Retour à la position initiale
    }

    @Test
    void testTournerNegatif() {
        Personnage p = new Personnage();
        assertEquals(Orientation.OUEST, p.tourner(-1)); // Tourner dans le sens inverse
    }

}
