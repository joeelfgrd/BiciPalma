package org.example;
public class Bicicleta {
    private int id;
    
    public Bicicleta(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    @Override
    public String toString() {
        return Integer.toString(this.getId());
    }
}
