/*
Diseñar una aplicación utilizando la programación orientada a objetos mediante una clase 
con sus atributos y métodos que permita registrar los cuatro sueldos de los empleados
(sueldo1, sueldo2, sueldo3, sueldo4). Visualizar el total, promedio, sueldo mayor y el sueldo menor. 
 */
package Programa;
public class Empleado {
    // Atributos para almacenar los sueldos
    private double sueldo1;
    private double sueldo2;
    private double sueldo3;
    private double sueldo4;
    // Metodo constructor
    public Empleado(double sueldo1, double sueldo2, double sueldo3, double sueldo4) {
        this.sueldo1 = sueldo1;
        this.sueldo2 = sueldo2;
        this.sueldo3 = sueldo3;
        this.sueldo4 = sueldo4;
    }
    //  para calcular el total de los sueldos
    public double calcularTotal() {
        return sueldo1 + sueldo2 + sueldo3 + sueldo4;
    }
    //  para calcular el promedio de los sueldos
    public double calcularPromedio() {
        return calcularTotal() / 4;
    }
    // para obtener el sueldo mayor
    public double obtenerSueldoMayor() {
        return Math.max(Math.max(sueldo1, sueldo2), Math.max(sueldo3, sueldo4));
    }
    //  para obtener el sueldo menor
    public double obtenerSueldoMenor() {
        return Math.min(Math.min(sueldo1, sueldo2), Math.min(sueldo3, sueldo4));
    }
}


   
    
    

