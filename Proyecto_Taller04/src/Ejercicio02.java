
import java.util.Scanner;

/**
 * Ejercicio 02: Generar un algoritmo que permite ingresar los gastos de tres
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los 
 * hijos del padre de familia.
 * @author Jeremy Castillo
 * @version 1.0
 */
public class Ejercicio02 {
    public static void main(String[] args) {    
        Scanner tcl = new Scanner(System.in);
        int gastosHijo1, gastosHijo2, gastosHijo3, totalGastos;
        System.out.println("Deme 3 gastos");
        gastosHijo1 = tcl.nextInt();
        gastosHijo2 = tcl.nextInt();
        gastosHijo3 = tcl.nextInt();
        totalGastos = (gastosHijo1 + gastosHijo2 + gastosHijo3);
        System.out.println("El tolal de gastos es:" + totalGastos);        
    }
}
/***
 * EVIDENCIA DEL RUN:
Deme 3 gastos
120
122
230
El tolal de gastos es:472
 * Pegue aquí la evidencia de la ejecución del .java
 */