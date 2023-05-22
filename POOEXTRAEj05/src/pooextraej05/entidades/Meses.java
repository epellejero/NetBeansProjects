
package pooextraej05.entidades;

import java.util.Scanner;

public class Meses {

    Scanner leer = new Scanner(System.in);
    private String[] vectorMes = new String[11];
    private String mesSecreto;

    public Meses() {
    }
    public Meses(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getVectorMes() {
        return vectorMes;
    }
    public void setVectorMes(String[] vectorMes) {
        this.vectorMes = vectorMes;
    }
    public String getMesSecreto() {
        return mesSecreto;
    }
    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
}
