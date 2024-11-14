package org.example;

public class Auto extends Transporte{
    private String tipo;
    private int cilindraje;
    public Auto() {
    }

    public Auto(int capacidad, double velocidad){
        super(capacidad, velocidad);
    }
    public Auto(int capacidad, double velocidad, String tipo, int cilindraje) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }
    public Auto(String tipo, int cilindraje) {
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void prenderRadio(){
        System.out.println("Prender la radio");
    }
    public void mostrarAuto(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Cilindraje: " + cilindraje);
    }

}
