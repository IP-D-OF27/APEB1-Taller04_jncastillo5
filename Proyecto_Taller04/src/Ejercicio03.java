
import java.util.Scanner;

/**
 * Ejercicio 03: Se desea desarrollar un algoritmo que permita mostrar la tabla
 * de multiplicar de un número ingresado por el usuario; solo en el caso que el
 * valor del número esté entre 2 y 6. No use aún, ciclos repetitivos.
 *
 * @author Jeremy Castillo
 * @version 1.0
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numero, resultado;
        System.out.print("Ingrese un numero entre 2 y 6: ");
        numero = tcl.nextInt();
        if (numero >= 2 && numero <= 6) {
            resultado = numero * 1;
            System.out.println(numero + " x 1 = " + resultado);
            resultado = numero * 2;
            System.out.println(numero + " x 2 = " + resultado);
            resultado = numero * 3;
            System.out.println(numero + " x 3 = " + resultado);
            resultado = numero * 4;
            System.out.println(numero + " x 4 = " + resultado);
            resultado = numero * 5;
            System.out.println(numero + " x 5 = " + resultado);
            resultado = numero * 6;
            System.out.println(numero + " x 6 = " + resultado);
            resultado = numero * 7;
            System.out.println(numero + " x 7 = " + resultado);
            resultado = numero * 8;
            System.out.println(numero + " x 8 = " + resultado);
            resultado = numero * 9;
            System.out.println(numero + " x 9 = " + resultado);
            resultado = numero * 10;
            System.out.println(numero + " x 10 = " + resultado);
        } else {
            System.out.println("El numero debe estar entre 2 y 6.");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese un numero entre 2 y 6: 4
4 x 1 = 4
4 x 2 = 8
4 x 3 = 12
4 x 4 = 16
4 x 5 = 20
4 x 6 = 24
4 x 7 = 28
4 x 8 = 32
4 x 9 = 36
4 x 10 = 40
BUILD SUCCESSFUL (total time: 4 seconds)
 * Pegue aquí la evidencia de la ejecución del .java
 */
