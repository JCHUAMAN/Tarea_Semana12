
package Programa;
import java.util.Scanner;
public class RegistroEmpleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  ingreso los sueldos
        System.out.print("Ingrese el sueldo 1: ");
        double sueldo1 = scanner.nextDouble();
        System.out.print("Ingrese el sueldo 2: ");
        double sueldo2 = scanner.nextDouble();
        System.out.print("Ingrese el sueldo 3: ");
        double sueldo3 = scanner.nextDouble();
        System.out.print("Ingrese el sueldo 4: ");
        double sueldo4 = scanner.nextDouble();
       
        Empleado empleado = new Empleado(sueldo1, sueldo2, sueldo3, sueldo4);

        mostrarResultados(empleado);
    }

    // mostrar los resultados
    private static void mostrarResultados(Empleado empleado) {
        System.out.println("Total de sueldos: " + empleado.calcularTotal());
        System.out.println("Promedio de sueldos: " + empleado.calcularPromedio());
        System.out.println("Sueldo mayor: " + empleado.obtenerSueldoMayor());
        System.out.println("Sueldo menor: " + empleado.obtenerSueldoMenor());
    }
}

