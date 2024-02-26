package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.example.Bicicleta;

public class AnclajeTest {

    @Test
    public void anclarBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(911));
        assertTrue(anclaje.isOcupado());
    }

    @Test
    public void getBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(911));
        assertTrue(anclaje.isOcupado());
        anclaje.getBici();
        assertTrue(anclaje.isOcupado());
    }

    @Test
    public void liberarBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(911));
        assertTrue(anclaje.isOcupado());

        anclaje.liberarBici();
        assertFalse(anclaje.isOcupado());        
    }
    
    @Test
    public void liberarBiciAncladaTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(911));
        assertTrue(anclaje.isOcupado());
    
        anclaje.liberarBici();
        assertFalse(anclaje.isOcupado());        
        anclaje.liberarBici();
        assertFalse(anclaje.isOcupado()); 
    }
}
