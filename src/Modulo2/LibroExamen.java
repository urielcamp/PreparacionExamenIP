package Modulo2;


// //   Crea una clase Libro que represente un libro en una biblioteca.
//      La clase debe tener los siguientes atributos: título, autor, y número de páginas.
//      Implementa varios constructores sobrecargados para la clase Libro de la siguiente manera:
//
//    //Un constructor que tome el título y el autor del libro.
//    //Un constructor que tome el título, el autor y el número de páginas del libro.
//    //Un constructor sin parámetros que inicialice el título como "Título desconocido",
//    el autor como "Autor desconocido", y el número de páginas como 0.
//    //Consejo: Observa bien el caso de prueba, allí tienes información sobre el nombre de la clase,
//    tipos de datos de los atributos, nombres de los métodos get y tipo de dato de retorno.
//    //
//    //NO ES NECESARIO CREAR EL MÉTODO MAIN (solamente la clase Libro con sus 3 atributos,
//    3 constructores y 3 métodos get).
//    //
//    //Por ejemplo:
//    //
//    //Prueba	Resultado
//    //Libro libro1 = new Libro("1984", "George Orwell");
//    //System.out.println("Título: " + libro1.getTitulo());
//    //System.out.println("Autor: " + libro1.getAutor());
//    //System.out.println("Número de páginas: " + libro1.getNumeroPaginas());
//    //Título: 1984
//    //Autor: George Orwell
//    //Número de páginas: 0

public class LibroExamen {

    private String titulo;
    private String autor;
    private int nroPaginas;

    public LibroExamen(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public LibroExamen(String titulo, String autor, int nroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;

    }

    public LibroExamen(){
        this.titulo = "Titulo desconocido";
        this.autor = "Autor desconocido";
        this.nroPaginas = 0;
    }


    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getNroPaginas(){
        return nroPaginas;
    }






}
