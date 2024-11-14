package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Auto auto= new Auto(5,60.0,"gasolina",80);
        auto.prenderRadio();
        auto.MostrarDatos();
        /*Mostrar sin parámetros*/
        Auto auto1= new Auto();
        auto1.prenderRadio();
        auto1.MostrarDatos();
        /*Padre unicamente con Parámetros*/
        Auto auto2= new Auto(6,100);
        auto2.prenderRadio();
        auto.MostrarDatos();
        /*Clase hija con parámteros*/
        Auto auto3= new Auto("Diesel",2000);
        auto1.mostrarAuto();
        /* Sin paramteros asignatlos con los setters*/
        auto3.setCapacidad(8);
        auto3.setVelocidad(90);
        auto3.prenderRadio();
        auto3.MostrarDatos();




    }
}


