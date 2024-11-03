
package Programa;
import java.util.Scanner;
public class Rcompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // Solicita al usuario que ingrese los valores de las compras
        System.out.print("Ingrese el valor de la compra 1: ");
        double compra1 = scanner.nextDouble();
        System.out.print("Ingrese el valor de la compra 2: ");
        double compra2 = scanner.nextDouble();
        System.out.print("Ingrese el valor de la compra 3: ");
        double compra3 = scanner.nextDouble();
        System.out.print("Ingrese el valor de la compra 4: ");
        double compra4 = scanner.nextDouble();

        // Creamos un objeto Compras con los valores ingresados
        Compras compras = new Compras(compra1, compra2, compra3, compra4);
       mostrarResultados(compras);
    }

    // mostrar los resultados
    private static void mostrarResultados(Compras compras) {
        System.out.println("Total de compras: " + compras.calcularTotal());
        System.out.println("Promedio de compras: " + compras.calcularPromedio());
        System.out.println("Compra mayor: " + compras.obtenerCompraMayor());
        System.out.println("Compra menor: " + compras.obtenerCompraMenor());
    }
}
