package Modulo2;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void saludar(){
        System.out.println("Hola, soy " + getNombre());
    }



    public boolean esMayorDeEdad(){
        if (getEdad() >= 18){
            return true;
        }else{
            return false;
        }
    }

    //En la clase Persona, añade un método llamado tiempoParaJubilarse que calcule cuántos años
    //le faltan a una persona para jubilarse, asumiendo que la edad de jubilación es 65 años.

    public void tiempoParaJubilarse(){

        if (getEdad() >= 65){
            System.out.println(getNombre() + " Ya esta jubilado");
        } else if (getEdad() <= 17){
            System.out.println(getNombre() + " Aun no trabaja");
        }else{
            int anosRes =  65 - getEdad();
            System.out.println("A " + getNombre() + " le quedan " + anosRes +  " para jubilarse");
        }
    }

}
