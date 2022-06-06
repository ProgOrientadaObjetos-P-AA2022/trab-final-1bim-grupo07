
package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Casa {
    
    private Propietario propietario;
    private double precioMetros;
    private double numMetros;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private int numCuartos;
    private Constructora constructora;
    
    public Casa(Propietario p, double pM, double nM, Barrio b, Ciudad c, int nC,
            Constructora cons){
        propietario = p;
        precioMetros = pM;
        numMetros = nM;
        barrio = b;
        ciudad = c;
        numCuartos = nC;
        constructora = cons;
    }
    
    public void establecerPropietario(Propietario p){
        propietario = p;
    }
    public void establecerPrecioMetros(double m){
        precioMetros = m;
    }
    public void establecerNumMetros(double m){
        numMetros = m;
    }
    public void calcularCostoFinal(){
        costoFinal = precioMetros * numMetros;
    }   
    public void establecerBarrio(Barrio b){
        barrio = b;
    }
    public void establecerCiudad(Ciudad c){
        ciudad = c;
    }
    public void establecerNumCuartos(int n){
        numCuartos = n;
    }
    public void establecerConstructora(Constructora c){
        constructora = c;
    }
    
    
    public Propietario obtenerPropietario(){
        return propietario;
    }
    public double obtenerPrecioMetros(){
        return precioMetros;
    }
    public double obtenerNumMetros(){
        return numMetros;
    }
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    public Barrio obtenerBarrio(){
        return barrio;
    }
    public Ciudad obtenerCiudad(){
        return ciudad;
    }
    public int obtenerNumCuartos(){
        return numCuartos;
    }
    public Constructora obtenerConstructora(){
        return constructora;
    }
}
