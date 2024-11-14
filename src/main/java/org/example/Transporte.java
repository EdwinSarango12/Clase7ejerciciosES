package org.example;

public class Transporte {
    private int capacidad;
    private double velocidad;

    public Transporte() {
    }
    public Transporte(int capacidad, double velocidad) {
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public void MostrarDatos(){
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Velocidad: " + velocidad);
    }
}
