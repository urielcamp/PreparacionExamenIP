package Modulo2;


//Ejercicio 3:
//Crea una clase Vehiculo con los atributos marca, modelo y kilometros recorridos.
// Implementa un método para calcular el desgaste del vehículo,
// que será el número de kilómetros recorridos dividido entre 10.
// Luego, crea una subclase VehiculoDeLujo que aplique un descuento en el desgaste de un 20%.
public class AutomovilExamen {

    private String marca;
    private String modelo;
    private int kmRecorridos;

    public AutomovilExamen(String marca, String modelo, int kmRecorridos){
        this.marca = marca;
        this.modelo = modelo;
        this.kmRecorridos = kmRecorridos;
    }

    public double desgaste(){
        return kmRecorridos / 10;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getKmRecorridos(){
        return kmRecorridos;
    }

}
