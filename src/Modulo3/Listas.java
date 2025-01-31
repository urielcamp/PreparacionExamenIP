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









































    }
}
