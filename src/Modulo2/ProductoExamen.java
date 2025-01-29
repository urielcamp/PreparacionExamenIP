package Modulo2;

//Ejercicio 1:
//Crea una clase Producto con los
// atributos nombre, precio y cantidad en stock.
// Luego crea un método en la clase que calcule el valor total en stock de ese producto
// multiplicando el precio por la cantidad en stock.
//Crea una subclase ProductoImportado que añada un atributo impuesto (un porcentaje) y
//sobrescriba el método para calcular el valor total sumando el impuesto al valor total del producto.

public class ProductoExamen {

    private String nombre;
    private int precio;
    private int stock;

    public ProductoExamen(String nombre, int precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int ValorTotal(){
        return 0;
    }

    public String getNombre(){
        return nombre;

    }

    public int getPrecio(){
        return precio;
    }

    public int getStock(){
        return stock;
    }

}
