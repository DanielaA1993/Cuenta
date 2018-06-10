/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodelpacifico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo_identidad.CuentaCorriente;
import modelo_identidad.CuentaDeAhorro;
import modelo_identidad.CuentaJoven;
import modelo_identidad.cuenta;

/**
 *
 * @author bella
 */
public class BancoDelPacifico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente ctaA=new CuentaCorriente(110);
        ctaA.setApellido("Alvarado");
        ctaA.setNombre("Daniela");
        
        
        
        CuentaDeAhorro ctaDA=new CuentaDeAhorro(220);
        ctaDA.setApellido("Ramirez");
        ctaDA.setNombre("Pilar");
      
        
        CuentaJoven ctaJ=new CuentaJoven(300);
        ctaJ.setApellido("Villamar");
        ctaJ.setNombre("Michael");
      
        
        List<cuenta> cuentas = new ArrayList<>();
        cuentas.add(ctaA);
        cuentas.add(ctaDA);
        cuentas.add(ctaJ);
        
        cuentas.forEach((cuenta) -> {
            cuenta.Mostrar();
        });
            
    Scanner s= new Scanner(System.in);
    
    s.nextLine();
    
    }
    // TODO code application logic here
    }
    
