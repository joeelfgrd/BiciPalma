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
        if (!isAnclajeOcupado(posicion)) {
            this.numAnclajes--;
        } else {
            throw new IllegalArgumentException("El anclaje ya está ocupado");
        }
    }
    boolean isAnclajeOcupado(int posicion) {
        return anclajes[posicion].isOcupado();
    }

    boolean liberarAnclaje(int posicion) {
        if (posicion >= 0 && posicion < anclajes.length) {
            if (anclajes[posicion].isOcupado()) {
                anclajes[posicion].liberarBici();
                this.numAnclajes--;
                return true;
            }
        }
        return false;
    }

    void mostrarEstadoAnclajes() {
        for (int i = 0; i < anclajes.length; i++) {
            if (isAnclajeOcupado(i)) {
                System.out.println("Anclaje " + i + ": Ocupado");
            } else {
                System.out.println("Anclaje " + i + ": Libre");
            }
        }
    }
}
