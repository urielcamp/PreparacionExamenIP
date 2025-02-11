package Modulo3;

import java.util.Arrays;

public class ArraysBidi {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 1");
        System.out.println(" ");

        //Crear y mostrar una matriz 3×3 con valores ingresados por el usuario.

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++ ){
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 2");
        System.out.println(" ");

        //Multiplicar todos los elementos de una matriz 3×3 por un número dado.

        int[][] m = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = 2;
        int res = 0;

        //Solucion 1

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                    res += n * m[i][j];
            }
        }

        System.out.println(res);

        System.out.println();

        //Solucion 2

        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = m[i][j] * n;
            }
        }

        System.out.println(Arrays.deepToString(m));


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 3");
        System.out.println(" ");

        //Encontrar el valor máximo y mínimo dentro de una matriz.

        int[][] maymin = {
                {1, 23, 45},
                {2, 34, 4},
                {-2, 35, 984}
        };

        int may = 0;
        int min = 0;

        for (int i = 0; i < maymin.length; i++){
            for (int j = 0; j < maymin[i].length; j++){
                if (may < maymin[i][j]){
                   may = maymin[i][j];
                }

                if (min >= maymin[i][j]){
                    min = maymin[i][j];
                }
            }
        }

        System.out.println("El valor mayor de la matriz es:" + may + ", y el menor es: " + min);




    }




}
