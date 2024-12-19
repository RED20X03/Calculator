package com.red.EX1Tp2;

import com.red.Ex1Tp2.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
public class PersonnageTest {

    @Test
    void testTournerUneFois() {
        Personnage p = new Personnage();
        assertEquals(Orientation.EST, p.tourner(1)); // Échoue car la méthode tourner n'est pas encore implémentée
    }
}
