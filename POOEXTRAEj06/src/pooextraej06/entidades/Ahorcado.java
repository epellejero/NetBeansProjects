
package pooextraej06.entidades;

import java.util.Scanner;

/**
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá
 * contener como atributos, un vector con la palabra a buscar, la cantidad de
 * letras encontradas y la cantidad jugadas máximas que puede realizar el
 * usuario. Definir los siguientes métodos con los parámetros que sean
 * necesarios: 
 *  Constructores, tanto el vacío como el parametrizado. 
 *  Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas 
 *   máxima. Con la palabra del usuario, pone la longitud de la palabra, como la 
 *   longitud del vector. Después ingresa la palabra en el vector, letra por 
 *   letra, quedando cada letra de la palabra en un índice del vector. 
 *   Y también, guarda en cantidad de jugadas máximas, el valor que ingresó el 
 *   usuario y encontradas en 0. 
 *  Método longitud(): muestra la longitud de la palabra que se debe encontrar.
 *   Nota: buscar como se usa el vector.length. 
 *  Método buscar(letra): este método recibe una letra dada por el usuario y 
 *   busca si la letra ingresada es parte de la palabra o no. También informará 
 *   si la letra estaba o no. 
 *  Método encontradas(letra): que reciba una letra ingresada por el usuario y
 *   muestre cuantas letras han sido encontradas y cuantas le faltan. 
 *   Este método además deberá devolver true si la letra estaba y false si la 
 *   letra no estaba, ya que, cada vez que se busque una letra que no esté, se 
 *   le restará uno a sus oportunidades. 
 *  Método intentos(): para mostrar cuantas oportunidades le queda al jugador. 
 *  Método juego(): el método juego se encargará de llamar todos los métodos 
 *   previamente mencionados e informará cuando el usuario descubra toda la 
 *   palabra o se quede sin intentos. Este método se llamará en el main. 
 *   Un ejemplo de salida puede ser así:
 * 
 *   Ingrese una letra: a 
 *   Longitud de la palabra: 6 
 *   Mensaje: La letra pertenece a la palabra 
 *   Número de letras (encontradas, faltantes): (3,4) 
 *   Número de oportunidades restantes: 4
 *   ---------------------------------------------- 
 *   Ingrese una letra: z 
 *   Longitud de la palabra: 6 
 *   Mensaje: La letra no pertenece a la palabra 
 *   Número de letras (encontradas, faltantes): (3,4) 
 *   Número de oportunidades restantes: 3
 *   --------------------------------------------- 
 *   Ingrese una letra: b 
 *   Longitud de la palabra: 6 
 *   Mensaje: La letra no pertenece a la palabra 
 *   Número de letras (encontradas, faltantes): (4,3) 
 *   Número de oportunidades restantes: 2
 *   ---------------------------------------------- 
 *   Ingrese una letra: u 
 *   Longitud de la palabra: 6 
 *   Mensaje: La letra no pertenece a la palabra 
 *   Número de letras (encontradas, faltantes): (4,3) 
 *   Número de oportunidades restantes: 1
 *   ---------------------------------------------- 
 *   Ingrese una letra: q 
 *   Longitud de la palabra: 6 
 *   Mensaje: La letra no pertenece a la palabra 
 *   Mensaje: Lo sentimos, no hay más oportunidades
 */
public class Ahorcado {
    Scanner leer = new Scanner(System.in);
    public String[] palabraABuscar;
    private int letrasEncontradas;
    private int cantidadMaximaDeJugadas;

    public Ahorcado() {
    }
    public Ahorcado(String[] palabraABuscar, int letrasEncontradas, int cantidadMaximaDeJugadas) {
        this.palabraABuscar = palabraABuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadMaximaDeJugadas = cantidadMaximaDeJugadas;
    }

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }
    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }
    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }
    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }
    public int getCantidadMaximaDeJugadas() {
        return cantidadMaximaDeJugadas;
    }
    public void setCantidadMaximaDeJugadas(int cantidadMaximaDeJugadas) {
        this.cantidadMaximaDeJugadas = cantidadMaximaDeJugadas;
    }
    
//    public void crearJuego(){
//        System.out.print("Ingrese la palabra a buscar : ");
//        String palabra = leer.nextLine();
//        int longitud = palabra.length();
//        String[] vector = new String[longitud];
//        for (int i = 0; i < longitud; i++) {
//            vector[i] = palabra.substring(i, i+1);
//        }
//        palabraABuscar = new String[longitud];
//        setPalabraABuscar(vector);
//        System.out.print("Ingrese la cantidad maxima de intentos : ");
//        setCantidadMaximaDeJugadas(leer.nextInt());
//        setLetrasEncontradas(0);
//    }
    
//    public int longitud(){
//        return getPalabraABuscar().length;
//    }
    
//    public boolean buscarLetra(String letra){
//        boolean respuesta = false;
//        int encontradas = 0;
//        for (int i=0; i<longitud(); i++){
//            String pos = getPalabraABuscar()[i];        
//            if (pos.equals(letra)){
//                setLetrasEncontradas(getLetrasEncontradas()+ 1);
//                respuesta = true;
//            }
//        }
//        return respuesta;
//    }
//    public int intentos(int i){
//        return (getCantidadMaximaDeJugadas()-(i+1));        
//    }
    
//    public void empezarJuego(){
//        String letra;
//        System.out.println(" - - - - JUEGO AHORCADO - - - - ");
//        for (int i = 0; i < getCantidadMaximaDeJugadas(); i++) {
//            System.out.print("Ingrese una letra: ");
//            letra = leer.next();
//            System.out.println("Longitud de la palabra: " + longitud());
//            if (buscarLetra(letra)){
//                System.out.println("Mensaje: la letra pertenece a la palabra");
//            } else {
//                System.out.println("Mensaje: la letra no pertenece a la palabra");
//            }
//            System.out.print("Número de letras (encontradas, faltantes): ");
//            System.out.println("(" + getLetrasEncontradas() + "/" + (longitud()-getLetrasEncontradas()) + ")");
//            if (getLetrasEncontradas() == longitud()){
//                System.out.println("Has resuento el juego !!!!");
//                break;
//            } else if ((intentos(i)==0)){
//                System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
//                break;
//            }else{
//                System.out.println("Número de oportunidades restantes: " + intentos(i));
//            }
//            
//            System.out.println("-----------------------------------------");
//        }
//    }
}
