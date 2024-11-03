/*
 Diseñar una aplicación utilizando la programación orientada a objetos mediante una clase con sus atributos
y métodos que permita registrar las cuatro compras realizadas (compra1, compra2, compra3, compra4). 
Visualizar en total, promedio, mayor y menor de las compras realizadas.
 */
package Programa;

public class Compras {
    // para almacenar los valores de las compras
    private double comp1;
    private double comp2;
    private double comp3;
    private double comp4;

    // Constructor de la clase
    public Compras(double compra1, double compra2, double compra3, double compra4) {
        this.comp1 = compra1;
        this.comp2 = compra2;
        this.comp3 = compra3;
        this.comp4 = compra4;
    }

    // para calcular el total de las compras
    public double calcularTotal() {
        return comp1 + comp2 + comp3 + comp4;
    }
    //para calcular el promedio de las compras
    public double calcularPromedio() {
        return calcularTotal() / 4;
    }
    //para obtener la compra mayor
    public double obtenerCompraMayor() {
        return Math.max(Math.max(comp1, comp2), Math.max(comp3, comp4));
    }
    // para obtener la compra menor
    public double obtenerCompraMenor() {
        return Math.min(Math.min(comp1, comp2), Math.min(comp3, comp4));
    }
}
