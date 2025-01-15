package Modulo1;

public class FuncionesYModularidad {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 1");
        System.out.println(" ");

        System.out.println(sumar(2, 1));

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 2");
        System.out.println(" ");

        System.out.println(esPar(9));

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 3");
        System.out.println(" ");

        System.out.println(potencia(3.0, 2.0));

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 4");
        System.out.println(" ");

        tablaMultiplicar(2);





    }


    //EJ1
    //Función de suma:
    //Crea una función llamada sumar que reciba dos números como parámetros y retorne su suma.
    //Usa la función para sumar dos números ingresados por el usuario.

    public static int sumar(int a,int b){
        return a + b;
    }


    //EJ2
    //Número par o impar:
    //Crea una función llamada esPar que reciba un número entero y
    // retorne true si es par y false si es impar.

    public static String esPar(int a){
        if (a%2 == 0){
            return "es par";
        }else {
            return "es impar";
        }
    }

    //EJ3
    //Calcular la potencia:
    //Escribe una función llamada potencia que reciba dos números como parámetros: base y exponente.
    // Retorna el resultado de elevar la base al exponente.

    public static double potencia(double a, double b){
        return Math.pow(a, b);

    }

    //EJ4
    //Tabla de multiplicar:
    //Escribe una función llamada tablaMultiplicar que reciba un número y
    // retorne su tabla de multiplicar del 1 al 10 en forma de cadena.

    public static void tablaMultiplicar(int a){
        String mult = " ";
        for (int i = 1; i<= 10; i++){
            System.out.println(mult = a + " * " + i + " = " + a * i);
        }
    }

    //EJ5
    //Tabla de multiplicar:
    //Escribe una función llamada tablaMultiplicar que reciba un número y
    // retorne su tabla de multiplicar del 1 al 10 en forma de cadena.



}
