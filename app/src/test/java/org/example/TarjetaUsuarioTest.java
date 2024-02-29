package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TarjetaUsuarioTest {

    TarjetaUsuario tarjeta;

    @Before
    public void setup() {
        tarjeta = new TarjetaUsuario("12345", true);
    }

    @Test
    public void testIsActivada() {
        assertEquals(true, tarjeta.isActivada());
    }

    @Test
    public void testSetActivada() {
        tarjeta.setActivada(false);
        assertEquals(false, tarjeta.isActivada());
    }

    @Test
    public void testToString() {
        assertEquals("Tarjeta de usuario: 12345 activada: true", tarjeta.toString());
    }
}