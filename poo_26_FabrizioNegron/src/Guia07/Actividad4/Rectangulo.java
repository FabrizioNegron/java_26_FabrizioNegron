
package Guia07.Actividad4;

public class Rectangulo {
    // Atributos

    double largo;
    double ancho;

    // Métodos
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double calcularArea(double largo, double ancho) {
        return largo * ancho;
    }

    public double calcularPerimetro(double largo, double ancho) {
        return 2 * (largo + ancho);
    }
}
