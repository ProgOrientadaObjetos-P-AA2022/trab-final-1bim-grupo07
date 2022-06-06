/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author PR
 */
public class Constructora {
    
    private String nombre;
    private String id;
    
    public Constructora(String nom, String _id){
        nombre = nom;
        id = _id;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerID(String n){
        id = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerID(){
        return id;
    }
}
