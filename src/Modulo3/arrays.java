package Modulo3;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 1");
        System.out.println(" ");

        //Crea un array de 5 números enteros e imprímelos en orden inverso.
        int[] numerosEnteros = {1, 2, 3, 4, 5};

        for (int i = numerosEnteros.length - 1; i >= 0; i--) {

            int num = numerosEnteros[i];
            System.out.print(num + " ");
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 2");
        System.out.println(" ");

        //Escribe un método que cuente cuántos números pares hay en un array de enteros.

        int[] n = new int[10];

        for (int i = 1; i < n.length; i++) {
            n[i] = i;
        }

        for (int m : n) {
            System.out.print(m + " ");
        }

        System.out.println();

        contarParesEjDos(n);

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 3");
        System.out.println(" ");

        //Crea un array de 5 números enteros e imprímelos en orden.

        int[] m = {1, 2, 3, 4, 5};

        for (int nl: m){
            System.out.print(nl + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(m));

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 4");
        System.out.println(" ");

        // Escribe un método que devuelva el número más grande de un array de enteros.

        int[] nm = {1, 34, 42, 2, 540, 5, 100, 98, 3, 8};
        buscarMayor(nm);



        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 5");
        System.out.println(" ");


        // Implementa una función que busque un número en un array y devuelva true si lo encuentra.

        int[] mn = {1, 34, 54, 2, 45, 3, 8, 9, 98, 84, 3, 22, 5};

        System.out.println(buscarNumero(mn, 98));

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 6");
        System.out.println(" ");


        //Crea un array con los primeros 10 números de la serie de Fibonacci.

        int[] fibonacci = new int[10];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++){
            int num = fibonacci[i - 1] + fibonacci[i - 2];
            fibonacci[i] = num;
        }

        System.out.println(Arrays.toString(fibonacci));

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 7");
        System.out.println(" ");


        //Escribe un método que reemplace todos los valores negativos en un array con 0.

        int[] k = {1, -3, 43, 2, -4, -98, 3};

        System.out.println(Arrays.toString(remplazarNegativos(k)));

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 8");
        System.out.println(" ");


        //crear un metodo que devuelva un array con el factorial de la longitud de dicho array.

        int[] p = new int[5];

        System.out.println(Arrays.toString(factorialArray(p)));








    }


        public static int[] factorialArray(int[] n){
            n[0] = 1;
            n[1] = 2;

            int num = 1;
            for (int i = 1; i < n.length; i++){
                num *= i + 1;
                n[i] = num;
             }


            return n;
        }

        public static int[] remplazarNegativos(int[] n){
            for (int i = 1; i < n.length; i++){
                if (n[i] < 0){
                    n[i] = 0;
                }
            }

            return n;
        }


        public static boolean buscarNumero(int[] n, int num){

            boolean e = false;

            for (int i = 0; i < n.length; i++) {
                if (num == n[i]) {
                    e = true;
                }
            }

            return e;

        }


        public static void buscarMayor(int[] n){
            int num = 0;

            for (int i = 0; i < n.length; i++){


                if (num < n[i]){
                    num = n[i];
                }

            }
            System.out.println(num);
        }

        public static void contarParesEjDos(int[] n){

            int suma = 0;

            for (int i = 1; i < n.length; i++){
                if (n[i]%2 == 0){
                    suma++;
                }
            }

            System.out.println("El array tiene: " + suma + " numeros pares");
        }










}
