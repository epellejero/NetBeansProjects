package com.mycompany.poorelacionesej02.entidades;

/**
 * Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el
 * juego se trata de un número de jugadores, que, con un revolver de agua, el
 * cual posee una sola carga de agua, se dispara y se moja. Las clases por hacer
 * del juego son las siguientes: 
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición 
 * actual (posición del tambor que se dispara, puede que esté el agua o no) y 
 * posición agua (la posición del tambor donde se encuentra el agua). Estas dos 
 * posiciones, se generarán aleatoriamente.
 * Métodos: 
 * • llenarRevolver(): le pone los valores de posición actual y de posición del 
 *  agua. Los valores deben ser aleatorios. 
 * • mojar(): devuelve true si la posición del agua coincide con la posición 
 *  actual 
 * • siguienteChorro(): cambia a la siguiente posición del tambor 
 * • toString(): muestra información del revolver (posición actual y donde está
 *  el agua) 
 *
 * @author Eduardo
 */

public class RevolverDeAgua {
    
    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }
    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }
    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }
    public int getPosicionAgua() {
        return posicionAgua;
    }
    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    } 
}
