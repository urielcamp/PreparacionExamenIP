package Modulo2;


//Ejercicio 1: Clase Película
//Crea una clase Pelicula que represente una película en una base de datos de cine.
//La clase debe tener los siguientes atributos: título, director y duración en minutos.
//
//Implementa tres constructores sobrecargados:
//
//Un constructor que tome el título y el director de la película.
//Un constructor que tome el título, el director y la duración en minutos.
//Un constructor sin parámetros que inicialice el título como "Título desconocido", el director como "Director desconocido", y la duración como 0.
//Incluye métodos getter (getTitulo(), getDirector(), getDuracion()) para obtener los valores de los atributos.
//
//Ejemplo de uso esperado:
//
//java
//Copiar
//Editar
//Pelicula pelicula1 = new Pelicula("Inception", "Christopher Nolan");
//System.out.println("Título: " + pelicula1.getTitulo());
//System.out.println("Director: " + pelicula1.getDirector());
//System.out.println("Duración: " + pelicula1.getDuracion());
//Salida esperada:
//
//makefile
//Copiar
//Editar
//Título: Inception
//Director: Christopher Nolan
//Duración: 0

public class PeliculaExamen {

    private String titulo;
    private String director;
    private int duracion;

    public PeliculaExamen(String titulo, String director){
        this.titulo = titulo;
        this.director = director;
        this.duracion = 0;

    }

    public PeliculaExamen(String titulo, String director, int duracion){
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public PeliculaExamen(){
        this.titulo = "Titulo desconocido";
        this.director = "Director desconocido";
        this.duracion = 0;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDirector(){
        return director;
    }

    public int getDuracion(){
        return duracion;
    }


}
