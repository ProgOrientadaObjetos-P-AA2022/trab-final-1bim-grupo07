
package paquete04;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ArchivoLecturaCiudad {
    
    private ObjectInputStream entrada;
    private ArrayList<Ciudad> ciudades;
    private String nombreArchivo;
    private String identificador;
    private Ciudad ciudadBuscada;
    public ArchivoLecturaCiudad(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try {
                entrada = new ObjectInputStream(
                        new FileInputStream(nombreArchivo));
            } catch (IOException ioException) {
                System.out.println("Error al abrir el archivo" + ioException);
            } 
        }
    }
    
    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }
    
    public void establecerCiudades() {
        ciudades = new ArrayList<>();
        File f = new File(nombreArchivo);
        if (f.exists()) {
            while (true) {
                
                try {
                    Ciudad registro = (Ciudad) entrada.readObject();
                    ciudades.add(registro);
                } catch (EOFException endOfFileException) {
                    break;
                } catch (IOException ex) {
                    System.out.println("Error al leer el archivo");
                } catch (ClassNotFoundException ex) {
                    System.out.println("No se pudo crear el objeto" + ex);
                }
            }
        }

    }
    
    public void establecerIdentificador(String n) {
        identificador = n;
    }
    
    public void establecerCiudadBuscada() {
        File f = new File(nombreArchivo);
        while (true) {
            if (f.exists()) {
                try {
                    Ciudad registro = (Ciudad) entrada.readObject();
                    if(registro.obtenerCiudad().equals(identificador)){
                        ciudadBuscada = registro;
                        break;
                    }
                } catch (EOFException endOfFileException) {
                    break;
                } catch (IOException ex) {
                    System.out.println("Error al leer el archivo");
                } catch (ClassNotFoundException ex) {
                    System.out.println("No se pudo crear el objeto" + ex);
                }
                
            }
            
        }
    }
    
    public ArrayList<Ciudad> obtenerCiudades() {
        return ciudades;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    
    public String obtenerIdentificador() {
        return identificador;
    }
        
    public Ciudad obtenerCiudadBuscada() {
        return ciudadBuscada;
    }
    @Override
    public String toString() {
        String cadena = "Ciudades\n";
        for (int i = 0; i < ciudades.size(); i++) {
            Ciudad c = ciudades.get(i);
            cadena = String.format("%s(%d) %s-%s\n", cadena,
                    i + 1,
                    c.obtenerCiudad(),
                    c.obtenerProvincia());
        }

        return cadena;
    }
    
    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
        } catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo");
        }
    }
}
