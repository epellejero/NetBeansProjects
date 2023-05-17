
package poocoleccion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Toma la Lista,el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno
 * @author Eduardo
 */
public class POOColeccion {
    
    public static void main(String[] args) {
        
        // Listas --------------------------------------------------
        ArrayList<Integer> numerosA = new ArrayList<>(); //lista de tipo Integer
        
        for (int i=0;i<5;i++){
            numerosA.add(10+i);
        }
        
        //numerosA.add(10);
        //numerosA.add(11);
        //numerosA.add(12);
        //numerosA.add(13);
        //numerosA.add(14);

        for (Integer aux : numerosA){
            System.out.print(aux + " ");
        }
        System.out.println("");
        
        numerosA.remove(0);
        numerosA.remove(2);
        
         for (Integer aux : numerosA){
            System.out.print(aux + " ");
        }
        System.out.println("");
        
        
        // Conjuntos -----------------------------------------------
        HashSet<Integer> numerosB = new HashSet<>();
        
        for (int i=0;i<7;i++){
            numerosB.add(20+i);
        }
        
        for (Integer aux : numerosB){
            System.out.print(aux + " ");
        }
        System.out.println("");
        {
        numerosB.add(36);
        numerosB.add(37);
        numerosB.add(38);
        }
        for (Integer aux : numerosB){
            System.out.print(aux + " ");
        }
        System.out.println("");
        
        System.out.println("Cantidad : " + numerosB.size());
        
        for (Integer aux : numerosB){
            System.out.print(aux + " ");
        }
        System.out.println("");
        
        numerosB.remove(22);
        
         for (int i=0;i<5;i++){
             numerosB.remove(22);
        }
        
       
        
        
        for (Integer aux : numerosB){
            System.out.print(aux + " ");
        }
        System.out.println("");
        
        
        // Mapas ---------------------------------------------------
        HashMap<Integer, String> alumnos = new HashMap<>();
        for (int i=0;i<5;i++){
            alumnos.put(1045+i,"alumno "+i);
        }
        
        alumnos.remove(1048);
        
        for (Map.Entry<Integer, String> entry :alumnos.entrySet()){
            System.out.println("DNI : " + entry.getKey() + " -  Nombre : " + entry.getValue());
        }
        System.out.println("");
        
        
    }
    
}


























