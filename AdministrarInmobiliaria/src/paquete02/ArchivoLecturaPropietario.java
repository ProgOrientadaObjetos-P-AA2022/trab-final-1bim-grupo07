
package paquete02;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ArchivoLecturaPropietario {
    
    private ObjectInputStream entrada;
    private ArrayList<Propietario> propietarios;
    private String nombreArchivo;
    private String identificador;
    private Propietario propietarioBuscado;
    
    public ArchivoLecturaPropietario(String n) {
        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
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
    
    public void establecerPropietarios() {
        propietarios = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            while (true) {
                try {
                    Propietario registro = (Propietario) entrada.readObject();
                    propietarios.add(registro);
                } catch (EOFException endOfFileException) {
                    return;
                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);
                }
            }
        }
    }
    
    public void establecerIdentificador(String n) {
        identificador = n;
    }
    
    public void establecerPropietarioBuscado() {
        File f = new File(obtenerNombreArchivo());
        while (true) {
            if (f.exists()) {
                try {
                    Propietario registro = (Propietario) entrada.readObject();
                    if(registro.obtenerIdentificacion().equals(identificador)){
                        propietarioBuscado = registro;
                        break;
                    }
                } catch (EOFException endOfFileException) {
                    return;
                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);
                } 
            } 
        }
    }
    
    public ArrayList<Propietario> obtenerPropietarios() {
        return propietarios;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    
    public String obtenerIdentificador() {
        return identificador;
    }
        
    public Propietario obtenerPropietarioBuscado() {
        return propietarioBuscado;
    }
    @Override
    public String toString() {
        String cadena = "Propietarios\n";
        for (int i = 0; i < propietarios.size(); i++) {
            Propietario p = propietarios.get(i);
            cadena = String.format("%s(%d) %s-%s-%s\n", cadena,
                    i + 1,
                    p.obtenerNombre(),
                    p.obtenerApellido(),
                    p.obtenerIdentificacion());
        }

        return cadena;
    }
    
    public void cerrarArchivo() {
        try{
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        }catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        }
    }
}
