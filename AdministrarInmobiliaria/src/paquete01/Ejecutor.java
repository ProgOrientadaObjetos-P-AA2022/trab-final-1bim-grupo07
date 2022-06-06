/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.*;
import paquete02.*;
import paquete03.*;
import paquete04.*;
import paquete05.*;
import paquete06.*;
import paquete06.*;

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
        System.out.println("Ver Listas    [7]");
        System.out.println("Salir         [0]");
        int op = sc.nextInt();
        return op;
    }
    
    public int menu2(){
        System.out.println("Lista de propietarios   [1]");
        System.out.println("Lista de barrios        [2]");
        System.out.println("Lista de ciudades       [3]");
        System.out.println("Lista de constructoras  [4]");
        System.out.println("Lista de casas          [5]");
        System.out.println("Lista de departamentos  [6]");
        System.out.println("Salir                   [0]");
        int op = sc.nextInt();
        return op;
    }

    public static void main(String[] args) {
        Ejecutor obj = new Ejecutor();
        int opc;
        do{
            opc = obj.menu();
            switch(opc){
                case 1: System.out.println("Datos del propietario:");
                    obj.sc.nextLine();
                    System.out.println("Nombres: ");
                    String nomPr = obj.sc.nextLine();
                    System.out.println("Apellidos: ");
                    String ape = obj.sc.nextLine();
                    System.out.println("Identificacion: ");
                    String id = obj.sc.nextLine();
                    
                    Propietario p1 = new Propietario(nomPr, ape, id);
                    ArchivoEscrituraPropietario archivo01 = new 
                            ArchivoEscrituraPropietario("data/propietarios.dat");
                    System.out.printf("%s", p1);
                    archivo01.establecerRegistro(p1);
                    archivo01.establecerSalida();
                    break;
                case 2: 
                    System.out.println("Nombre del barrio: ");
                    String nomBa = obj.sc.nextLine();
                    System.out.println("Referencia del barrio: ");
                    String ref = obj.sc.nextLine();
                    
                    Barrio b1 = new Barrio(nomBa, ref);
                    ArchivoEscrituraBarrio archivo02 = new 
                            ArchivoEscrituraBarrio("data/barrios.dat");
                    System.out.println(archivo02.toString());
                    archivo02.establecerRegistro(b1);
                    archivo02.establecerSalida();
                    break;
                case 3:
                    System.out.println("Nombre de la ciudad: ");
                    String nomCi = obj.sc.nextLine();
                    System.out.println("Nombre de la provincia: ");
                    String prov = obj.sc.nextLine();
                    
                    Ciudad c1 = new Ciudad(nomCi, prov);
                    ArchivoEscrituraCiudad archivo03 = new
                            ArchivoEscrituraCiudad("data/ciudades.dat");
                    archivo03.establecerRegistro(c1);
                    archivo03.establecerSalida();
                    break;
                case 4:
                    System.out.println("Nombre de la constructora: ");
                    String nomCo = obj.sc.nextLine();
                    System.out.println("ID de la constructora: ");
                    String _id = obj.sc.nextLine();
                    
                    Constructora cons1 = new Constructora(nomCo, _id);
                    ArchivoEscrituraConstructora archivo04 = new
                            ArchivoEscrituraConstructora("data/constructora.dat");
                    archivo04.establecerRegistro(cons1);
                    archivo04.establecerSalida();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    do {
                        int op = obj.menu2();
                        obj.mostrar(op);
                    } while (opc != 0);
                    break;
                    
            }
        }while(opc != 0);

        
    }
}
