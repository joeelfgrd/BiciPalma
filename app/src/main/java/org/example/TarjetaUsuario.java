package org.example;

public class TarjetaUsuario {
    private String idUsuario = "0";
    private boolean activada;

    public TarjetaUsuario(String idUsuario, boolean activada) {
        this.idUsuario = idUsuario;
        this.activada = activada;
    }
    
    public boolean isActivada() {
        return this.activada;
    }
     void setActivada(boolean activada) {
        this.activada = activada;
    }

    public String toString() {
        return "Tarjeta de usuario: " + this.idUsuario + " activada: " + this.activada;
    }
} 
