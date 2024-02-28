package org.example;

public class Anclajes {
    
    private Anclaje[] anclajes;
    private int numAnclajes;

    Anclajes(int numAnclajes) {
        this.numAnclajes = numAnclajes;
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes() {
        for (int i = 0; i < anclajes.length; i++) {
            this.anclajes[i] = new Anclaje();
        }
    }

    Anclaje[] anclajes() {
        return this.anclajes;
    }

    int numAnclajes(){
        return this.anclajes.length;
    }

    @Override
    public String toString() {
        return "Numero de anclajes: " + this.numAnclajes;
    }

     
    void ocuparAnclaje(int posicion, Bicicleta bicicleta) {
        if (posicion >= 0 && posicion < anclajes.length && !anclajes[posicion].isOcupado()) {
            anclajes[posicion].anclarBici(bicicleta);
            this.numAnclajes--;
        } else {
            throw new IllegalArgumentException("Posición inválida o anclaje ya ocupado");
        }
    }
    boolean isAnclajeOcupado() {
        return this.numAnclajes > 0;
    }

    void liberarAnclaje() {
        this.numAnclajes++;
    }

    
        
}



