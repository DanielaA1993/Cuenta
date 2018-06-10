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
public class CuentaJoven extends cuenta {
    private double saldo;

    public CuentaJoven() {
    }

    public CuentaJoven(int id) {
        super(id);
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
          //System.out.println(this.getNombre());
       System.out.println(" -------------> Soy Cuenta Joven");
       System.out.println(" Mi numero de cuentas es: 09550052335");
       System.out.println(" Mi saldo es $400");
}
}