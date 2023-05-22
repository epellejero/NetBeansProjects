
package pooextraej05.servicios;

import pooextraej05.entidades.Meses;

/**
 * Crea una clase en Java donde declares una variable de tipo array de Strings
 * que contenga los doce meses del año, en minúsculas. A continuación, declara
 * una variable mesSecreto de tipo String, y hazla igual a un elemento del array
 * (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que
 * adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo
 * hace, pedir que vuelva a intentar adivinar el mes secreto. Un ejemplo de
 * ejecución del programa podría ser este: Adivine el mes secreto. Introduzca el
 * nombre del mes en minúsculas: febrero No ha acertado. Intente adivinarlo
 * introduciendo otro mes: agosto ¡Ha acertado!
 */
public class MesesServicios {
    
    Meses meses = new Meses();
    
    public void cargar(){
        String [] arregloMes = new String [12];
        arregloMes[0]="enero";
        arregloMes[1]="febrero";
        arregloMes[2]="marzo";
        arregloMes[3]="abril";
        arregloMes[4]="mayo";
        arregloMes[5]="junio";
        arregloMes[6]="julio";
        arregloMes[7]="agosto";
        arregloMes[8]="septiembre";
        arregloMes[9]="octubre";
        arregloMes[10]="noviembre";
        arregloMes[11]="diciembre";
        meses.setVectorMes(arregloMes);
        int i = 3;
        //int i = (int)(Math.random() * 10);
        meses.setMesSecreto(arregloMes[i]);
        //System.out.println("Mes secreto : " + arregloMes[i]);
    }    
    
    public boolean buscarMes(String mes){
        boolean respuesta = false;
        if (mes.equals(meses.getMesSecreto())){
            System.out.println("¡Ha acertado!");
            respuesta = true;
        } else {
            System.out.println("¡No ha acertado!");
        }
        return respuesta;
//        return (mes.equals(getMesSecreto()));
    }
    
    
}
