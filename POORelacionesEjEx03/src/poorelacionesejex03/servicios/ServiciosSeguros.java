package poorelacionesejex03.servicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import poorelacionesejex03.entidades.Cliente;
import poorelacionesejex03.entidades.Poliza;
import poorelacionesejex03.entidades.Vehiculo;

/**
 * Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a
 * contar que te ha contratado “La Tercera Seguros”, una empresa aseguradora que
 * brinda a sus clientes coberturas integrales para vehículos. Luego de un
 * pequeño relevamiento, te vamos a pasar en limpio los requerimientos del
 * sistema que quiere realizar la empresa. 
 * a. Gestión Integral de clientes. En este módulo vamos a registrar la 
 *   información personal de cada cliente que posea pólizas en nuestra empresa. 
 *   Nombre y apellido, documento, mail, domicilio, teléfono. 
 * b. Gestión de vehículos. Se registra la información de cada vehículo 
 *   asegurado. Marca, modelo, año, número de motor, chasis, color, tipo 
 *   (camioneta, sedán, etc.). 
 * c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos 
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
public class ServiciosSeguros {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cliente cliente ;
    Vehiculo vehiculo;
    Poliza poliza;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
    
    
    
    public Cliente altaCliente(){
        System.out.println(" - - - - A L T A   D E   C L I E N T E - - - -");
        System.out.print("Ingrese el nombre.....: ");
        String nombreCliente = leer.next();
        System.out.print("Ingrese el apellido...: ");
        String apellidoCliente = leer.next();
        System.out.print("Ingrese el documento..: ");
        String documentoCliente = leer.next();
        System.out.print("Ingrese el mail ......: ");
        String mailCliente = leer.next();
        System.out.print("Ingrese el domicilio..: ");
        String domicilioCliente = leer.next();
        System.out.print("Ingrese el teléfono...: ");
        String telefonoCliente = leer.next();
        return cliente = new Cliente(nombreCliente,apellidoCliente,documentoCliente,mailCliente,domicilioCliente,telefonoCliente);
   }
    
    public Vehiculo altaVehiculo(){
        System.out.println(" - - -  A L T A   D E   V E H I C U L O  - - -");        
        System.out.print("Ingrese la marca .....: ");
        String marca = leer.next();
        System.out.print("Ingrese el modelo ....: ");
        String modelo = leer.next();
        System.out.print("Ingrese el año .......: ");
        String anio = leer.next();
        System.out.print("Ingrese el N° motor...: ");
        String motor = leer.next();
        System.out.print("Ingrese el N° chasis..: ");
        String chasis = leer.next();
        System.out.print("Ingrese el color......: ");
        String color = leer.next();
        System.out.print("Ingrese el tipo.......: ");
        String tipo = leer.next();
        return vehiculo = new Vehiculo(marca, modelo, anio, motor, chasis, color, tipo);
    }
   
    public void altaPoliza() throws ParseException{
        double montoMaxGranizo = 0;
        System.out.println(" - - - - A L T A   D E   P O L I Z A - - - - -");
        System.out.print("N° de poliza..........: ");
        String numeroPoliza = leer.next();
        System.out.print("Fecha de inicio.......: ");
        Date inicioPoliza = sdf.parse(leer.next());
        System.out.print("Fecha de fin..........: ");
        Date finPoliza = sdf.parse(leer.next());
        System.out.print("Cantidad de cuotas....: ");
        int cuotasPoliza = leer.nextInt();
        System.out.print("Forma de pago.........: ");
        String formaPagoPoliza = leer.next();
        System.out.print("Monto total asegurado.: ");
        double montoTotalPoliza = leer.nextDouble();
        System.out.print("Incluye granizo....S/N: ");
        String incluyeGranizo = leer.next();
        if (incluyeGranizo.equalsIgnoreCase("S")){
            System.out.print("Monto máximo granizo..: ");
            montoMaxGranizo = leer.nextDouble();
        }    
        System.out.print("Tipo de cobertura.....: ");
        String tipoCobertura = leer.next();
        cliente = altaCliente();
        vehiculo = altaVehiculo();
        poliza = new Poliza(numeroPoliza, inicioPoliza, finPoliza, cuotasPoliza, formaPagoPoliza, montoTotalPoliza, incluyeGranizo, montoMaxGranizo, tipoCobertura, cliente, vehiculo);
    }
    
    public void muestraPoliza(){
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("" + poliza);
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - -"); 
    }
    
}
