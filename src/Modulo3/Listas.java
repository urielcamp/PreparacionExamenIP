package Modulo3;

import java.util.Collections;
import java.util.LinkedList;

public class Listas {
    public static void main(String[] args) {

        //Crea una LinkedList<Integer> con los números del 1 al 10 y elimina los números pares.

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 1");
        System.out.println(" ");

        LinkedList<Integer> pLista = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                pLista.remove(Integer.valueOf(i));
            } else {
                pLista.add(i);
            }
        }

        System.out.println(pLista);


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 2");
        System.out.println(" ");


        //Inserta un elemento en la primera posición y otro en la última posición de una LinkedList<String>.

        LinkedList<String> palabras = new LinkedList<>();


        palabras.add("En el medio");
        palabras.add("Tambien en el medio");
        palabras.addFirst("Primero");
        palabras.addLast("Ultimo");

        System.out.println(palabras);

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 3");
        System.out.println(" ");


        //Usa LinkedList para almacenar nombres y verifica si un nombre específico está en la lista.

        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Jorge");
        nombres.add("Fiorella");
        nombres.add("Veronica");
        nombres.add("Walter");
        nombres.add("Sonia");

        System.out.println(nombres.contains("Sonia"));


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 4");
        System.out.println(" ");


        //Crea una LinkedList de nombres y agrégale 5 nombres. Luego, imprime todos los nombres en orden inverso.

        LinkedList<String> n = new LinkedList<>();

        n.add("Javier");
        n.add("Lucas");
        n.add("Fiorella");
        n.add("Rebecca");
        n.add("Uriel");

        for (int i = n.size() - 1; i >= 0; i--) {
            System.out.print(n.get(i) + " ");
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 5");
        System.out.println(" ");

        //Crea una LinkedList y usa el método poll() para eliminar y mostrar el primer elemento.

        LinkedList<Integer> m = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            m.add(i);
        }

        System.out.println(m);

        System.out.println(m.poll());

        System.out.println(m);

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 6");
        System.out.println(" ");


        //Convierte una LinkedList en un ArrayList.


        LinkedList<Integer> c = new LinkedList<>();


        for (int i = 1; i <= 5; i++) {
            c.add(i);
        }

        System.out.println(c);

        Integer[] Array = c.toArray(new Integer[0]);

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 7");
        System.out.println(" ");


        //Crea una LinkedList<Double> y encuentra el número mayor y el menor sin usar Collections.

        LinkedList<Double> o = new LinkedList<>();

        o.add(9.0);
        o.add(2.0);
        o.add(54.0);
        o.add(2.0);
        o.add(0.5);


        double menor = o.get(0);
        double mayor = o.get(0);

        for (Double num : o) {
            if (num < menor) {
                menor = num;
            }

            if (num > mayor) {
                mayor = num;
            }
        }

        System.out.println("El valor menor es: " + Double.valueOf(menor));
        System.out.println("El valor mayor es: " + Double.valueOf(mayor));

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 8");
        System.out.println(" ");

        //Implementa una LinkedList que elimine todos los números negativos.

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(-2);
        numbers.add(4);
        numbers.add(2);
        numbers.add(-1);
        numbers.add(3);
        numbers.add(-1);

        for (int l = 0; l <= numbers.size() - 1; l++) {
            if (numbers.get(l) < 0) {
                numbers.remove(numbers.get(l));
            }
        }

        System.out.println(numbers);


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 9");
        System.out.println(" ");

        LinkedList<Integer> list = fibonacci(10);

        System.out.println(list);


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 10");
        System.out.println(" ");


        //Implementa una LinkedList<Integer> donde cada número se duplique si es impar.

        LinkedList<Integer> duplicados = new LinkedList<>();

        for (int i = 1; i <= 10; i++){
            duplicados.add(i);
        }

        System.out.println(duplicados);

        for (int i = 0; i <= duplicados.size() - 1; i++){
            if (duplicados.get(i)%2 != 0){
                int num = duplicados.get(i) * 2;

                duplicados.set(i, num);
            }
        }

        System.out.println(duplicados);



        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 11");
        System.out.println(" ");

        ////Escribe una función llamada factoriales que, dado un entero n,
        //// calcule los factoriales de todos los números desde 0 hasta n y
        // devuelva una lista con los resultados.
        ////
        ////El factorial de un número k (denotado como k!) es el producto de todos los
        // enteros positivos menores o iguales a k.
        //// Por ejemplo,
        // el factorial de 5 es 5! = 5 * 4 * 3 * 2 * 1 = 120.
        ////
        ////factorial(5) , me devuelve:
        ////
        ////[1, 1, 2, 6, 24, 120]
        ////


        System.out.println(Factorial(5));





        System.out.println("------------------------------------------------------");

        LinkedList<Integer> prueba = new LinkedList<>();
        prueba.add(1);
        prueba.add(2);
        prueba.add(3);
        prueba.add(4);

        System.out.println(cuadrado(prueba));







    }

    //Escribe una función llamada fibonacci que reciba un número n y
    //retorne una lista con los primeros n números de la serie de Fibonacci.

    public static LinkedList<Integer> fibonacci(int n){
        LinkedList<Integer> fibLista = new LinkedList<>();

        if (n <= 0) return fibLista;
        fibLista.add(0);

        if (n == 1) return fibLista;
        fibLista.add(1);

        if (n == 2) return fibLista;

        for (int i = 2; i < n; i++){
            int numNuevo = fibLista.get(i - 1) + fibLista.get(i -2 );
            fibLista.add(numNuevo);
        }

        return fibLista;





    }


    //-----------------------------******************************---------------------------------


    //factorial

    public static LinkedList<Integer>Factorial(int n){

        LinkedList<Integer> factList = new LinkedList<>();

        int fac = 1;

        for (int i = 0; i <= n; i++){
            if(n > 0){
                fac *= i;
            }
            factList.add(fac);
        }

        return factList;

    }



        public static LinkedList<Integer> cuadrado(LinkedList<Integer> numeros) {
            // su codigo aqui
            LinkedList<Integer> pruebaList = new LinkedList<>();
            int res = 0;

            for(int i = 0; i < numeros.size(); i++){
                res = numeros.get(i) * numeros.get(i);
                pruebaList.add(res);
            }




            return pruebaList;
        }





















































}
