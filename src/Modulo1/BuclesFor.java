package Modulo1;

public class BuclesFor {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 1");
        System.out.println(" ");

        //EJ 1
        //Imprime los números del 1 al 10 utilizando un bucle for.

        for (int i = 1; i <=10; i++){
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 2");
        System.out.println(" ");

        //Ej 2
        //Muestra la tabla de multiplicar del número 3 usando un bucle for.


        int num = 3;
        for (int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + ": " + i * num);
        }


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 3");
        System.out.println(" ");

        //Ej 3
        //Escribe un programa que imprima los números impares del 1 al 20.

        for (int i = 1; i <=20; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 4");
        System.out.println(" ");

        //Ej 4
        //Escribe un programa que imprima los números del 10 al 1 en orden descendente.

        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 5");
        System.out.println(" ");

        //Ej 5
        //Determina cuántos números del 1 al 100 son divisibles por 3.

        int acum = 0;
        for (int i = 1; i <=100; i++){
            if(i%3 == 0){
                acum = acum + 1;
            }

        }

        System.out.println("Del 1 al 100 hay " + acum + " numeros divisibles entre 3");

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 6");
        System.out.println(" ");

        //Ej 6
        //Calcula el factorial de un número ingresado por el usuario.

        int a = 5;
        int res = 1;
        for (int i = 1; i <= a; i++){
            res *= i;
        }
        System.out.println("La factorial de " + a + " es: " + res);

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 7");
        System.out.println(" ");

        //Ej 7
        //Imprime los números del 1 al 20 y, si el número es par, indica "par"; si es impar, indica "impar".

        for (int i = 1; i <= 20; i++){
            if (i%2 == 0){
                System.out.println(i + " es par");
            }else{
                System.out.println(i + " es impar");
            }
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 8");
        System.out.println(" ");

        //Ej 8
        //Dado un número N ingresado por el usuario, imprime el siguiente patrón:
        //Ejemplo para N = 4:
        //Copiar código
        //1
        //1 2
        //1 2 3
        //1 2 3 4

        int n = 4;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 9");
        System.out.println(" ");

        //Ej 9
        //Imprime el siguiente patrón utilizando un bucle:
        //markdown
        //Copiar código
        //*
        //**
        //***
        //****

        int m = 4;

        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 10");
        System.out.println(" ");

        //Ej 10
        //Escribe un programa que imprima los números del 1 al 100, pero omite los múltiplos de 5.
        for (int i = 1; i <= 100; i++){
            if (i%5 != 0){
                System.out.println(i);
            }
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 11");
        System.out.println(" ");

        //Ej 11
        //Calcula y muestra todos los números entre 1 y 100 que sean primos.

            for (int i = 2; i <= 100; i++){
                boolean esPrimo = true;

                for (int j = 2; j <= Math.sqrt(i); j++){
                    if(i%j == 0){
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo){
                    System.out.print(i + " ");
                }
            }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 12");
        System.out.println(" ");

        //Ej 12
        //Escribe un programa que genere el siguiente patrón para un número ingresado:
        //Ejemplo para N = 5:
        //Copiar código
        //    *
        //   **
        //  ***
        // ****
        //*****

        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= m - i; j++){
                System.out.print(" ");
            }

            for (int f = 1; f <= i; f++){
                System.out.print("*");
            }

            System.out.println();
        }












    }



}
