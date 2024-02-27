package org.example;

public class Anclajes {
    
    
    private final Anclaje[] anclajes;
    
        Anclajes(int numAnclajes) {
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

        
        String NumAnclajesAString() {
            return String.valueOf(this.numAnclajes);
        }

        @Override
        public String toString() {
            return "Numero de anclajes: " + this.numAnclajes;
        }
        
        int numAnclajes() {
            return this.anclajes.length;
        }


        void ocuparAnclaje() {
        this.numAnclajes--;
        }
        boolean isAnclajeOcupado() {
        return this.numAnclajes > 0;
        }
        public
}


