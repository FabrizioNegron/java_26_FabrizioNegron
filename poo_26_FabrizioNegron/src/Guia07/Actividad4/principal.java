/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.Actividad4;

/**
 *
 * @author jeffe
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
        System.out.println("Área: " + rectangulo.calcularArea(5.0, 3.0));
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro(5.0, 3.0));
    }

}
