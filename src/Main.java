import Modulo2.Calculadora;
import Modulo2.Gerente;
import Modulo2.LibroExamen;
import Modulo2.Persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 1");
        System.out.println(" ");

        //Clases y objetos
        //Ej 1
        Persona prs = new Persona("pedro", 18);
        System.out.println(prs.getNombre() + " " + prs.getEdad());

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 2");
        System.out.println(" ");

       prs.saludar();

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 3");
        System.out.println(" ");

        System.out.println(prs.esMayorDeEdad());

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 4");
        System.out.println(" ");

        Calculadora cl = new Calculadora();

        System.out.println(cl.sumar(10, 10));
        System.out.println(cl.restar(10, 5));
        System.out.println(cl.multiplicar(2, 2));
        System.out.println(cl.dividir(2.0, 2.0));

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio examen 1");
        System.out.println(" ");


        LibroExamen libro1 = new LibroExamen("1984", "George Orwell");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Número de páginas: " + libro1.getNroPaginas());

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio examen 2");
        System.out.println(" ");

        Gerente gerente1 = new Gerente("Juan Perez", 50000, 5);
        System.out.println("Bono anual: " + gerente1.calcularBonoAnual());
        System.out.println("Salario anual: " + gerente1.calcularSalarioAnual());


    }
}