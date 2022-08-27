import java.util.Scanner;

public class LlenarArreglo {

    public static void main(String[] args) {

        Scanner llenar = new Scanner(System.in);

        int nElementos;

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        nElementos = llenar.nextInt();

        char [] letras = new char[nElementos];

        System.out.println("Ingrese los elementos del arreglo: ");

        for (int i = 0; i <nElementos; i++){
            System.out.print((i+1)+ "°: Digite un caracter: ");
            letras [i] = llenar.next().charAt(0);
        }
        System.out.println("\nLos caracteres del arreglo son: ");
        for (int i = 0; i <nElementos; i++){
            System.out.print(letras[i]+ "-");
        }
        System.out.println("\n------------------------------------------------------------------------------------------");
    }
}
