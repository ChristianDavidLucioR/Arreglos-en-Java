package Ejercicios;

import java.util.Scanner;

/*
Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido.
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner prueba = new Scanner(System.in);

        int nArreglo;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Bienvenido! Si vas a ingresar un número decimal, recuerda colocarle coma (,)");
        System.out.print("Por favor ingrese la cantidad del arreglo: ");
        nArreglo = prueba.nextInt();

        float [] numero = new float [nArreglo];

        System.out.println("Ingrese los números: ");

        for (int i = 0; i < nArreglo; i++){
            System.out.print((i+1)+ ": ");
            numero [i] = prueba.nextFloat();
        }
        System.out.println("Los números del arreglo son: ");
        for (int i = 0; i <nArreglo; i++){
            System.out.print(numero[i]+" - ");
        }
        System.out.println("\n-----------------------------------------------------------------------------------------");
    }
}
