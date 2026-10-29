
import java.util.Scanner;

/**
 * Ejercicio 05: Generar un algoritmo que permita calcular y mostrar el costos
 * de una computadora de escritorio. La misma es comprada por partes; CPU,
 * teclado, pantalla, ratón.
 * @author  Jeremy Castillo
 * @version 1.0
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double cpu, teclado, pantalla, ratón, valorComputadora;
        System.out.println("El valor del cpu: ");
        cpu = tcl.nextDouble();
        System.out.println("El valor del teclado: ");
        teclado = tcl.nextDouble();
        System.out.println("El valor de la pantalla: ");
        pantalla = tcl.nextDouble();
        System.out.println("El valor del ratón: ");
        ratón = tcl.nextDouble();
        valorComputadora = (cpu + teclado + pantalla + ratón); 
        System.out.println("El valor de la computadora es: $" + valorComputadora);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * El valor del cpu: 
200
El valor del teclado: 
40
El valor de la pantalla: 
120
El valor del rat�n: 
25
El valor de la computadora es: $ 385.0
 * Pegue aquí la evidencia de la ejecución del .java
 */