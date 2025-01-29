import Modulo2.Calculadora;
import Modulo2.Gerente;
import Modulo2.LibroExamen;
import Modulo2.Persona;
import Modulo2.PeliculaExamen;
import Modulo2.VehiculoExamen;

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


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 5");
        System.out.println(" ");

        prs.tiempoParaJubilarse();

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 6");
        System.out.println(" ");

        PeliculaExamen pelicula1 = new PeliculaExamen("Inception", "Christopher Nolan");
        System.out.println("Título: " + pelicula1.getTitulo());
        System.out.println("Director: " + pelicula1.getDirector());
        System.out.println("Duración: " + pelicula1.getDuracion());

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 7");
        System.out.println(" ");

        VehiculoExamen auto = new VehiculoExamen("Toyota", "Corolla", 2020);
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Año: " + auto.getAnoFabricacion());

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 8");
        System.out.println(" ");




    }
}