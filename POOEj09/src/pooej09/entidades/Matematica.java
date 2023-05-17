package pooej09.entidades;

public class Matematica {
    private double numero1,numero2;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double devolverMayor(){
        double mayor;
        if (getNumero1() > getNumero2()){
            mayor = getNumero1();
        } else if (getNumero1() < getNumero2()){
            mayor = getNumero2();
        } else{
            mayor = getNumero1();
        }
        return mayor;
    }
    
     public double devolverMenor(){
        double menor;
        if (getNumero1() < getNumero2()){
            menor = getNumero1();
        } else if (getNumero1() > getNumero2()){
            menor = getNumero2();
        } else{
            menor = getNumero1();
        }
        return menor;
    }
    
    public double calcularPotencia(){
        double potencia;
        potencia = Math.pow(devolverMayor(),devolverMenor());
        return potencia;
    }
    
    public double calcularRaiz(){
        double raizCuadrada;
        raizCuadrada = Math.sqrt(devolverMenor());
        return raizCuadrada;
    }
}
