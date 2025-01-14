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

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 7");
        System.out.println(" ");

        //Ej 7
        // Pide tres números y muestra cuál es el mayor.

        int aa = 20;
        int bb = 9;
        int cc = 4;

        if (aa > bb && aa > cc){
            System.out.println(aa + " es el mayor");
        } else if (bb > aa && bb > cc) {
            System.out.println(bb + " es el mayor");
        }else if (cc > aa && cc > bb){
            System.out.println(cc + " es el mayor");
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 8");
        System.out.println(" ");

        //Ej 8
        // Calcula la tarifa a pagar en un estacionamiento según estas reglas:
        //Menos de 2 horas: $5 por hora.
        //Entre 2 y 5 horas: $4 por hora.
        //Más de 5 horas: $3 por hora

        int t = 1;

        if (t < 2){
            System.out.println("El usuario debe pagar $5");
        } else if (t >= 2 && t <= 5) {
            System.out.println("El usuario debe pagar $4");
        } else if (t > 5) {
            System.out.println("El usuario debe pagar $3");
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 9");
        System.out.println(" ");

        //Ej 9
        //Calcula el descuento en una tienda:
        //Si compra más de $100, obtiene un 10% de descuento.
        //Si compra más de $500, obtiene un 20% de descuento.

        int compra = 600;
        double descuentoA = compra -  (compra * 0.1);
        double descuentoB = compra - (compra * 0.2);


        if (compra > 100){
            System.out.println(" el monto a pagar es de " + descuentoA);
        } else if (compra > 500) {
            System.out.println(" el monto a pagar es de " + descuentoB);
        }



    }
}
