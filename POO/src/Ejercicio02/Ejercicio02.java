/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02;

import Ejercicio02.Servicios.CircunsferenciaServicios;

/**
 *
 * @author Eduardo
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircunsferenciaServicios cs = new CircunsferenciaServicios();
        cs.crearCircunsferencia();
        cs.crearArea(cs);   
        cs.crearPerimetro(cs);
        
    }
    
}
