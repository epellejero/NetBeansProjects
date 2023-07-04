
package servicios;

import java.util.Scanner;
import pooej07.entidades.Persona;

/**
 *
 * @author Eduardo
 */
public class PersonaServicios {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona altaPersona(){
        
        Persona p1 = new Persona();
        String opSexo;
        System.out.print("Ingrese el nombre : ");
        p1.setNombre(leer.next());
        System.out.print("Ingrese la edad   : ");
        p1.setEdad(leer.nextInt());
        while (true){
            System.out.print("Ingrese el sexo  H=Hombre  M=Mujer  O=Otro : ");
            opSexo = leer.next().toUpperCase();
            if (opSexo.equals("H") || opSexo.equals("M") || opSexo.equals("O")){
                p1.setSexo(opSexo);
                break;
            } else {
                System.err.println("Error");
            }   
        }    
        System.out.print("Ingrese el peso en Kg : ");
        p1.setPeso(leer.nextDouble());
        System.out.print("Ingrese la altura en metros: ");
        p1.setAltura(leer.nextDouble());
        return p1;
    }
    
    public int calcularIMC(Persona p1){
        double icm,alturaP,pesoP;
        int retorno;
        alturaP = p1.getAltura();
        pesoP = p1.getPeso();
        icm = pesoP/Math.pow(alturaP,2);
        if (icm<20){
            retorno = -1;
        } else if (icm>25){
            retorno = 1;
        } else {
            retorno = 0;
        }
        return retorno;
    }
    
    public boolean esMayorDeEdad(Persona p1) throws Exception {
        boolean mayorDeEdad = true;
        if (p1.getEdad() < 21){
            mayorDeEdad = false;
        }
        return mayorDeEdad;
    }
    
}
