package Modulo2;

//Ejercicio 3: Clase Estudiante
//Crea una clase Estudiante que represente a un estudiante de una escuela o universidad.
//Debe tener los siguientes atributos: nombre, carrera y año de ingreso.
//
//Implementa tres constructores sobrecargados:
//
//Un constructor que tome el nombre y la carrera.
//Un constructor que tome el nombre, la carrera y el año de ingreso.
//Un constructor sin parámetros que inicialice el nombre como "Nombre desconocido", la carrera como "Carrera desconocida", y el año de ingreso como 0.
//Incluye métodos getter (getNombre(), getCarrera(), getAnioIngreso()) para obtener los valores de los atributos.
//
//Ejemplo de uso esperado:
//
//java
//Copiar
//Editar
//Estudiante estudiante1 = new Estudiante("Ana", "Ingeniería en Software");
//System.out.println("Nombre: " + estudiante1.getNombre());
//System.out.println("Carrera: " + estudiante1.getCarrera());
//System.out.println("Año de ingreso: " + estudiante1.getAnioIngreso());
//Salida esperada:
//
//yaml
//Copiar
//Editar
//Nombre: Ana
//Carrera: Ingeniería en Software
//Año de ingreso: 0


public class EstudianteExamen {

    private String nombre;
    private String carrera;
    private int anioIngreso;

    public EstudianteExamen(String nombre, String carrera){
        this.nombre = nombre;
        this.carrera = carrera;
        this.anioIngreso = 0;
    }

    public EstudianteExamen(String nombre, String carrera, int anioIngreso){
        this.nombre = nombre;
        this.carrera = carrera;
        this.anioIngreso = anioIngreso;
    }

    public EstudianteExamen(){
        this.nombre = "Nombre desconocido";
        this.carrera = "Carrera desconocida";
        this.anioIngreso = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCarrera(){
        return carrera;
    }

    public int getAnioIngreso(){
        return anioIngreso;
    }






}
