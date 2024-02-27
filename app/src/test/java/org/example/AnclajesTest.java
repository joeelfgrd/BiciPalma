package org.example;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AnclajesTest {


    @Test
    public void toStringTest() {
        Anclajes anclajes = new Anclajes(6);
        assertEquals("Numero de anclajes: 6", anclajes.toString());
    } 

    @Test
    public void isAnclajeOcupadoTest() {
        Anclajes anclajes = new Anclajes(6);
        assertFalse(anclajes.isAnclajeOcupado());
        anclajes.ocuparAnclaje();
        assertTrue(anclajes.isAnclajeOcupado());
    }
}