
import java.util.Scanner;

/**
 * Ejercicio 01: Generar un algoritmo que permite calcular y presentar el área 
 * de un triángulo. Los datos deben ser pedidos al usuario.
 * @author Jeremy Castillo
 * @version 1.0
 */
public class Ejercicio01 {
    public static void main(String[] args) {    
        Scanner tcl = new Scanner(System.in);
        double base, altura, area;
        System.out.println("Deme base: ");
        base = tcl.nextDouble();
        System.out.println("Deme altura:");
        altura = tcl.nextDouble();
        area = (base * altura)/ 2;
        System.out.println("Area: " + area);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme base: 
12
Deme altura:
6
Area: 36.0
BUILD SUCCESSFUL (total time: 10 seconds)

 * Pegue aquí la evidencia de la ejecución del .java
 */