package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner media = new Scanner(System.in);

        float numeros [] = new float [5];

        float sumaPos = 0, sumaNeg = 0, mediaPos, mediaNeg;
        int conteoPos = 0, conteoNeg =0, conteoCeros = 0;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Guardando los números en el arreglo");
        for (int i = 0; i <5; i++){
            System.out.print((i+1)+". Digite un número: ");
            numeros [i] = media.nextFloat();

            if (numeros [i] == 0){
                conteoCeros++;
            } else if (numeros [i] >0) {
                sumaPos += numeros [i];
                conteoPos++;
            }else{
                sumaNeg += numeros [i];
                conteoNeg++;
            }
        }
        //NUMEROS POSITIVOS
        if (conteoPos == 0){
            System.out.println("No se puede dividir entre cero (0) para los numeros positivos");
        }else {
            mediaPos = sumaPos / conteoPos;
            System.out.println("La media de los números positivos es: "+mediaPos);
        }
        if (conteoNeg == 0){
            System.out.println("No se puede dividir entre cero (0) para los numeros negativos");
        }else {
            mediaNeg = sumaNeg / conteoNeg;
            System.out.println("La media de los numeros negativos es: "+mediaNeg);
        }
        System.out.println("La cantidad de ceros son: "+conteoCeros);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
