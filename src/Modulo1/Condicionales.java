package Modulo1;

public class Condicionales {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 1");
        System.out.println(" ");

        //Ej 1
        //Escribe un programa que lea un número y determine si es positivo o negativo.

        int n = 4;

        if (n>= 0){
            System.out.println(n + " es positivo");
        }else {
            System.out.println(n + " es negativo");
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 2");
        System.out.println(" ");

        //Ej 2
        //Comprueba si un número es par o impar.

        if (n%2 == 0){
            System.out.println(n + " es par");
        }else {
            System.out.println(n + " es impar");
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 3");
        System.out.println(" ");

        //Ej 3
        //Determina si un número está entre 10 y 100 (ambos incluidos).

        int num = 57;
        if (num >= 10 && num <= 100){
            System.out.println(num + " esta entre 10 y 100");
        }else {
            System.out.println(num + " no esta entre 10 y 100");
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 4");
        System.out.println(" ");

        //Ej 5
        //Lee un carácter y verifica si es una vocal.

        char car = 'e';

        if (
                car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u'
        ){
            System.out.println(car + " es un caracter");
        }else {
            System.out.println(car + " no es un caracter");
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 5");
        System.out.println(" ");

        //Ej 5
        //Comprueba si un número es divisible entre 5.

        int a = 10;
        if (a%5 == 0){
            System.out.println(a + " es divisible entre 5");
        }else {
            System.out.println(a + " no es divisible entre 5");
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 6");
        System.out.println(" ");

        //Ej 6
        // Escribe un programa que verifique si dos números son iguales.

        int b = 2;
        int c = 2;

        if (b == c){
            System.out.println(b + " y " + c + " son iguales");
        }else {
            System.out.println("no son iguales");
        }


    }
}
