package org.example;

public class Avion extends Transporte{
    private String tipo;
    private double alturamax;

    public Avion() {
    }

    public Avion(int capacidad, double velocidad, String tipo, double alturamax) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.alturamax = alturamax;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getAlturamax() {
        return alturamax;
    }
    public void setAlturamax(double alturamax) {
        this.alturamax = alturamax;
    }

    public void darAviso(){
        System.out.println("Abróchate el cinturón");
    }
}
