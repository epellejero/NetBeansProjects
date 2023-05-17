package pooherenciaej01.entidades;

public class Caballo extends Animal{

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void alimentarse(){
        System.out.println(getNombre() + " es un " + getRaza() + " y se alimenta con " + getAlimento());
    }
    
}
