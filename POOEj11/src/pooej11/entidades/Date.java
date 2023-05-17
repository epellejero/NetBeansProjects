
package pooej11.entidades;
/**
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo
 * con la clase Date. En este ejercicio deberemos instanciar en el main, una
 * fecha usando la clase Date, para esto vamos a tener que crear 3 variables,
 * dia, mes y anio que se le pedirán al usuario para poner el constructor del
 * objeto Date. Una vez creada la fecha de tipo Date, deberemos mostrarla y
 * mostrar cuantos años hay entre esa fecha y la fecha actual, que se puede
 * conseguir instanciando un objeto Date con constructor vacío. Ejemplo fecha:
 * Date fecha = new Date(anio, mes, dia); Ejemplo fecha actual: Date fechaActual
 * = new Date();
 */
public class Date {
    private int anio;
    private int mes;
    private int dia;

    public Date() {
    }
    public Date(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    
    
}
