package Modulo2;

//  //Crea una clase Empleado que contenga atributos para el nombre,
//  el salario y los años de servicio de un empleado.
//  La clase debe incluir métodos para calcular el bono anual y el salario anual.
//  Para calcular el bono anual y el salario anual de diferentes empleados,
//  necesitarás crear la subclase de Empleado: Gerente.
//    //
//    //En la clase Gerente, necesitarás implementar los métodos para calcular el bono anual y
//    el salario anual utilizando los atributos específicos del Gerente
//    (nombre, salario y años de servicio).
//    //
//    //Operaciones para la implementación de los métodos:
//    //
//    //Bono anual: 0.1 x salario x años de servicio
//    //Salario anual: salario + bono anual
//    //Consejo: Observa bien el caso de prueba, allí tienes información sobre el nombre de la clase,
//    tipo de dato y cantidad de parámetros para el constructor,
//    nombre de los métodos y tipo de dato de retorno.
//    //
//    //NO ES NECESARIO CREAR EL MÉTODO MAIN (solamente la clase Empleado y la clase Gerente).
//    //
//    //Por ejemplo:
//    //
//    //Prueba	Resultado
//    //Gerente gerente1 = new Gerente("Juan Perez", 50000, 5);
//    //System.out.println("Bono anual: " + gerente1.calcularBonoAnual());
//    //System.out.println("Salario anual: " + gerente1.calcularSalarioAnual());
//    //Bono anual: 25000.0
//    //Salario anual: 75000.0



public class EmpleadoExamen {

    private String nombre;
    private double salario;
    private int anosServicio;

    // Constructor de la clase EmpleadoExamen
    public EmpleadoExamen(String nombre, double salario, int anosServicio) {
        this.nombre = nombre;
        this.salario = salario;
        this.anosServicio = anosServicio;
    }

    public String getNombre() {
        return nombre;
    }

    // Método getSalario() ahora es público
    public double getSalario() {
        return salario;
    }

    // Método getAnosServicio() ahora es público
    public int getAnosServicio() {
        return anosServicio;
    }

    // Métodos base que serán sobrescritos en la subclase
    public double calcularBonoAnual() {
        return 0; // Esto es solo un valor base, lo sobrescribe Gerente
    }

    public double calcularSalarioAnual() {
        return salario; // Esto es solo un valor base, lo sobrescribe Gerente
    }
}

