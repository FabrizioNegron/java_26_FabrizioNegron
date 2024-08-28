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
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto de la clase Empleado utilizando el constructor
        Empleado empleado1 = new Empleado("Fabrizio Negron", 3000.0);

        // Llamar al método para mostrar la información del empleado
        empleado1.mostrarInformacion();

        // Llamar al método para aumentar el salario
        empleado1.aumentarSalario(10);

        // Mostrar la información actualizada del empleado
        empleado1.mostrarInformacion();
    }

}
