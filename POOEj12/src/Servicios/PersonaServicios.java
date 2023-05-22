
package Servicios;

import java.util.Date;
import java.util.Scanner;
import pooej12.entidades.Persona;

/**
* Implemente la clase Persona. Una persona tiene un nombre y una fecha de
* nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y
* set. Y los siguientes métodos: 
*  Agregar un método de creación del objeto que respete la siguiente firma: 
*   crearPersona(). Este método rellena el objeto mediante un Scanner y le 
*   pregunta al usuario el nombre y la fecha de nacimiento de la persona a 
*   crear, recordemos que la fecha de nacimiento debe guardarse en un Date y 
*   los guarda en el objeto. 
*  Escribir un método calcularEdad() a partir de la fecha de nacimiento 
*   ingresada. Tener en cuenta que para conocer la edad de la persona también 
*   se debe conocer la fecha actual. 
*  Agregar a la clase el método menorQue(int edad) que recibe como parámetro 
*   otra edad y retorna true en caso de que el receptor tenga menor edad que la 
*   persona que se recibe como parámetro, o false en caso contrario.
*  Metodo mostrarPersona(): este método muestra la persona creada en el método
*   anterior.
* @author epellejero
*/
public class PersonaServicios {
    Scanner leer = new Scanner(System.in);
    
    public Persona altaPersona(){
        
        // Instanciar un objeto del tipo Persona()
        Persona p1 = new Persona();
        
        System.out.print("Ingrese el nombre : ");
        p1.setNombre(leer.next());
        System.out.print("Ingrese el dia de nacimiento DD : ");
        int dia = leer.nextInt();
        System.out.print("Ingrese el mes de nacimiento MM : ");
        int mes = leer.nextInt();
        System.out.print("Ingrese el año de nacimiento AAAA : ");
        int anio = leer.nextInt();
        Date fechaNacimiento = new Date(anio-1900, mes-1, dia);
        p1.setNacimiento(fechaNacimiento);
        return p1;
    }
    
    public void calcularEdad(Persona p1){
        Date hoy = new Date();
        System.out.println("Fecha actual : " + hoy);
        int edad = hoy.getYear()- p1.getNacimiento().getYear();
        System.out.println("Edad : " + edad);      
        //System.out.println(String.format("%d años, %d meses y %d días",edad.getYears(),edad.getMonths(),edad.getDays()));
    }
    
     public boolean menorQue(Persona p1){
        boolean flag = true;
        System.out.print("Ingrese el dia DD : ");
        int dia = leer.nextInt();
        System.out.print("Ingrese el mes MM : ");
        int mes = leer.nextInt();
        System.out.print("Ingrese el año AAAA : ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        System.out.println("fecha " +fecha);
        if (fecha.before(p1.getNacimiento())){
            flag=true;
            System.out.println("Fecha anterior a la fecha de nacimiento");
        } else {
            flag=false;
            System.out.println("Fecha posterior a la fecha de nacimiento");
        }
        return flag;
    }
     
       public void mostrarPersona(Persona p1){
        System.out.println("Nombre : " + p1.getNombre());
        System.out.println("Nacimiento : " + p1.getNacimiento());
    }
    
}    

