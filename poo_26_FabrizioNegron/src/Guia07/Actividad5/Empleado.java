/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.Actividad5;

/**
 *
 * @author jeffe
 */
public class Empleado {
    // Atributos

    String nombre;
    double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para aumentar el salario en un porcentaje
    public void aumentarSalario(double porcentaje) {
        if (porcentaje > 0) {
            salario += salario * (porcentaje / 100);
            System.out.println("Salario aumentado en " + porcentaje + "%.");
        } else {
            System.out.println("El porcentaje debe ser positivo.");
        }
    }

    // Método para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}
