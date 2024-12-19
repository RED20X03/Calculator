package com.red.EX1Tp2;

import com.red.Ex1Tp2.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
class PersonnageTest {

    @Test
    public void testOrientationInitiale() {
        Personnage p = new Personnage();
        assertEquals(Orientation.NORD, p.getOrientation());
    }

    @Test
    public void testTournerUneFois() {
        Personnage p = new Personnage();
        assertEquals(Orientation.EST, p.tourner(1));
    }

    @Test
    public void testTournerDeuxFois() {
        Personnage p = new Personnage();
        assertEquals(Orientation.SUD, p.tourner(2));
    }

    @Test
    public void testTournerTroisFois() {
        Personnage p = new Personnage();
        assertEquals(Orientation.OUEST, p.tourner(3));
    }

    @Test
    public void testTournerQuatreFois() {
        Personnage p = new Personnage();
        assertEquals(Orientation.NORD, p.tourner(4));
    }

    @Test
    public void testTournerHuitFois() {
        Personnage p = new Personnage();
        assertEquals(Orientation.NORD, p.tourner(8)); // Deux tours complets
    }

    @Test
    public void testTournerNegatif() {
        Personnage p = new Personnage();
        assertEquals(Orientation.OUEST, p.tourner(-1));
    }

    @Test
    public void testTournerGrandNombre() {
        Personnage p = new Personnage();
        assertEquals(Orientation.NORD, p.tourner(200)); // Vérifie les grands nombres
    }
}
