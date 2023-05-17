package pooherenciaejex01.servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import pooherenciaejex01.entidades.Alquiler;
import pooherenciaejex01.entidades.Barco;
import pooherenciaejex01.entidades.BarcosLujo;
import pooherenciaejex01.entidades.BarcosMotor;
import pooherenciaejex01.entidades.BarcosVeleros;

/**
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada
 * Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler,
 * fecha de devolución, la posición del amarre y el barco que lo ocupará. Un
 * Barco se caracteriza por: su matrícula, su eslora en metros y año de
 * fabricación. Sin embargo, se pretende diferenciar la información de algunos
 * tipos de barcos especiales: • Número de mástiles para veleros. • Potencia en
 * CV para barcos a motor. • Potencia en CV y número de camarotes para yates de
 * lujo. Un alquiler se calcula multiplicando el número de días de ocupación
 * (calculado con la fecha de alquiler y devolución), por un valor módulo de
 * cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
 * En los barcos de tipo especial el módulo de cada barco se calcula sacando el
 * módulo normal y sumándole el atributo particular de cada barco. En los
 * veleros se suma el número de mástiles, en los barcos a motor se le suma la
 * potencia en CV y en los yates se suma la potencia en CV y el número de
 * camarotes. Utilizando la herencia de forma apropiada, deberemos programar en
 * Java, las clases y los métodos necesarios que permitan al usuario elegir el
 * barco que quiera alquilar y mostrarle el precio final de su alquiler.
 *
 * @author Eduardo
 */
public class Servicios {
    
    int opcion,anio,mes,dia;
    boolean continuar;
    Scanner leer = new Scanner(System.in);
    Alquiler alquiler1 = new Alquiler();
    Barco barcoElegido = new Barco();
    ArrayList<Barco> listaBarcos = new ArrayList<>();
    ArrayList<Alquiler> listaAlquileres = new ArrayList<>();
    
    public Alquiler altaAlquiler(){
        
//    Alquiler alquiler1 = new Alquiler("Juan","123345678","21/04/2019","21/05/2019","M10A25","2001");
//    Alquiler alquiler2 = new Alquiler("Pedro","233456789","21/04/2019","21/05/2019","M11A26","2002");
//    Alquiler alquiler3 = new Alquiler("Luis","213345678","21/04/2019","21/05/2019","M12A27","2003");
//    Alquiler alquiler4 = new Alquiler("Mario","231345678","21/04/2019","21/05/2019","M13A28","2004");
//    Alquiler alquiler5 = new Alquiler("José","253345678","21/04/2019","21/05/2019","M14A29","2005");
    
//        listaAlquileres.add(alquiler1);
//        listaAlquileres.add(alquiler2);
//        listaAlquileres.add(alquiler3);
//        listaAlquileres.add(alquiler4);
//        listaAlquileres.add(alquiler5);
        System.out.println("");
        System.out.println("- - - - - Alta de alquiler - - - - - -");
        System.out.print("Ingrese el nombre del titular.......: ");
        String nombre = leer.next();
        System.out.print("Ingrese el documento del titular....: ");
        String documento = leer.next();
        System.out.println("Ingrese la fecha de inicio alquiler.. ");
        System.out.print("Día : ");
        dia = leer.nextInt();
        System.out.print("Mes : ");
        mes = leer.nextInt();
        System.out.print("Año : ");
        anio = leer.nextInt();
        Date fechaAlquiler = new Date(anio-1900, mes-1, dia);
        System.out.println("Ingrese la fecha de devolución....... ");
        System.out.print("Día : ");
        dia = leer.nextInt();
        System.out.print("Mes : ");
        mes = leer.nextInt();
        System.out.print("Año : ");
        anio = leer.nextInt();
        Date fechaDevolucion = new Date(anio-1900, mes-1, dia);
        System.out.print("Ingrese la posición de amarre.......: ");
        String posicionAmarre = leer.next();
        System.out.print("Seleccione el barco a alquilar......: ");
        listaBarcos();
        opcion = leer.nextInt();
        barcoElegido = listaBarcos.get(opcion);
        alquiler1 = new Alquiler(nombre, documento, fechaAlquiler, fechaDevolucion, posicionAmarre, barcoElegido);
        return alquiler1;
    }
    
    public ArrayList<Barco> altaBarcos(){
        
        Barco barco1 = new BarcosLujo(1500, 6, "2001", 10, 2001);
        Barco barco2 = new BarcosLujo(1500, 10, "2002", 20, 2002);
        Barco barco3 = new BarcosMotor(2000, "2003", 15, 2003);
        Barco barco4 = new BarcosVeleros(1, "2004", 7, 2003);
        Barco barco5 = new BarcosVeleros(2, "2005",10,2005);        
        listaBarcos.add(barco1);
        listaBarcos.add(barco2);
        listaBarcos.add(barco3);
        listaBarcos.add(barco4);
        listaBarcos.add(barco5);
        return listaBarcos;
    }
    
    public void listaBarcos(){
        System.out.println("- - - - Lista de Barcos - - - - - ");
        for (int i = 0; i < listaBarcos.size(); i++) {
            System.out.println(" " + (i+1) + "- " + listaBarcos.get(i));   
        }
        System.out.println("- - - - - - - - - - - - - - - - - ");
    }
    
    public void listaAlquileres(){
        System.out.println("- - - - Lista de alquileres - - - - ");
            for (int i = 0; i < listaAlquileres.size(); i++) {
                System.out.println(" " + (i+1) + "- " +  listaAlquileres.get(i));          
            }
        System.out.println("- - - - - - - - - - - - - - - - - - ");
    }
           
    public void menuAlquiler(){
        do {
            System.out.println("- - - - Alquiler de barcos - - - - ");
            System.out.println(" 1 - Alta de alquiler ");
            System.out.println(" 2 - Baja de alquiler ");
            System.out.println(" 3 - Listar alquileres ");
            System.out.println(" 4 - Alta de barcos ");
            System.out.println(" 5 - Baja de barcos ");
            System.out.println(" 6 - Listar barcos ");
            System.out.println(" 7 - Salir ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:     // Alta  de alquiler
                    continuar = true;
                    while (continuar) {
                        altaAlquiler();
                        listaAlquileres.add(alquiler1);
                        System.out.print("Desea agregar otro alquiler  S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                case 2:     // Baja de alquiler
                    
//                    for (Map.Entry<String, Double> aux : mapaProductos.entrySet()) {
//                        String key = aux.getKey();
//                        Double value = aux.getValue();
//                        System.out.println("   " + key + " $ " + value);
//                    }
//                    System.out.println("");
                    break;
                case 3:     // Listar alquileres
                    listaAlquileres();
                    break;
                case 4:     // Alta de barcos
                    altaBarcos();
                    break;
                case 5:     // Baja de barco
                    continuar = true;
                    listaBarcos(); 
                    while (continuar) {
                        System.out.print("Ingrese el número del barco: ");
                        int numeroBarco = leer.nextInt();
//                      if (mapaProductos.containsKey(keyProducto)) {
//                          mapaProductos.remove(keyProducto);
//                          System.out.println("Se eliminó el producto: " + keyProducto);
//                      } else {
//                          System.out.println("No se encontró el producto: " + keyProducto);
//                      }
                        System.out.print("Desea borrar otro barco? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
                    break;
                case 6:     // Listar barcos
                    listaBarcos();
                    break;
                default:
                    break;
            }
        } while (opcion != 7);

        System.out.println("* * * * * * * * Fin de proceso * * * * * * * ");
    }
    
}


