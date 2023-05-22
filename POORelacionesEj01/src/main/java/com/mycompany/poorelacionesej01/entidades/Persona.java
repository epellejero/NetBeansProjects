package com.mycompany.poorelacionesej01.entidades;

/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
 * contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y
 * tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y
 * Perro. Ahora deberemos en el main crear dos Personas y dos Perros. Después,
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona.
 *
 * @author Eduardo
 */
public class Persona {

    private String nombrePersona;
    private String apellido;
    private int edad;
    private int documento;
    private Perro mascota;

    public Persona() {
    }
    public Persona(String nombrePersona, String apellido, int edad, int documento, Perro mascota) {
        this.nombrePersona = nombrePersona;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.mascota = mascota;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public Perro getMascota() {
        return mascota;
    }
    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombrePersona=" + nombrePersona + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", mascotas=" + mascota + '}';
    }
    
    
            
    
}
