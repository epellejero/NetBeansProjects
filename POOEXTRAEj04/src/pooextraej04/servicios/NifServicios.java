
package pooextraej04.servicios;

import java.util.Scanner;
import pooextraej04.entidades.Nif;

/**
 * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con
 * su correspondiente letra (NIF). Los atributos serán el número de DNI (entero
 * largo) y la letra (String o char) que le corresponde. Dispondrá de los
 * siguientes métodos: 
 *  Métodos getters y setters para el número de DNI y la letra. 
 *  Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la 
 *   letra que le corresponderá. Una vez calculado, le asigna la letra que le
 *   corresponde según el resultado del calculo. 
 *  Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y
 *   la letra en mayúscula; por ejemplo: 00395469-F). La letra correspondiente 
 *   al dígito verificador se calculará a traves de un método que funciona de la
 *   siguiente manera: Para calcular la letra se toma el resto de dividir el 
 *   número de DNI por 23 (el resultado debe ser un número entre 0 y 22). 
 *   El método debe buscar en un array (vector) de caracteres la posición que 
 *   corresponda al resto de la división para obtener la letra correspondiente. 
 *   La tabla de caracteres es la siguiente: 
 *   POSICIÓN 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
 *   LETRA    T R W A G M Y F P D  X  B  N  J  Z  S  Q  V  H  L  C  K  E
 * @author Eduardo
 */
public class NifServicios {
    
    Scanner leer = new Scanner(System.in);
    Nif nif = new Nif();
    
    public void altaNif(){
        System.out.println("Ingrese el número de DNI: ");
        nif.setDni(leer.nextInt());
        calcularNif();
    }
    
    public void mostrarNif(){
        System.out.println("DNI: " + nif.getDni() + " - " + nif.getLetra());
    }
    
    public String calcularNif(){
        String[] vector = new String [23];
        vector[0]="T";
        vector[1]="R";
        vector[2]="W";
        vector[3]="A";
        vector[4]="G";
        vector[5]="M";
        vector[6]="Y";
        vector[7]="F";
        vector[8]="P";
        vector[9]="D";
        vector[10]="X";
        vector[11]="B"; 
        vector[12]="N";
        vector[13]="J";
        vector[14]="Z";
        vector[15]="S";
        vector[16]="Q";
        vector[17]="V";
        vector[18]="H";
        vector[19]="L";
        vector[20]="C";
        vector[21]="K";
        vector[22]="E";
        int i = nif.getDni()%23;
        String letra = vector[i];
        nif.setLetra(letra);
        return letra;
    }
    
}
