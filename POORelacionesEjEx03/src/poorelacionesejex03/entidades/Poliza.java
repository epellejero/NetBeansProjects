package poorelacionesejex03.entidades;

import java.util.Date;

/**
 *   Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos 
 *   tanto de un vehículo, como los datos de un solo cliente. Los datos 
 *   incluidos en ella son: número de póliza, fecha de inicio y fin de la póliza,
 *   cantidad de cuotas, forma de pago, monto total asegurado, incluye granizo, 
 *   monto máximo granizo, tipo de cobertura (total,contra terceros, etc.). 
 *   Nota: prestar atención al principio de este enunciado y pensar en las 
 *   relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a 
 *   muchos, de muchos a uno o de muchos a muchos. 
 * d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas 
 *   en cada póliza. Esas cuotas van a contener la siguiente información: número 
 *   de cuota,monto total de la cuota,si está o no pagada, fecha de vencimiento,
 *   forma de pago (efectivo, transferencia, etc.). 
 * 
 * Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los 
 * requerimientos arriba descriptos.
 * Modelando clases con atributos y sus correspondientes relaciones.
 *
 * @author Eduardo
 */
public class Poliza {
    
    private String numeroPoliza;
    private Date inicioPoliza;
    private Date finPoliza;
    private int cuotasPoliza;
    private String formaPagoPoliza;
    private double montoTotalPoliza;
    private String incluyeGranizo;
    private double montoMaxGranizo;
    private String tipoCobertura;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Poliza() {
    }
    public Poliza(String numeroPoliza, Date inicioPoliza, Date finPoliza, int cuotasPoliza, String formaPagoPoliza, double montoTotalPoliza, String incluyeGranizo, double montoMaxGranizo, String tipoCobertura, Cliente cliente, Vehiculo vehiculo) {
        this.numeroPoliza = numeroPoliza;
        this.inicioPoliza = inicioPoliza;
        this.finPoliza = finPoliza;
        this.cuotasPoliza = cuotasPoliza;
        this.formaPagoPoliza = formaPagoPoliza;
        this.montoTotalPoliza = montoTotalPoliza;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipoCobertura = tipoCobertura;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }
    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }
    public Date getInicioPoliza() {
        return inicioPoliza;
    }
    public void setInicioPoliza(Date inicioPoliza) {
        this.inicioPoliza = inicioPoliza;
    }
    public Date getFinPoliza() {
        return finPoliza;
    }
    public void setFinPoliza(Date finPoliza) {
        this.finPoliza = finPoliza;
    }
    public int getCuotasPoliza() {
        return cuotasPoliza;
    }
    public void setCuotasPoliza(int cuotasPoliza) {
        this.cuotasPoliza = cuotasPoliza;
    }
    public String getFormaPagoPoliza() {
        return formaPagoPoliza;
    }
    public void setFormaPagoPoliza(String formaPagoPoliza) {
        this.formaPagoPoliza = formaPagoPoliza;
    }
    public double getMontoTotalPoliza() {
        return montoTotalPoliza;
    }
    public void setMontoTotalPoliza(double montoTotalPoliza) {
        this.montoTotalPoliza = montoTotalPoliza;
    }
    public String getIncluyeGranizo() {
        return incluyeGranizo;
    }
    public void setIncluyeGranizo(String incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }
    public double getMontoMaxGranizo() {
        return montoMaxGranizo;
    }
    public void setMontoMaxGranizo(double montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }
    public String getTipoCobertura() {
        return tipoCobertura;
    }
    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numeroPoliza=" + numeroPoliza + ", inicioPoliza=" + inicioPoliza + ", finPoliza=" + finPoliza + ", cuotasPoliza=" + cuotasPoliza + ", formaPagoPoliza=" + formaPagoPoliza + ", montoTotalPoliza=" + montoTotalPoliza + ", incluyeGranizo=" + incluyeGranizo + ", montoMaxGranizo=" + montoMaxGranizo + ", tipoCobertura=" + tipoCobertura + ", cliente=" + cliente + ", vehiculo=" + vehiculo + '}';
    }
    
    
    
}
