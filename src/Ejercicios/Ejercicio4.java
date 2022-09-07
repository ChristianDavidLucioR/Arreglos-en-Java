package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
/*
LEER 10 NUMEROS, GUARDARLOS EN UN ARREGLO, SE DEBE MOSTRAR EN EL SIGUIENTE ORDEN:
EL PRIMERO, LUEGO EL ULTIMO, EL SEGUNDO Y PENULTIMO, TERCERO, ETC.
 */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int [10]; //ARREGLO DE 10 ELEMENTOS

        //PEDIMOS LOS DATOS DEL ARREGLO
        for (int i = 0; i < 10; i++){
            System.out.print((i+1)+". Digite un número: ");
            numeros[i] = entrada.nextInt();
        }
        System.out.print("El resultado es: ");
        for (int i=0; i<5; i++){
            System.out.print(numeros[i] + " "); //PRIMERO, SEGUNDO
            System.out.print(numeros[9 - i] + " "); // Ultimo, PENULTIMO
        }
    }
}
