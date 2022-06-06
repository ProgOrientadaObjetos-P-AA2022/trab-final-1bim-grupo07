
package paquete01;

import java.util.*;
import paquete02.*;
import paquete03.*;
import paquete04.*;
import paquete05.*;
import paquete06.*;
import paquete06.*;

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
    
    public Propietario encontrarPropietarioBuscado() {
        String identificacion;
        String nombres;
        String apellidos;
        String nombreArchivo = "data/propietarios.dat";
        System.out.println("Ingrese identifiacion del propietario: ");
        identificacion = sc.nextLine();
        Propietario propietarioEncontrado;

        ArchivoLecturaPropietario lecturaPropietario = new
                            ArchivoLecturaPropietario(nombreArchivo);
        lecturaPropietario.establecerIdentificador(identificacion);
        lecturaPropietario.establecerPropietarioBuscado();
        propietarioEncontrado = lecturaPropietario.obtenerPropietarioBuscado();
        
        if (propietarioEncontrado != null) {
            System.out.printf("Propietario encontrado %s\n", propietarioEncontrado);
            return propietarioEncontrado;
        } else {
            System.out.println("No se ha encontrado ese propietario, ingrese nuevo propietario");
            System.out.println("Ingrese nombres del propietario: ");
            nombres = sc.nextLine();
            System.out.println("Ingrese apellidos del propietario: ");
            apellidos = sc.nextLine();
            System.out.println("Ingrese identificacion del propietario: ");
            identificacion = sc.nextLine();
            Propietario propietario = new Propietario(nombres, apellidos, identificacion);
            ArchivoEscrituraPropietario archivop = new ArchivoEscrituraPropietario(nombreArchivo);
            archivop.establecerRegistro(propietario);
            archivop.establecerSalida();
            return propietario;
        }
    }
    
    public Barrio encontrarBarrioBuscado() {
        String nombreBarrio;
        String referencia;
        String nombreArchivo = "data/barrios.dat";
        System.out.println("Ingrese nombre del barrio: ");
        nombreBarrio = sc.nextLine();
        Barrio barrioEncontrado;
        
        ArchivoLecturaBarrio lecturaBarrio = new 
                            ArchivoLecturaBarrio(nombreArchivo);
        lecturaBarrio.establecerIdentificador(nombreBarrio);
        lecturaBarrio.establecerBarrioBuscado();
        barrioEncontrado = lecturaBarrio.obtenerBarrioBuscado();
        
        if (barrioEncontrado != null) {
            System.out.printf("Barrio encontrado %s\n", barrioEncontrado);
            return barrioEncontrado;
        } else {
            System.out.println("No se ha encontrado ese barrio, ingrese nuevo barrio");
            System.out.println("Ingrese nombre del barrio: ");
            nombreBarrio = sc.nextLine();
            System.out.println("Ingrese referencia: ");
            referencia = sc.nextLine();
            Barrio barrio = new Barrio(nombreBarrio, referencia);
            ArchivoEscrituraBarrio archivob = new ArchivoEscrituraBarrio(nombreArchivo);
            archivob.establecerRegistro(barrio);
            archivob.establecerSalida();
            return barrio;
        }
    }

    public Ciudad encontrarCiudadBuscada() {
        String nombreCiudad;
        String nombreProvincia;
        String nombreArchivo = "data/ciudades.dat";
        System.out.println("Ingrese nombre ciudad: ");
        nombreCiudad = sc.nextLine();
        Ciudad ciudadEncontrada;
        
        ArchivoLecturaCiudad lecturaCiudad = new 
                            ArchivoLecturaCiudad(nombreArchivo);
        lecturaCiudad.establecerIdentificador(nombreCiudad);
        lecturaCiudad.establecerCiudadBuscada();
        ciudadEncontrada = lecturaCiudad.obtenerCiudadBuscada();
        
        if (ciudadEncontrada != null) {
            System.out.printf("Ciudad encontrada %s\n", ciudadEncontrada);
            return ciudadEncontrada;
        } else {
            System.out.println("No se ha encontrado esa ciudad, ingrese nueva ciudad");
            System.out.println("Ingrese nombre de la ciudad: ");
            nombreCiudad = sc.nextLine();
            System.out.println("Ingrese nombre de la provincia: ");
            nombreProvincia = sc.nextLine();
            Ciudad ciudad = new Ciudad(nombreCiudad, nombreProvincia);
            ArchivoEscrituraCiudad archivociu = new ArchivoEscrituraCiudad(nombreArchivo);
            archivociu.establecerRegistro(ciudad);
            archivociu.establecerSalida();
            return ciudad;
        }
    }

    public Constructora encontrarConstructoraBuscada() {
        String nombreConstructora;
        String idEmpresa;
        String nombreArchivo = "data/constructoras.dat";
        System.out.println("Ingrese ID de la constructora: ");
        idEmpresa = sc.nextLine();
        Constructora constructoraEncontrada;
        
        ArchivoLecturaConstructora lecturaConst = new ArchivoLecturaConstructora(nombreArchivo);
        lecturaConst.establecerIdentificador(idEmpresa);
        lecturaConst.establecerConstructoraBuscada();
        constructoraEncontrada = lecturaConst.obtenerConstructoraBuscada();
        
        if (constructoraEncontrada != null) {
            System.out.printf("Constructora encontrada %s\n", constructoraEncontrada);
            return constructoraEncontrada;
        } else {
            System.out.println("No se ha encontrado esa constructora, ingrese nueva constructora");
            System.out.println("Ingrese nombre constructora: ");
            nombreConstructora = sc.nextLine();
            System.out.println("Ingrese id constructora: ");
            idEmpresa = sc.nextLine();
            Constructora constructora = new Constructora(nombreConstructora, idEmpresa);
            ArchivoEscrituraConstructora archivoco = new ArchivoEscrituraConstructora(nombreArchivo);
            archivoco.establecerRegistro(constructora);
            archivoco.establecerSalida();
            return constructora;
        }
    }
    
    public void presentarLista(int opc){
        switch (opc){
            case 1:
                ArchivoLecturaPropietario lecturaPropietario = new 
                            ArchivoLecturaPropietario("data/propietarios.dat");
                lecturaPropietario.establecerPropietarios();
                System.out.printf("%s", lecturaPropietario.toString());
                lecturaPropietario.cerrarArchivo();
                break;
            case 2:
                ArchivoLecturaBarrio lecturaBarrio = new
                            ArchivoLecturaBarrio("data/barrios.dat");
                lecturaBarrio.establecerBarrios();
                System.out.printf("%s", lecturaBarrio.toString());
                lecturaBarrio.cerrarArchivo();
                break;
            case 3:
                ArchivoLecturaCiudad lecturaCiudad = new
                            ArchivoLecturaCiudad("data/ciudades.dat");
                lecturaCiudad.establecerCiudades();
                System.out.printf("%s", lecturaCiudad.toString());
                lecturaCiudad.cerrarArchivo();
                break;
            case 4:
                ArchivoLecturaConstructora lecturaConst = new 
                            ArchivoLecturaConstructora("data/constructoras.dat");
                lecturaConst.establecerConstructoras();
                System.out.printf("%s", lecturaConst.toString());
                lecturaConst.cerrarArchivo();
                break;
            case 5:
                ArchivoLecturaCasa lecturaCasa = new 
                            ArchivoLecturaCasa("data/casas.dat");
                lecturaCasa.establecerCasa();
                System.out.printf("%s", lecturaCasa.toString());
                lecturaCasa.cerrarArchivo();
                break;
            case 6:
                ArchivoLecturaDepartamento lecturaDepa = new
                            ArchivoLecturaDepartamento("data/departamentos.dat");
                lecturaDepa.establecerDepartamento();
                System.out.printf("%s", lecturaDepa.toString());
                lecturaDepa.cerrarArchivo();
                break;
        }
    }

    public static void main(String[] args) {
        Ejecutor obj = new Ejecutor();
        System.out.println("Ingrese la opción que desee: ");
        int opc;
        do{
            opc = obj.menu();
            switch(opc){
                case 1: System.out.println("Datos del propietario\n");
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
                case 2: System.out.println("Información del Barrio\n");
                    obj.sc.nextLine();
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
                case 3: System.out.println("Informacion de la Ciudad\n");
                    obj.sc.nextLine();
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
                case 4: System.out.println("Información de la Constructora\n");
                    obj.sc.nextLine();
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
                case 5: System.out.println("Informacion de la Casa\n");
                    Propietario propietario = obj.encontrarPropietarioBuscado();
                    System.out.println("Ingrese el precio del metro cuadrado: ");
                    double precioMetro2 = obj.sc.nextDouble();
                    System.out.println("Ingrese el numero de metros cuadrados: ");
                    double metro2 = obj.sc.nextDouble();
                    Barrio barrio = obj.encontrarBarrioBuscado();
                    Ciudad ciudad = obj.encontrarCiudadBuscada();
                    System.out.println("Numero de cuartos: ");
                    int cuartos = obj.sc.nextInt();
                    Constructora construc = obj.encontrarConstructoraBuscada();
                    
                    Casa casa1 = new Casa(propietario, precioMetro2,
                            metro2, barrio, ciudad, cuartos, construc);
                    casa1.calcularCostoFinal();
                    ArchivoEscrituraCasa archivo05 = new 
                            ArchivoEscrituraCasa("data/casas.dat");
                    archivo05.establecerRegistro(casa1);
                    archivo05.establecerSalida();
                    break;
                case 6: System.out.println("Información del Departamento\n");
                    propietario = obj.encontrarPropietarioBuscado();
                    System.out.println("Ingrese el precio del metro cuadrado: ");
                    precioMetro2 = obj.sc.nextDouble();
                    System.out.println("Ingrese el numero de metros cuadrados: ");
                    metro2 = obj.sc.nextDouble();
                    System.out.println("Ingrese el valor alícuota mensual: ");
                    double valorAl = obj.sc.nextDouble();
                    barrio = obj.encontrarBarrioBuscado();
                    ciudad = obj.encontrarCiudadBuscada();
                    obj.sc.nextLine();
                    System.out.println("Ingrese el nombre del edificio: ");
                    String nomEdificio = obj.sc.nextLine();
                    System.out.println("Ubicación del departamento en el "
                            + "edificio: ");
                    String ubiDep = obj.sc.nextLine();
                    construc = obj.encontrarConstructoraBuscada();
                    
                    Departamento depa1 = new Departamento(propietario,
                                precioMetro2, metro2, valorAl, barrio, 
                                ciudad, nomEdificio, ubiDep, construc);
                    depa1.calcularCostoFinal();
                    ArchivoEscrituraDepartamento archivo06 = new 
                            ArchivoEscrituraDepartamento("data/departamentos.dat");
                    archivo06.establecerRegistro(depa1);
                    archivo06.establecerSalida();
                    break;
                case 7:
                    do {
                        int op = obj.menu2();
                        obj.presentarLista(op);
                    } while (opc != 0);
                    break;
                    
            }
        }while(opc != 0);

        
    }
}
