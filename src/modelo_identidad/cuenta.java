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
public abstract class cuenta {
    private int id;
    private String nombre;
    private String apellido;
    private String edad;

    public cuenta() {
    }

    public cuenta(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
   public void Mostrar(){
       
       System.out.println(String.format("Mi nombre es: %s,%s", nombre,apellido));
   } 
}
 

