package Modulo3;

public class Arrays {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 1");
        System.out.println(" ");

        //Crea un array de 5 números enteros e imprímelos en orden inverso.
        int[] numerosEnteros = {1,2,3,4,5};

        for (int i = numerosEnteros.length - 1; i >= 0; i--){

            int num = numerosEnteros[i];
            System.out.print(num + " ");
        }




    }



}
