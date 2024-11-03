
package Programa;
import java.util.Scanner;
public class RegistroFinanzas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita al usuario que ingrese los datos financieros
        System.out.print("Ingrese el ingreso mensual: ");
        double ingresoMensual = scanner.nextDouble();
        System.out.print("Ingrese otros ingresos: ");
        double otrosIngresos = scanner.nextDouble();
        System.out.print("Ingrese los gastos mensuales: ");
        double gastosMensuales = scanner.nextDouble();

   EmpleadoFinanzas empleado = new EmpleadoFinanzas(ingresoMensual, otrosIngresos, gastosMensuales);

        mostrarResultados(empleado);
     }

   //mostrar los resultados
    private static void mostrarResultados(EmpleadoFinanzas empleado) {
        System.out.println("Ahorro mensual: " + empleado.calcularAhorroMensual());
        System.out.println("Ahorro semestral: " + empleado.calcularAhorroSemestral());
        System.out.println("Ahorro anual: " + empleado.calcularAhorroAnual());
    }
}
