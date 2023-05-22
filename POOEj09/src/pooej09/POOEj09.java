package pooej09;

import pooej09.entidades.Matematica;

/**
 * Realizar una clase llamada Matemática que tenga como atributos dos números
 * reales con los cuales se realizarán diferentes operaciones matemáticas. La
 * clase deber tener un constructor vacío, parametrizado y get y set. En el main
 * se creará el objeto y se usará el Math.random para generar los dos números y
 * se guardaran en el objeto con su respectivos set. Deberá además implementar
 * los siguientes métodos:
 * a) Método devolverMayor() para retornar cuál de los dos atributos tiene el 
 *    mayor valor 
 * b) Método calcularPotencia() para calcular la potencia del mayor valor de la
 *    clase elevado al menor número. Previamente se deben redondear ambos 
 *    valores. 
 * c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos 
 *    valores. Antes de calcular la raíz cuadrada se debe obtener el valor 
 *    absoluto del número.
 */
public class POOEj09 {

    public static void main(String[] args) {
        // 
        Matematica mat = new Matematica();
        double num1 = Math.round(Math.random() * 10);
        double num2 = Math.round(Math.random() * 10);
        System.out.println("num1 : " + num1 + "  -  num2 : " + num2);
        mat.setNumero1(num1);
        mat.setNumero2(num2);
        
        System.out.println("Mayor         " + mat.devolverMayor());
        System.out.println("Menor         " + mat.devolverMenor());
        System.out.println("Potencia      " + mat.calcularPotencia());
        System.out.println("Raiz cuadrada " + mat.calcularRaiz());
        
        
        
    }

}
