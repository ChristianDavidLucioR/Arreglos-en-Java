public class Arreglos {
    /*
    LA SINTAXIS PARA DECLARAR E INICIALIZAR UN ARRAYS ES:
    tipo_variable [] nombre_del_array = new tipo_variable [dimencion];
    EJEMPLO:
    int [] edad = new int [3];
     */
    public static void main(String[] args) {

        /* FORMA 1 PARA IMPRIMIR UN VECTOR
        int [] numeros = new int[3];
        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;
         */
        /*
        FORMA 2 PARA IMPRIMIR UN VECTOR
         */
        int [] numeros = {5,7,9,10};

        for (int i = 0; i<4; i++){
            System.out.println(numeros[i]);
        }
    }
}