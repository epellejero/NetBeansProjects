
package pooej08.entidades;

import java.util.Scanner;

public class Cadena {
    
    Scanner leer = new Scanner(System.in);
    
    private String frase;
    private int longitudDeFrase;

    public Cadena() {
    }

    public Cadena(String frase, int longitudDeFrase) {
        this.frase = frase;
        this.longitudDeFrase = longitudDeFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitudDeFrase() {
        return longitudDeFrase;
    }

    public void setLongitudDeFrase(int longitudDeFrase) {
        this.longitudDeFrase = longitudDeFrase;
    }
     
    public int mostrarVocales(){
        int vocales=0;
        String letra;
        for (int i = 0; i < getLongitudDeFrase(); i++) {
            letra = getFrase().substring(i,(i+1)).toLowerCase();
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
                vocales++;
            }
        }
        return vocales;
    }
    
    public void invertirFrase(){
        System.out.print("Frase invertida : ");
        for (int i = getLongitudDeFrase(); i > 0; i--) {
            System.out.print(getFrase().substring((i-1),i));
        }
        System.out.println("");
    }
        
    public int vecesRepetido(String caracter){
        int repetirdo = 0;
        String letra;
        for (int i = 0; i < getLongitudDeFrase(); i++) {
            letra = getFrase().substring(i,(i+1));
            if (letra.equals(caracter)){
                repetirdo++;
            }
        }
        return repetirdo;
    }
        
    public void compararLongitud(int longitud){
        if (longitud == getLongitudDeFrase()){
            System.out.println("Frases de igual longitud");
        } else {
            System.out.println("Frases de distintas longitudes");
        }
    }
    
    public void unirFrases(String frase){
        System.out.println("Frases unidas ");
        System.out.println(getFrase()+frase);
    }
    
    public void reemplazarFrase(String caracter){
        String letra; 
        for (int i = 0; i < getLongitudDeFrase(); i++) {
            letra = getFrase().substring(i,(i+1));
            if (letra.equals("a")){
                letra = caracter;
            }    
            System.out.print(letra);
        }
        System.out.println("");
    }
    
    public boolean contieneLetra(String caracter){
        String letra;
        boolean contiene = false;
        for (int i = 0; i < getLongitudDeFrase(); i++) {
            letra = getFrase().substring(i,(i+1));
            if (letra.equals(caracter)){
                contiene = true;
            }
        }    
        return contiene;
    }
}

