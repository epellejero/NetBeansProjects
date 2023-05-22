package poorelacionesejex03.entidades;

import java.util.Date;

/**
 *   Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas 
 *   en cada póliza. Esas cuotas van a contener la siguiente información: número 
 *   de cuota,monto total de la cuota,si está o no pagada, fecha de vencimiento,
 *   forma de pago (efectivo, transferencia, etc.).
 * 
 * @author Eduardo
 */
public class Cuotas {
    
    private int numCuota;
    private double montoCuota;
    private String estadoCuota;
    private Date vencimientoCuota;
    private String formaPago;

    public Cuotas() {
    }
    public Cuotas(int numCuota, double montoCuota, String estadoCuota, Date vencimientoCuota, String formaPago) {
        this.numCuota = numCuota;
        this.montoCuota = montoCuota;
        this.estadoCuota = estadoCuota;
        this.vencimientoCuota = vencimientoCuota;
        this.formaPago = formaPago;
    }

    public int getNumCuota() {
        return numCuota;
    }
    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }
    public double getMontoCuota() {
        return montoCuota;
    }
    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }
    public String getEstadoCuota() {
        return estadoCuota;
    }
    public void setEstadoCuota(String estadoCuota) {
        this.estadoCuota = estadoCuota;
    }
    public Date getVencimientoCuota() {
        return vencimientoCuota;
    }
    public void setVencimientoCuota(Date vencimientoCuota) {
        this.vencimientoCuota = vencimientoCuota;
    }
    public String getFormaPago() {
        return formaPago;
    }
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "numCuota=" + numCuota + ", montoCuota=" + montoCuota + ", estadoCuota=" + estadoCuota + ", vencimientoCuota=" + vencimientoCuota + ", formaPago=" + formaPago + '}';
    }

}
