package org.example;

public class Anclaje {
    private Bicicleta bici;
    private boolean isOcupado;

    public boolean isOcupado() {
        return this.isOcupado;
    }
    public void anclarBici(Bicicleta bici) {
        this.bici = bici;
        this.isOcupado = true;
    }

    public Bicicleta getBici() {
        return this.bici;
    }

    public void liberarBici() {
        this.bici = null;
        this.isOcupado = false;
    }
}
