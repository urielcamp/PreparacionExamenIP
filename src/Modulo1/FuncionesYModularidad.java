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

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 5");
        System.out.println(" ");

        Factorial(5);

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 6");
        System.out.println(" ");

        System.out.println(esPrimo(7));





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
    //Factorial:
    //Escribe una función llamada factorial que reciba un número entero positivo y
    // retorne su factorial. Usa un bucle para calcularlo.

    public static void Factorial(int a){
        int aux = 1;
        for (int i = 1; i <= a; i++){
             aux = aux * i;
        }
        System.out.println(aux);
    }

    //EJ6
    //Crea una función llamada esPrimo que reciba un número entero y
    // retorne true si es primo y false si no lo es.

    public static boolean esPrimo(int a){
        if (a <= 1){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(a); i++){
            if (a%i == 0){
                return false;
            }
        }
        return true;
    }

    //EJ7
    //Crea una función llamada esPrimo que reciba un número entero y
    // retorne true si es primo y false si no lo es.

    public static boolean esPri(int a){
        if (a <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(a); i++){
            if (a%i == 0){
                return false;
            }
        }
        return true;
    }

    //EJ8
    //Serie de Fibonacci:
    //Escribe una función llamada fibonacci que reciba un número n y
    //retorne una lista con los primeros n números de la serie de Fibonacci.





}
