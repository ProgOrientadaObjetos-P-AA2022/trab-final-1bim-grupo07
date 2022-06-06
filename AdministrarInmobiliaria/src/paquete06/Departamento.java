package paquete06;


import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Departamento  {
    private Propietario propietario;
    private double precioMetro;
    private double numMetros;
    private double alicuotaMen;
    private double valorF;
    private Barrio barrio;
    private Ciudad ciudad;
    private String nombreEd;
    private String ubicacionEd;
    private Constructora constructora;
    
    public Departamento(Propietario p, double pM,double mM,double aM, Barrio b,
            Ciudad c,String nE,String uE,Constructora cons){
        propietario = p;
        precioMetro = pM;
        numMetros = mM;
        alicuotaMen = aM;
        barrio = b;
        ciudad = c;
        nombreEd = nE;
        ubicacionEd = uE;
        constructora = cons;
    }
    public void establecerPropietario(Propietario n){
        propietario = n;
    }
    
    public void establecerPrecioMetro(double n){
        precioMetro = n;
    }
    
    public void establecerNumMetros(double n){
        numMetros = n;
    }
    
    public void establecerAlicuotaMen(double n){
        alicuotaMen = n;
    }
    
    public void calcularCostoFinal(){
        valorF = ((numMetros * precioMetro) + (alicuotaMen * 12));
    }
    
    public void establecerBarrio(Barrio n){
        barrio = n;
    }
    
    public void establecerCuidad(Ciudad n){
        ciudad = n;
    }
    
    public void establecerNombreEd(String n){
        nombreEd = n;
    }
    
    public void establecerUbicacionEd(String n){
        ubicacionEd = n;
    }
    
    public void establecerConstructora(Constructora n){
        constructora = n;
    }
    
    public Propietario obtenerPropietario(){
        return propietario;
    }
    
    public double obtenerPrecioMetro(){
        return precioMetro;
    }
    
    public double obtenerNumMetros(){
        return numMetros;
    }
    
    public double obtenerAlicuotaM(){
        return alicuotaMen;
    }
    
    public double obtenerValorF(){
        return valorF;
    }
    
    public Barrio obtenerBarrio(){
        return barrio;
    }
    
    public Ciudad obtenerCiudad(){
        return ciudad;
    }
    
    public String obtenerNombreEd(){
        return nombreEd;
    }
    
    public String obtenerUbicacionEd(){
        return ubicacionEd;
    }
    
    public Constructora obtenerConstructora(){
        return constructora;
    }
}