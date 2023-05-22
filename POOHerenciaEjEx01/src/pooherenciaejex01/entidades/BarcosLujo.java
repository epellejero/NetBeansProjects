package pooherenciaejex01.entidades;

/**
 * Potencia en CV y número de camarotes para yates de lujo.
 * @author Eduardo
 */
public class BarcosLujo extends Barco{
    
    private int cvBarcoLujo;
    private int camarotes;

    public BarcosLujo() {
    }

    public BarcosLujo(int cvBarcoLujo, int camarotes) {
        this.cvBarcoLujo = cvBarcoLujo;
        this.camarotes = camarotes;
    }

    public BarcosLujo(int cvBarcoLujo, int camarotes, String matricula, double eslora, int fabricacion) {
        super(matricula, eslora, fabricacion);
        this.cvBarcoLujo = cvBarcoLujo;
        this.camarotes = camarotes;
    }

    public int getCvBarcoLujo() {
        return cvBarcoLujo;
    }

    public void setCvBarcoLujo(int cvBarcoLujo) {
        this.cvBarcoLujo = cvBarcoLujo;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
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
        return super.toString() + "BarcosLujo{" + "cvBarcoLujo=" + cvBarcoLujo + ", camarotes=" + camarotes + '}';
    }
    
    public Barco crearBarcoLujo(){
        cvBarcoLujo=0;
        camarotes=0;
        BarcosLujo barcosLujo;
        Barco barcoAux = super.crearBarco();
        System.out.println("- - - - - ALTA BARCO DE LUJO - - - - -"); 
        System.out.print("Ingrese los CV del Motor ..............: ");
        cvBarcoLujo = leer.nextInt();
        System.out.print("Ingrese la cantidad de camarotes.......: ");
        camarotes = leer.nextInt();
        return barcosLujo = new BarcosLujo(cvBarcoLujo, camarotes, barcoAux.getMatricula(), barcoAux.getEslora(),barcoAux.getFabricacion());
    }
    
}
