package org.example;

public class Anclajes {
    private int numAnclajes;

    public Anclajes(int numAnclajes) {
        this.numAnclajes = numAnclajes;
    }
    public String NumAnclajesAString() {
        return String.valueOf(this.numAnclajes);
    }

    @Override
    public String toString() {
        return "Numero de anclajes: " + this.numAnclajes;
    }
    public void ocuparAnclaje() {
        this.numAnclajes--;
    }
    public Boolean isAnclajeOcupado() {
        return this.numAnclajes > 0;
    }
}


