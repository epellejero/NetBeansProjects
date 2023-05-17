package pooherenciaej03.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pooherenciaej03.entidades.Electrodomesticos;
import pooherenciaej03.entidades.Heladera;
import pooherenciaej03.entidades.Lavadora;
import pooherenciaej03.entidades.Televisor;

/**
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos:
 * precio, color, consumo energético (letras entre A y F) y peso. 
 * Los constructores que se deben implementar son los siguientes: 
 * • Un constructor vacío. 
 * • Un constructor con todos los atributos pasados por parámetro. 
 * Los métodos a implementar son: 
 * • Métodos getters y setters de todos los atributos. 
 * • Método comprobarConsumoEnergetico(char letra): comprueba que la
 * letra es correcta, sino es correcta usara la letra F por defecto. Este método
 * se debe invocar al crear el objeto y no será visible. 
 * • Método comprobarColor(String color): comprueba que el color es correcto, y 
 * si no lo es, usa el color blanco por defecto. Los colores disponibles para los
 * electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el
 * nombre está en mayúsculas o en minúsculas. Este método se invocará al crear
 * el objeto y no será visible. 
 * • Metodo crearElectrodomestico(): le pide la información al usuario y llena 
 * el electrodoméstico, también llama los métodos para comprobar el color y el 
 * consumo. Al precio se le da un valor base de $1000. 
 * • Método precioFinal(): según el consumo energético y su tamaño, aumentará el
 * valor del precio. Esta es la lista de precios: 
 * LETRA    PRECIO              PESO            PRECIO
 * A        $1000           Entre 1 y 19 kg     $100
 * B        $800            Entre 20 y 49 kg    $500
 * C        $600            Entre 50 y 79 kg    $800
 * D        $500            Mayor que 80 kg     $1000
 * E        $300 
 * F        $100 
 *  
 * A continuación,se debe crear una subclase llamada Lavadora, con el atributo 
 * carga, además de los atributos heredados. Los constructores que se 
 * implementarán serán: 
 * • Un constructor vacío. 
 * • Un constructor con la carga y el resto de los atributos heredados. 
 * Recuerda que debes llamar al constructor de la clase padre. 
 * Los métodos que se implementara serán: 
 * • Método get y set del atributo carga. 
 * • Método crearLavadora (): este método llama a crearElectrodomestico() de la
 * clase padre, lo utilizamos para llenar los atributos heredados del padre y
 * después llenamos el atributo propio de la lavadora. 
 * • Método precioFinal(): este método será heredado y se le sumará la siguiente
 * funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500
 * , si la carga es menor o igual, no se incrementará el precio. Este método 
 * debe llamar al método padre y añadir el código necesario. Recuerda que las 
 * condiciones que hemos visto en la clase Electrodoméstico también deben 
 * afectar al precio. 
 * Se debe crear también una subclase llamada Televisor con los siguientes 
 * atributos:
 * resolución (en pulgadas) y sintonizador TDT (booleano), además de los
 * atributos heredados. 
 * Los constructores que se implementarán serán: 
 * • Un constructor vacío. 
 * • Un constructor con la resolución, sintonizador TDT y el resto de los 
 * atributos heredados. Recuerda que debes llamar al constructor de la clase 
 * padre. 
 * Los métodos que se implementara serán: 
 * • Método get y set de los atributos resolución y sintonizador TDT. 
 * • Método crearTelevisor(): este método llama a crearElectrodomestico() de la 
 * clase padre, lo utilizamos para llenar los atributos heredados del padre y 
 * después llenamos los atributos del televisor. 
 * • Método precioFinal(): este método será heredado y se le sumará la siguiente
 * funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se 
 * incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, 
 * aumentará $500. 
 * Recuerda que las condiciones que hemos visto en la clase Electrodomestico 
 * también deben afectar al precio.
 * Finalmente, en el main debemos realizar lo siguiente: 
 * Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios 
 * para mostrar el precio final de los dos electrodomésticos.
 *
 * @author Eduardo
 */

public class Servicios {
    
    Scanner leer = new Scanner(System.in);
    double precio,plusConsumo,plusPeso,plusCarga,plusResolucion,plusFreezer,plusSintonizador,precioFinal;
    String color;
    String respuesta;
    boolean continuar = true;
    char consumo;
    int peso,carga,resolucion,capacidad;
    boolean sintonizadorTDT,freezer;
    List<Electrodomesticos> listaElectrodomesticos = new ArrayList<>();

