/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_githubii;

/**
 *
 * @author maanu_358j11i
 */
public class PERSONAS {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int FechaNacimiento;
    private String localidad;
    
    public PERSONAS(){
        nombre = "";
        apellido = "";
        edad = 0;
        FechaNacimiento = 0;
        localidad = "";
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public int getFechaNacimiento(){
        return FechaNacimiento;
    }
    public String getLocalidad(){
        return localidad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setFechaNacimiento(int FechaNacimiento){
        this.FechaNacimiento = FechaNacimiento;
    }
    public void setLocalidad(String localidad){
        this.localidad = localidad;
    }
}
