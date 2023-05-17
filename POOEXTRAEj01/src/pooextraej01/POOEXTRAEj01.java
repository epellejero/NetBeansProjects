package pooextraej01;

import pooextraej01.entidades.Cancion;

/**
 * Desarrollar una clase Cancion con los siguientes atributos: titulo y autor.
 * Se deberá́ definir además dos constructores: uno vacío que inicializa el
 * titulo y el autor a cadenas vacías y otro que reciba como parámetros el
 * titulo y el autor de la canción. Se deberán además definir los métodos
 * getters y setters correspondientes.
 */
public class POOEXTRAEj01 {

    public static void main(String[] args) {
        
        Cancion c1 = new Cancion();

        c1.cargarCancion();
        c1.mostrarCancion();
    }
}
