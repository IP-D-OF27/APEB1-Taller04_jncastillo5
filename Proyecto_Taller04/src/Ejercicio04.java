
import java.util.Scanner;

/**
 * Ejercicio 04: Generar un algoritmo que permita calcular y mostrar el valor 
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por 
 * minutos, el número de minutos consumidos en el mes.
 * @author Jeremy Castillo
 * @version 1.0
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoMinuto, valorPlantilla;
        int minutosConsumidos;
        System.out.println("Ingrese el costo por minutos: ");
        costoMinuto = tcl.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos al mes: ");
        minutosConsumidos = tcl.nextInt();
        valorPlantilla = costoMinuto * minutosConsumidos;
        System.out.println("El valor de la plantilla es: $" + valorPlantilla);      
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Ingrese el costo por minutos: 
0,14
Ingrese el numero de minutos consumidos al mes: 
148
El valor de la plantilla es: $20.720000000000002
 * Pegue aquí la evidencia de la ejecución del .java
 */