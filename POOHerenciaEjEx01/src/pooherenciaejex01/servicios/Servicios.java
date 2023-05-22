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
    Date fechaDevolucion,fechaAlquiler;
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
        fechaAlquiler = new Date(anio-1900, mes-1, dia);
        System.out.println("Ingrese la fecha de devolución....... ");
        System.out.print("Día : ");
        dia = leer.nextInt();
        System.out.print("Mes : ");
        mes = leer.nextInt();
        System.out.print("Año : ");
        anio = leer.nextInt();
        fechaDevolucion = new Date(anio-1900, mes-1, dia);
        System.out.print("Ingrese la posición de amarre.......: ");
        String posicionAmarre = leer.next();
        System.out.println("");
        System.out.println("Seleccione el barco a alquilar.......");
        listaBarcos();
        System.out.println("Número de barco...: ");
        opcion = leer.nextInt();
        barcoElegido = listaBarcos.get(opcion-1);
        listaBarcos.remove(opcion-1);
        alquiler1 = new Alquiler(nombre, documento, fechaAlquiler, fechaDevolucion, posicionAmarre, barcoElegido);
        calculoAlquiler();
        return alquiler1;
    }
    
    public void calculoAlquiler(){
// Un alquiler se calcula multiplicando el número de días de ocupación
// (calculado con la fecha de alquiler y devolución), por un valor módulo de
// cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
// En los barcos de tipo especial el módulo de cada barco se calcula sacando el
// módulo normal y sumándole el atributo particular de cada barco. En los
// veleros se suma el número de mástiles, en los barcos a motor se le suma la
// potencia en CV y en los yates se suma la potencia en CV y el número de
// camarotes.
        System.out.println("");
        System.out.println("- - - - Calculo de alquiler - - - -");
        System.out.println("");
        long diasAlquiler = diasEntreDosFechas(fechaAlquiler, fechaDevolucion);
        double modulo = barcoElegido.getEslora()*10;
        double moduloEspecial = 0;

        if (barcoElegido instanceof BarcosLujo) {
            BarcosLujo barcoAux = (BarcosLujo) barcoElegido;
            moduloEspecial = (barcoAux.getCvBarcoLujo()+barcoAux.getCamarotes());
            //System.out.println("" + barcoAux.getCvBarcoLujo() + " " + barcoAux.getCamarotes());    
        }
        if (barcoElegido instanceof BarcosMotor) {
            BarcosMotor barcoAux = (BarcosMotor) barcoElegido;
            moduloEspecial = (barcoAux.getCvBarcoMotor());
            //System.out.println("" + barcoAux.getCvBarcoMotor());    
        }
        if (barcoElegido instanceof BarcosVeleros) {
            BarcosVeleros barcoAux = (BarcosVeleros) barcoElegido;
            moduloEspecial = (barcoAux.getMastiles());
            //System.out.println("" + barcoAux.getMastiles());    
        }
        double alquiler = (modulo + moduloEspecial) * diasAlquiler;
        System.out.println("Dias de alquiler .....: " + diasAlquiler);
        System.out.println("Módulo ...............: " + modulo);
        System.out.println("Módulo especial ......: " + moduloEspecial);
        System.out.println("Total de alquiler ....: " + alquiler);
        System.out.println("");
    }
    
    public static long diasEntreDosFechas(Date fechaAlquiler, Date fechaDevolucion){
     long startTime = fechaAlquiler.getTime() ;
     long endTime = fechaDevolucion.getTime();
     long diasDesde = (long) Math.floor(startTime / (1000*60*60*24)); // convertimos a dias, para que no afecten cambios de hora 
     long diasHasta = (long) Math.floor(endTime / (1000*60*60*24)); // convertimos a dias, para que no afecten cambios de hora
     long dias = diasHasta - diasDesde;
     return dias;
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
        System.out.println(" ");
    }
    
    public void listaAlquileres(){
        System.out.println("- - - - Lista de alquileres - - - - ");
            for (int i = 0; i < listaAlquileres.size(); i++) {
                System.out.println(" " + (i+1) + "- " +  listaAlquileres.get(i));          
            }
        System.out.println(" ");
    }
           
    public void menuAlquiler(){
        do {
            System.out.println("- - - - - Menu Principal - - - - -");
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
                    continuar = true;
                    System.out.println("- - - - - Baja de alquiler - - - - - -");
                    listaAlquileres(); 
                    while (continuar) {
                        System.out.print("Ingrese el número de alquiler: ");
                        opcion = leer.nextInt();
                        barcoElegido = listaAlquileres.get(opcion-1).getBarco();
                        listaBarcos.add(barcoElegido);
                        listaAlquileres.remove(opcion-1);
                        System.out.print("Desea dar de baja otro alquiler? S/N ");
                        String respuesta = leer.next();
                        continuar = respuesta.equalsIgnoreCase("s");
                    }
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
                        opcion = leer.nextInt();
                        listaBarcos.remove(opcion-1);
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


