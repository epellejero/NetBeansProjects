package pooherenciaejex01.entidades;

/**
 * • Potencia en CV para barcos a motor. 
 * 
 * @author Eduardo
 */

public class BarcosMotor extends Barco{
    
    private int cvBarcoMotor;

    public BarcosMotor() {
    }

    public BarcosMotor(int cvBarcoMotor) {
        this.cvBarcoMotor = cvBarcoMotor;
    }

    public BarcosMotor(int cvBarcoMotor, String matricula, double eslora, int fabricacion) {
        super(matricula, eslora, fabricacion);
        this.cvBarcoMotor = cvBarcoMotor;
    }

    public int getCvBarcoMotor() {
        return cvBarcoMotor;
    }

    public void setCvBarcoMotor(int cvBarcoMotor) {
        this.cvBarcoMotor = cvBarcoMotor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    @Override
    public String toString() {
        return super.toString() + "BarcosMotor{" + "cvBarcoMotor=" + cvBarcoMotor + '}';
    }
    
    public BarcosMotor crearBarcoMotor(){
        cvBarcoMotor=0;
        BarcosMotor barcosMotor;
        Barco barcoAux = super.crearBarco();
        System.out.println("- - - - - ALTA BARCO CON MOTOR - - - - -"); 
        System.out.print("Ingrese los CV del Motor ..............: ");
        cvBarcoMotor = leer.nextInt();
        return barcosMotor = new BarcosMotor(cvBarcoMotor,barcoAux.getMatricula(),barcoAux.getEslora(),barcoAux.getFabricacion());
    }
    

    
}
