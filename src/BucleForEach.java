public class BucleForEach {

    public static void main(String[] args) {

        String [] nombre = {"Simon", "Dice", "For", "Each"};
        /*
        for (int a = 0; a < nombre.length; a++){ // Devuelve todos los elementos que hay en el arreglo
            System.out.println(nombre[a]);
        }
        */

        // Bucle For each
        for (String a: nombre) System.out.println(a);
    }
}
