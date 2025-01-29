package Modulo2;

//Ejercicio 2:
//Crea una clase CuentaBancaria con los atributos titular, saldo y tipo de cuenta.
// Implementa un método que calcule los intereses anuales según el tipo de cuenta
// (por ejemplo, cuenta de ahorros tiene un 5%, cuenta corriente un 2%, etc.).
// Luego, crea una subclase CuentaDeInversion que sobrescriba el método para aplicar un interés del 10%.

public class CuentaBancaria {

    private String titular;
    private int saldo;
    private String tipoCuenta;

    public CuentaBancaria(String titular, int saldo, String tipoCuenta){
        this.titular = titular;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double intAnual(){
        if (tipoCuenta == "cuenta de ahorros"){
            return saldo * 0.05;
        }else if (tipoCuenta == "cuenta corriente"){
            return saldo * 0.02;
        }
        return 0;
    }

    public String getTitular(){
        return titular;
    }

    public String getTipoCuenta(){
        return tipoCuenta;
    }

    public int getSaldo(){
        return saldo;
    }


}
