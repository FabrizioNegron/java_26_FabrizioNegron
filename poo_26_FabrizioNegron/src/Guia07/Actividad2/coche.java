/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.Actividad2;

/**
 *
 * @author jeffe
 */
public class coche {
     // Atributos
    String color;
    int velocidadMaxima;

    // Métodos
    public void arrancar() {
        System.out.println("El coche ha arrancado");
    }

    public void acelerar() {
        System.out.println("El coche está acelerando hasta " + velocidadMaxima + " km/h");
    }
}
