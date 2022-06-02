/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author PR
 */
public class Propietario {
    
    private String nombres;
    private String apellidos;
    private String id ;
    
    public Propietario(String nom, String ape, String _id){
        nombres = nom;
        apellidos = ape;
        id = _id;
    }
    
    public void establecerNombre(String n){
        nombres = n;
    }
    public void establecerApellido(String n){
        apellidos = n;
    }
    public void establecerIdentificacion(String n){
        id = n;
    }
    
    public String obtenerNombre(){
        return nombres;
    }
    public String obtenerApellido(){
        return apellidos;
    }
    public String obtenerIdentificacion(){
        return id;
    }
}
