package org.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
/*import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;*/

public class AnclajesTest {


    @Test
    public void toStringTest() {
        Anclajes anclajes = new Anclajes(6);
        assertEquals("Numero de anclajes: 6", anclajes.toString());
    } 

    @Test
    public void numAnclajesTest(){
        Anclajes anclajes = new Anclajes(6);
        assertEquals(6, anclajes.numAnclajes());
    }

    
    @Test
    public void isAnclajeOcupadoTest() {
        Anclajes anclajes = new Anclajes(6);
        anclajes.ocuparAnclaje();
        assertTrue(anclajes.isAnclajeOcupado());
    }
}