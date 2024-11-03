/*
Diseñar una aplicación utilizando la programación orientada a objetos mediante una clase con sus 
atributos y métodos que permita registrar el ingreso mensual, otros ingresos y además los gastos
mensuales de un empleado. Determinar el ahorro mensual, semestral y anual proyectado.
 */
package Programa;
public class EmpleadoFinanzas {
    // Atributos para almacenar ingresos y gastos
    private double ingresoMensual;
    private double otrosIngresos;
    private double gastosMensuales;
    // Constructor de la clase
    public EmpleadoFinanzas(double ingresoMensual, double otrosIngresos, double gastosMensuales) {
        this.ingresoMensual = ingresoMensual;
        this.otrosIngresos = otrosIngresos;
        this.gastosMensuales = gastosMensuales;
    }
    // formula para calcular el ahorro mensual
    public double calcularAhorroMensual() {
        return (ingresoMensual + otrosIngresos) - gastosMensuales;
    }
    // formula  para calcular el ahorro semestral
    public double calcularAhorroSemestral() {
        return calcularAhorroMensual() * 6;
    }
    // formula para calcular el ahorro anual
    public double calcularAhorroAnual() {
        return calcularAhorroMensual() * 12;
    }
    // metodo get
    public double getIngresoMensual() {
        return ingresoMensual;
    }
    public double getOtrosIngresos() {
        return otrosIngresos;
    }
    public double getGastosMensuales() {
        return gastosMensuales;
    }
}
