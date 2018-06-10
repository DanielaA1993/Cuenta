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
public class CuentaCorriente extends cuenta{
    private String NumeroDeCuenta;
    private double interes;
    private double saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(int id) {
        super(id);
    }

    public String getNumeroDeCuenta() {
        return NumeroDeCuenta;
    }

    public void setNumeroDeCuenta(String NumeroDeCuenta) {
        this.NumeroDeCuenta = NumeroDeCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
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
     System.out.println(" ------------> Soy Cuenta Corriente");
     System.out.println(" Mi numero de cuentas es: 09578953655");
     System.out.println(" Interes $30");
     System.out.println(" Mi saldo es $400");
    }
    
}
