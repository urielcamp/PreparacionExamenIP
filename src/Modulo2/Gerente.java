package Modulo2;

public class Gerente extends EmpleadoExamen {

    // Constructor de la clase Gerente
    public Gerente(String nombre, double salario, int anosServicio) {
        super(nombre, salario, anosServicio); // Llamada al constructor de la clase base (EmpleadoExamen)
    }

    // Sobrescribiendo el método para calcular el bono anual
    @Override
    public double calcularBonoAnual() {
        return 0.1 * getSalario() * getAnosServicio(); // Bono: 10% del salario por cada año de servicio
    }

    // Sobrescribiendo el método para calcular el salario anual
    @Override
    public double calcularSalarioAnual() {
        return getSalario() + calcularBonoAnual(); // Salario anual = salario base + bono anual
    }
}