    Lavadora lavadora = new Lavadora();
    Televisor televisor = new Televisor();
    Heladera heladera = new Heladera();

    public char comprobarConsumoEnergetico(char letra){
        switch (letra) {
                case 'A':
                    consumo = 'A';
                    plusConsumo = 1000;
                    break;
                case 'B':
                    consumo = 'B';
                    plusConsumo = 800;
                    break;
                case 'C': 
                    consumo = 'C';
                    plusConsumo = 600;
                    break;
                case 'D': 
                    consumo = 'D';
                    plusConsumo = 500;
                    break;
                case 'E': 
                    consumo = 'E';
                    plusConsumo = 300;
                    break;
                case 'F': 
                    consumo = 'F';
                    plusConsumo = 100;
                    break;
                default:
                    consumo = 'F';
                    plusConsumo = 100;
                    break;
        }
        return consumo;
    }
    
    public void comprobarColor(String color){
        if(color.equalsIgnoreCase("blanco")){
            color="Blanco";
        }else{
            if(color.equalsIgnoreCase("negro")){
                color="Negro";
            }else{
                if(color.equalsIgnoreCase("rojo")){
                    color="Rojo";
                }else{
                    if(color.equalsIgnoreCase("azul")){
                        color="Azul";
                    }else{
                        if(color.equalsIgnoreCase("gris")){
                            color="Gris";
                        }else{
                            color="Blanco";
                        }
                    }
                }
            }
        }
    }
            
