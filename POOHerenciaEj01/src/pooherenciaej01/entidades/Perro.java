package pooherenciaej01.entidades;

public class Perro extends Animal{

    public Perro() {
    }
    
    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse(){
        System.out.println(getNombre() + " es un " + getRaza() + " y se alimenta con " + getAlimento());
    }
    
    
}
