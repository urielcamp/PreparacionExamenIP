package Modulo2;

public class AutomovilDeLujo extends AutomovilExamen{

    public AutomovilDeLujo(String marca, String modelo, int kmRecorrido){
        super(marca, modelo, kmRecorrido);
    }

    @Override
    public double desgaste(){
        return getKmRecorridos() / 20;
    }


}
