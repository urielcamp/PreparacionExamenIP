package Modulo2;

public class ProductoImportado extends ProductoExamen{

    private int impuesto;

public ProductoImportado(String nombre, int precio, int stock, int impuesto){
    super(nombre, precio, stock);
    this.impuesto = impuesto;
}

    @Override
    public int ValorTotal(){
        return (getPrecio() * getStock()) + impuesto;
    }


}
