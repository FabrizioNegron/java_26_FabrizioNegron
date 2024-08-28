/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.Actividad3;

public class Rectangulo {

    double largo;
    double ancho;

    public void asignarLargo(double largo) {
        this.largo = largo;
    }

    public void asignarAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }

    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    public void mostrarInformacion() {
        System.out.println("Largo: " + largo);
        System.out.println("Ancho: " + ancho);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
