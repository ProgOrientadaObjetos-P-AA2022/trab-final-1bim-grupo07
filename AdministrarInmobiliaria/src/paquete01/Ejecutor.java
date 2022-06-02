/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    Scanner sc = new Scanner(System.in);
    
    public int menu(){
        System.out.println("Propietario   [1]");
        System.out.println("Barrio        [2]");
        System.out.println("Ciudad        [3]");
        System.out.println("Constructora  [4]");
        System.out.println("Casa          [5]");
        System.out.println("Departamento  [6]");
        System.out.println("Salir         [0]");
        int op = sc.nextInt();
        return op;
    }

    public static void main(String[] args) {
        Ejecutor obj = new Ejecutor();
        String propietario = "propietarios.dat";
        String barrio = "barrios.dat";
        String ciudad = "ciudades.dat";
        String constructora = "constructora.dat";
        String casa = "casas.dat";
        int opc;
        
        Propietario p1;
        Barrio b1;
        Ciudad c1;
        Constructora cn1;
        Casa casa1;
        Departamento dep1; 
        
        do{
            opc = obj.menu();
            switch(opc){
                case 1: System.out.println("Datos del propietario:");
                    obj.sc.nextLine();
                    System.out.println("Nombres:");
                    String nom = obj.sc.nextLine();
                    System.out.println("Apellidos: ");
                    String ape = obj.sc.nextLine();
                    System.out.println("Identificacion: ");
                    String id = obj.sc.nextLine();
                    
                    p1 = new Propietario(nom, ape, id);
                    
                    EscrituraArchivoSecuencial archivo = new
                    EscrituraArchivoSecuencial(propietario);
                    Propietario[] lista = {p1};
                    
                    for (int i = 0; i < lista.length; i++) {
                        // establecer el valor del atributo registro
                        archivo.establecerRegistro(lista[i]);
                        // establecer en el archivo el atributo del registro
                        archivo.establecerSalida();
                    }
                    archivo.cerrarArchivo();
                    LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(propietario);
                    lectura.establecerListaCalificaciones();
                    System.out.println(lectura);
                    break;
                case 2: 
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }while(opc != 0);

        
    }
}
