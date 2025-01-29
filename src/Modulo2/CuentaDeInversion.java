package Modulo2;

public class CuentaDeInversion extends CuentaBancaria{

    public CuentaDeInversion(String titular, int saldo, String tipoCuenta){
        super(titular, saldo, tipoCuenta);
    }

    @Override
    public double intAnual(){
        return getSaldo() * 0.1;
    }

}
