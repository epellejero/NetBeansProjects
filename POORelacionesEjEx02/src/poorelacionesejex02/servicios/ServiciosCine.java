package poorelacionesejex02.servicios;

import java.util.ArrayList;
import poorelacionesejex02.entidades.Cine;
import poorelacionesejex02.entidades.Espectador;
import poorelacionesejex02.entidades.Pelicula;

/**
 * Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto
 * de asientos (8 filas por 6 columnas). De Cine nos interesa conocer la
 * película que se está reproduciendo, la sala con los espectadores y el precio
 * de la entrada. Luego, de las películas nos interesa saber el título,
 * duración, edad mínima y director. Por último, del espectador, nos interesa
 * saber su nombre, edad y el dinero que tiene disponible. Para representar la
 * sala con los espectadores vamos a utilizar una matriz. Los asientos son
 * etiquetados por una letra y un número la fila A1 empieza al final del mapa
 * como se muestra en la tabla. También deberemos saber si el asiento está
 * ocupado por un espectador o no, si esta ocupado se muestra una X, sino un
 * espacio vacío. 
 * 8 A X | 8 B X | 8 C X | 8 D   | 8 E X | 8 F X 
 * 7 A X | 7 B X | 7 C X | 7 D X | 7 E   | 7 F X 
 * 6 A X | 6 B X | 6 C   | 6 D X | 6 E X | 6 F   
 * 5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
 * 4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X 
 * 3 A X | 3 B X | 3 C X | 3 D   | 3 E X | 3 F X 
 * 2 A X | 2 B   | 2 C X | 2 D X | 2 E X | 2 F  
 * 1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X 
 * Se debe realizar una pequeña simulación, en la que se generen muchos 
 * espectadores y se los ubique en los asientos aleatoriamente (no se puede 
 * ubicar un espectador donde ya este ocupado el asiento). 
 * Los espectadores serán ubicados de uno en uno y para ubicarlos tener en 
 * cuenta que sólo se podrá sentar a un espectador si tiene el dinero suficiente
 * para pagar la entrada, si hay espacio libre en la sala y si tiene la edad  
 * requerida para ver la película. En caso de que el asiento este ocupado se le 
 * debe buscar uno libre. Al final del programa deberemos mostrar la tabla, 
 * podemos mostrarla con la letra y numero de cada asiento o solo las X y 
 * espacios vacíos
 *
 * @author Eduardo
 */
public class ServiciosCine {
    int fila = 8;
    int columna = 6;
    ArrayList<Espectador> listaEspectadores = new ArrayList<>();
    String[][] sala = new String[fila][columna];
    String[] col = new String[]{"F","E","D","C","B","A"};
    Pelicula pelicula1;
    Cine cine;
    Espectador espectador;
    
    public void crearEspectadores() {
        Espectador espectador01 = new Espectador("Eduardo", 55, 20.00);
        Espectador espectador02 = new Espectador("Giuliana", 27, 50.00);
        Espectador espectador03 = new Espectador("Gonzalo", 22, 20.00);
        Espectador espectador04 = new Espectador("Luciana", 20, 50.00);
        Espectador espectador05 = new Espectador("Silvia", 51, 20.00);
        Espectador espectador06 = new Espectador("Luis", 27, 50.00);
        Espectador espectador07 = new Espectador("Pedro", 55, 20.00);
        Espectador espectador08 = new Espectador("Juan", 27, 50.00);
        Espectador espectador09 = new Espectador("José", 55, 20.00);
        Espectador espectador10 = new Espectador("Ivan", 27, 50.00);
        Espectador espectador11 = new Espectador("Ana", 22, 20.00);
        Espectador espectador12 = new Espectador("Lucia", 20, 50.00);
        Espectador espectador13 = new Espectador("Sergio", 51, 20.00);
        Espectador espectador14 = new Espectador("Ramón", 27, 50.00);
        Espectador espectador15 = new Espectador("Lucio", 55, 10.00);
        Espectador espectador16 = new Espectador("Carlos", 18, 50.00);

        listaEspectadores.add(espectador01);
        listaEspectadores.add(espectador02);
        listaEspectadores.add(espectador03);
        listaEspectadores.add(espectador04);
        listaEspectadores.add(espectador05);
        listaEspectadores.add(espectador06);
        listaEspectadores.add(espectador07);
        listaEspectadores.add(espectador08);
        listaEspectadores.add(espectador09);
        listaEspectadores.add(espectador10);
        listaEspectadores.add(espectador11);
        listaEspectadores.add(espectador12);
        listaEspectadores.add(espectador13);
        listaEspectadores.add(espectador14);
        listaEspectadores.add(espectador15);
        listaEspectadores.add(espectador16);
    }

