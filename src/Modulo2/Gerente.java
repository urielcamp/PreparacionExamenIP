package Modulo2;

public class Gerente extends EmpleadoExamen{


        private String nombre;
        private double salario;
        private int anosServicio;
        private double bonoAnual;
        private double salarioAnual;

        public Gerente(String nombre, double salario, int anosServicio){
            this.nombre = nombre;
            this.salario = salario;
            this.anosServicio = anosServicio;
            this.salarioAnual = salarioAnual;
            this.bonoAnual = bonoAnual;
        }


        @Override
        public double calcularBonoAnual(){
           return bonoAnual = 0.1 * salario * anosServicio;
        }

        @Override
        public double calcularSalarioAnual(){
            return salarioAnual = salario + bonoAnual;
        }




}
