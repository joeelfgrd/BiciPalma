package org.example;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnclajesTest {

    @Test
    public void toStringTest() {
        Anclajes anclajes = new Anclajes(6);
        assertEquals("Numero de anclajes: 6", anclajes.toString());
    } 
    
    @Test
    public void ocuparAnclajeTest() {
        Anclajes anclajes = new Anclajes(6);
        anclajes.ocuparAnclaje();
        assertEquals("Numero de anclajes: 5", anclajes.toString());
    }
}