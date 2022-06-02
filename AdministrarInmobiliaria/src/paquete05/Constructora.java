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
    private int id;
    
    public Constructora(String nom, int _id){
        nombre = nom;
        id = _id;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerID(int n){
        id = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerID(){
        return id;
    }
}
