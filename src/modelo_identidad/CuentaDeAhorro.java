/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_identidad;

/**
 *
 * @author bella
 */
public class CuentaDeAhorro extends cuenta {
    private String NumeroDeCuenta;
    private double saldo;

    public CuentaDeAhorro() {
    }

    public CuentaDeAhorro(int id) {
        super(id);
    }

    public String getNumeroDeCuenta() {
        return NumeroDeCuenta;
    }

    public void setNumeroDeCuenta(String NumeroDeCuenta) {
        this.NumeroDeCuenta = NumeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public void Mostrar(){
        super.Mostrar();
       System.out.println(" ------------> Soy Cuenta de Ahorro");
       System.out.println(" Mi numero de cuentas es: 0983654445");
       System.out.println(" Mi saldo es $250");
    }
}
