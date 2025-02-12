package Modulo3;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        //Implementa Selection Sort para ordenar un array.

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 1");
        System.out.println(" ");

        int[] arr = {1, 23, 4, 3, 2, 124 , 4, 0, 879};

        System.out.println(Arrays.toString(arr));
        System.out.println(" ");

        int n = arr.length;

        for (int i = 0; i < n - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 2");
        System.out.println(" ");


        //Implementa Selection Sort para ordenar un array de números negativos.

        int[] numNegativos = {- 12, - 1, -123, 0, - 3, -5};

        System.out.println(Arrays.toString(numNegativos));
        System.out.println(" ");

        int na = numNegativos.length;

        for (int i = 0; i < na - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < na; j++){
                if (numNegativos[j] < numNegativos[minIndex]){
                    minIndex = j;
                }
            }
            int temp = numNegativos[minIndex];
            numNegativos[minIndex] = numNegativos[i];
            numNegativos[i] = temp;
        }

        System.out.println(Arrays.toString(numNegativos));


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 3");
        System.out.println(" ");


        //Ordena un array de 5 elementos en orden descendente.

        int[] arrDesc = {23, 2, 45, 3, 54};

        System.out.println(Arrays.toString(arrDesc));
        System.out.println(" ");

        int nb = arrDesc.length;

        for (int i = 0; i < nb - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < nb; j++){
                if (arrDesc[j] > arrDesc[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arrDesc[minIndex];
            arrDesc[minIndex] = arrDesc[i];
            arrDesc[i] = temp;
        }

        System.out.println(Arrays.toString(arrDesc));
        System.out.println(" ");


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 4");
        System.out.println(" ");

        //Aplica Selection Sort a un array de números repetidos y verifica que funcione bien.

        int[] numR = {1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 6, 6, 6, 6};

        System.out.println(Arrays.toString(numR));
        System.out.println(" ");

        int nc = numR.length;

        for (int i = 0; i < nc - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < nc; j++){
                if (numR[j] < numR[minIndex]){
                    minIndex = j;
                }
            }
            int temp = numR[minIndex];
            numR[minIndex] = numR[i];
            numR[i] = temp;
        }

        System.out.println(Arrays.toString(numR));

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 5");
        System.out.println(" ");

        //Implementa Selection Sort en un array de números pares e impares y
        //ordénalos

        int[] paresImpares = {3, 2, 5, 4, 1, 8, 12, 9, 7, 6};

        System.out.println(Arrays.toString(paresImpares));

        int nd = paresImpares.length;

        for (int i = 0; i < nd - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < nd; j++ ){
                    if (paresImpares[j] < paresImpares[minIndex]){
                        minIndex = j;
                    }
            }
            int temp = paresImpares[minIndex];
            paresImpares[minIndex] = paresImpares[i];
            paresImpares[i] = temp;
        }

        System.out.println(Arrays.toString(paresImpares));






    }
}
