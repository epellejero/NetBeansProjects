package pooherenciaejex01.entidades;

/** 
 * • Número de mástiles para veleros. 
 *
 * @author Eduardo
 */
public class BarcosVeleros extends Barco{
    
   private int mastiles;

    public BarcosVeleros() {
    }

    public BarcosVeleros(int mastiles) {
        this.mastiles = mastiles;
    }

    public BarcosVeleros(int mastiles, String matricula, double eslora, int fabricacion) {
        super(matricula, eslora, fabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
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
        return super.toString() + "BarcosVeleros{" + "mastiles=" + mastiles + '}';
    }
    
    public BarcosVeleros crearBarcosVeleros(){
        mastiles=0;
        BarcosVeleros barcosVeleros;
        Barco barcoAux = super.crearBarco();
        System.out.println("- - - - - ALTA BARCO VELERO - - - - -"); 
        System.out.print("Ingrese la cantidad de mástiles........: ");
        mastiles = leer.nextInt();
        return barcosVeleros = new BarcosVeleros(mastiles,barcoAux.getMatricula(),barcoAux.getEslora(),barcoAux.getFabricacion());
    }
}
