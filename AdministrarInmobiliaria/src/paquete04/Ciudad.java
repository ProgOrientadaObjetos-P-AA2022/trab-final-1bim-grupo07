/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author PR
 */
public class Ciudad {
    
    private String ciudad;
    private String provincia;
    
    public Ciudad(String cd, String prov){
        ciudad = cd;
        provincia = prov;
    }
    
    public void establecerCiudad(String n){
        ciudad = n;
    }
    public void establecerProvincia(String n){
        ciudad = n;
    }
    
    public String establecerCiudad(){
        return ciudad;
    }
    public String establecerProvincia(){
        return provincia;
    }
    
}