    public void crearElectrodomestico(){
        precio=0;
        color="Blanco";
        consumo='F';
        peso=0;
        System.out.print("Ingrese el precio......................: ");
        precio = leer.nextDouble();
        System.out.print("Ingrese el color.......................: ");
        color = leer.next();
        comprobarColor(color);
        System.out.print("Ingrese el consumo........(A/B/C/D/E/F): ");
        consumo = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumo);
        System.out.print("Ingrese el peso (en Kg)................: ");
        peso = leer.nextInt();
    }

    public double precioFinal(){
        char letra = consumo;
        plusConsumo = 0;
        plusPeso = 0;
        switch (letra) {
                case 'A':
                    plusConsumo = 1000;
                    break;
                case 'B':
                    plusConsumo = 800;
                    break;
                case 'C': 
                    plusConsumo = 600;
                    break;
                case 'D': 
                    plusConsumo = 500;
                    break;
                case 'E': 
                    plusConsumo = 300;
                    break;
                case 'F': 
                    plusConsumo = 100;
                    break;
                default:
                    plusConsumo = 100;
                    break;
        }
        if(peso < 20){
            plusPeso = 100;
        }else{
            if(peso >= 20 && peso < 50){
                plusPeso = 500;
            }else{
                if(peso >= 50 && peso < 80){
                    plusPeso = 800;
                }else{
                    plusPeso = 1000;
                    }
            }
        }
        precioFinal = plusConsumo + plusPeso;
        System.out.println("Plus por consumo        = " + plusConsumo);
        System.out.println("Plus por peso           = " + plusPeso);
        return precioFinal;
    }
    
    public Lavadora crearLavadora(){
        System.out.println("- - - - - - -  L A V A D O R A  - - - - - - -");
        crearElectrodomestico();
        System.out.print("Ingrese capacidad de carga (en Kg).....: ");
        carga = leer.nextInt();
        lavadora = new Lavadora(carga, precio, color, consumo, peso);
        listaElectrodomesticos.add(lavadora);
        return lavadora;
    }
    
    
    public void precioFinalLavadora(){
        precioFinal = precioFinal();
        plusCarga = 0;
        if (carga > 30){
            plusCarga = 500;
        }
        precioFinal = precioFinal + lavadora.getPrecio() + plusCarga;
        lavadora.setPrecio(precioFinal);
        System.out.println("Plus por carga          = " + plusCarga);
        System.out.println("Precio Final (lavadora) = " + precioFinal);
    }
    
    public Televisor crearTelvisor() {
        System.out.println("- - - - - - -  T E L E V I S O R  - - - - - - ");
        crearElectrodomestico();
        System.out.print("Ingrese la resolucion (en MPixel)......: ");
        resolucion = leer.nextInt();
        do{
            System.out.print("Ingrese si tiene sintonizador TDT (S/N): ");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("n")){
                sintonizadorTDT= false;
            }    
            if (respuesta.equalsIgnoreCase("s")){
                sintonizadorTDT = true;
            }
            if (respuesta.equalsIgnoreCase("n") || respuesta.equalsIgnoreCase("s")){
                continuar = false;
            }
        } while (continuar);
        televisor= new Televisor(resolucion, sintonizadorTDT, precio, color, consumo, peso);
        listaElectrodomesticos.add(televisor);
        return televisor;
    }
    
    public void precioFinalTelevisor(){
        precioFinal = precioFinal();
        if (resolucion > 40){
            plusResolucion = televisor.getPrecio()*0.30;
        }
        if (sintonizadorTDT){
            plusSintonizador = 500;
        }
        precioFinal = precioFinal + televisor.getPrecio() + plusResolucion + plusSintonizador;
        televisor.setPrecio(precioFinal);
        System.out.println("Plus por resolución     = " + plusResolucion);
        System.out.println("Plus por sintonizador   = " + plusSintonizador);
        System.out.println("Precio Final (Televisor)= " + precioFinal);
    }

    public Heladera crearHeladera(){
        System.out.println("- - - - - - -  H E L A D E R A  - - - - - - -");
        crearElectrodomestico();
        System.out.print("Ingrese capacidad (en Litros)..........: ");
        capacidad = leer.nextInt();
        do{
            System.out.print("Ingrese si tiene freezer .........(S/N): ");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("n")){
                freezer = false;
            }    
            if (respuesta.equalsIgnoreCase("s")){
                freezer = true;
            }
            if (respuesta.equalsIgnoreCase("n") || respuesta.equalsIgnoreCase("s")){
                continuar = false;
            }
        } while (continuar);
        heladera= new Heladera(capacidad, freezer, precio, color, consumo, peso);
        listaElectrodomesticos.add(heladera);
        return heladera;
    }

    public void precioFinalHeladera(){
        precioFinal = precioFinal();
        if (freezer){
            plusFreezer = 1000;
        }
        precioFinal = precioFinal + heladera.getPrecio() + plusFreezer;
        heladera.setPrecio(precioFinal);
        System.out.println("Plus por freezer        = " + plusFreezer);
        System.out.println("Precio Final (Heladera) = " + precioFinal);
    }

    
    public void mostrarElectrodomesticos(){
        double totalElectrodomesticos = 0;
        double totalLavadoras = 0;
        double totalTelevisores = 0;
        double totalHeladeras= 0;
        for (Electrodomesticos auxElectrodomesticos : listaElectrodomesticos) {
            
            if (auxElectrodomesticos instanceof Lavadora) {
                Lavadora aux = (Lavadora) auxElectrodomesticos;
                totalLavadoras = totalLavadoras + lavadora.getPrecio();
                totalElectrodomesticos = totalElectrodomesticos + lavadora.getPrecio();
                //System.out.println("Lavadora  " + aux);
                continue;
            }
            if (auxElectrodomesticos instanceof Televisor) {
                Televisor aux = (Televisor) auxElectrodomesticos;
                totalTelevisores = totalTelevisores + televisor.getPrecio();
                totalElectrodomesticos = totalElectrodomesticos + televisor.getPrecio();
                //System.out.println("Televisor " + aux);
                continue;
            }
            if (auxElectrodomesticos instanceof Heladera) {
                Heladera aux = (Heladera) auxElectrodomesticos;
                totalHeladeras = totalHeladeras + heladera.getPrecio();
                totalElectrodomesticos = totalElectrodomesticos + heladera.getPrecio();
                //System.out.println("Heladera  " + aux);
               
            }             
        }
        System.out.println(" ");
        System.out.println(" - - - - - - - - Totales - - - - - - - - - ");
        System.out.println("Total Lavadoras         = " + totalLavadoras);
        System.out.println("Total Televisores       = " + totalTelevisores);
        System.out.println("Total Heladeras         = " + totalHeladeras);
        System.out.println("Total Electrodomesticos = " + totalElectrodomesticos);
        
    }



    
}
