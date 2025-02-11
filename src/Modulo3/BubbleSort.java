package Modulo3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 1");
        System.out.println(" ");

        //Implementa Bubble Sort para ordenar un array de números enteros.

        int[] numeros = {1 , 32, 45, 2, 13, 34 , 2, 3, 48, 4, 5, 980};



        System.out.println(Arrays.toString(numeros));
        System.out.println(" ");

        int n = numeros.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (numeros[j] > numeros[j + 1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numeros));


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 2");
        System.out.println(" ");

        //Modifica el algoritmo para ordenar en orden descendente.

        int[] num = {1 , 32, 45, 2, 13, 34 , 2, 3, 48, 4, 5, 980};

        System.out.println(Arrays.toString(num));
        System.out.println(" ");

        int na = num.length;

        for (int i = 0; i < na - 1; i++){
            for (int j = 0; j < na - i - 1; j++){
                if (num[j] < num[j + 1]){
                    int temp = num[j];
                    num[j] = num[j+ 1];
                    num[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(num));



        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 3");
        System.out.println(" ");

        //Cuenta cuántas veces se realizan intercambios en una ejecución de Bubble Sort.

        int[] p = {12 , 23, 432, 3, 2, 124, 3, 2, 1, 948, 21, 43, 0, 21};

        System.out.println(Arrays.toString(p));

        System.out.println(" ");

        int np = p.length;
        int count = 0;

        for (int i = 0; i < np - 1; i++){
            for (int j = 0; j < np - i - 1; j++){
                if (p[j] > p[j + 1]){
                    int temp = p[j];
                    p[j] = p[j+ 1];
                    p[j+ 1] = temp;
                }
                count++;
            }
        }

        System.out.println(Arrays.toString(p));

        System.out.println(" ");

        System.out.println("Se realizaron: " + count + " intercambios");


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 4");
        System.out.println(" ");

        //Implementa una función que verifique si un array ya está ordenado antes de aplicar Bubble Sort.

        int[] pa = {1, 2, 3, 4, 9, 3};

        System.out.println(Arrays.toString(pa));
        System.out.println(" ");

        System.out.println(estaOrdenado(pa));


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 5");
        System.out.println(" ");


        //Modifica Bubble Sort para ordenar solo la primera mitad del array.


        int[] pb = {12 , 23, 432, 3, 2, 124, 3, 2, 1, 948, 21, 43, 0, 21};

        System.out.println(Arrays.toString(pb));
        System.out.println(" ");

        int o = pb.length;
        int mitad = o / 2;
        for (int i = 0; i < mitad - 1; i++){
            for (int j = 0; j < mitad - i - 1; j++){
                if (pb[j] > pb[j + 1]){
                    int temp = pb[j];
                    pb[j] = pb[j + 1];
                    pb[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(pb));
        System.out.println(" ");














    }



    public static boolean estaOrdenado(int[] n){

        int arrLong = n.length;
        boolean ordenado = true;

        for (int i = 0; i < arrLong - 1; i++){
            for (int j = 0; j < arrLong - i - 1; j++){
                if (n[j] > n[j + 1]){
                    ordenado = false;
                }
            }
        }


        return ordenado;
    }



}















