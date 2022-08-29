package Ejercicios;

import java.util.Scanner;

/*
Pedir 5 números al usuario, guardarlos en un arreglo y mostrarlos en orden inverso al introducido
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner inverso = new Scanner(System.in);

        int numArreglo;

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido! Al Inverso Números @-@");
        System.out.print("Ingrese el tamaño del arreglo: ");
        numArreglo = inverso.nextInt();

        int [] numero = new int [numArreglo];

        for (int i = 0; i <numArreglo; i++){
            System.out.print("Digite el número "+(i+1)+": ");
            numero [i] = inverso.nextInt();
        }
        System.out.println("Los números en orden Inverso son: ");
        for (int i = 4; i >= 0; i--){
            System.out.print(numero[i] +" - ");
        }
        System.out.println("\n------------------------------------------------------------------------------------------");
    }
}