    public void crearCine(){
        cine = new Cine(pelicula1, listaEspectadores, 10);
        for(int i = 0; i < fila ; i++){
            for (int j = 0; j < columna; j++){
                sala[i][j] = " ";
            }
        }    
    }
    public void mostrarEspectadores() {
        for (Espectador auxEspectador : listaEspectadores) {
            System.out.println(auxEspectador);
        }
    }

    public void mostrarPelicula(){
        System.out.println("" + pelicula1);
    }
    public void crearPelicula(){
          pelicula1 = new Pelicula("Interestelar", "Cristopher Nolan", 2.49, 18);
//        System.out.println("Ingrese el nombre de la película: ");
//        String nombrePelicula = leer.next();
//        System.out.println("Ingrese el nombre del director de la película: ");
//        String nombreDirector = leer.next();
//        System.out.println("Ingrese la duración de la película: ");
//        double duracionPelicula = leer.nextDouble();
//        System.out.println("Ingrese la edad mínima del espectador: ");
//        int edadMinima = leer.nextInt();
//        pelicula1 = new Pelicula(nombrePelicula, nombreDirector, duracionPelicula, edadMinima);
    }
        
    public void ventaTickets(){
        
        for (int i = 0; i < listaEspectadores.size(); i++){
            espectador = listaEspectadores.get(i);
            if (!tieneEdad(espectador,pelicula1)){
                System.out.println(espectador.getNombre() + " no tiene edad para ver la pelicula");
            } else {
                if (!tieneDinero(espectador,cine)){
                    System.out.println(espectador.getNombre() + " no tiene dinero suficiente para ver la pelicula");
                } else {
                    if (acientoSala(espectador)){
                        System.out.println("Listo, pase el que sigue");
                    } else {
                        System.out.println("No hay lugar");
                    } 
                }
            }    
        }
        System.out.println("No hay más espectadores - ");
    }
    
    public boolean tieneDinero(Espectador espectador, Cine cine ){
        boolean dinero = true;
        if(cine.getPrecioEntrada() > espectador.getDinero()){
            dinero=false;
        }
        return dinero;
    }
    
    public boolean tieneEdad(Espectador espectador, Pelicula pelicula){
        boolean edad = true;
        if(pelicula1.getEdadMinima() > espectador.getEdad()){
            edad = false;
        }
        return edad;
    }
    
    public boolean acientoSala(Espectador espectador){
    boolean aciento = false;
    do {
        int posicionFila = (int)((Math.random()*fila+1)-1);
        int posicionColumna = (int)((Math.random()*columna+1)-1);
        System.out.println("Asiento: " + (posicionFila+1) + "/" + col[(posicionColumna)]);
        if (sala[posicionFila][posicionColumna].equalsIgnoreCase(" ")){
            aciento = true;
            sala[posicionFila][posicionColumna] = "X";
            System.out.print(" Espectador " + espectador.getNombre() + " ubicado");
        } else {
            System.out.print(" ocupado ");
            aciento = false;
        }
    } while (!aciento);            
    return aciento;
    }
    
    public void muestraSala(){
        System.out.println(" - - - - - - Ocupación de la sala - - - - - -");
         for(int i = 7; i >= 0; i--){
             for (int j = 5; j >= 0; j--){
                System.out.print("| " + (i+1) + col[j] + sala[i][j] + " | ");
            }
             System.out.println("");
        }
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - -"); 
    } 
}
