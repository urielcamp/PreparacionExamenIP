package Modulo3;

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

        for(int i = 1; i <= 10; i++) {
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

        for(int i = n.size() -1; i >= 0; i-- ){
            System.out.print(n.get(i) + " ");
        }

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 5");
        System.out.println(" ");

        //Crea una LinkedList y usa el método poll() para eliminar y mostrar el primer elemento.

        LinkedList<Integer> m = new LinkedList<>();

        for (int i = 1; i <= 5; i++){
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


        for (int i = 1; i <= 5; i++){
            c.add(i);
        }

        System.out.println(c);

        Integer[] Array = c.toArray(new Integer[0]);

        for (int i = 0; i < Array.length ; i++){
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

        for (Double num: o){
            if (num < menor){
                menor = num;
            }

            if (num > mayor){
                mayor = num;
            }
        }

        System.out.println("El valor menor es: " + Double.valueOf(menor));
        System.out.println("El valor mayor es: " + Double.valueOf(mayor));














































    }
}
