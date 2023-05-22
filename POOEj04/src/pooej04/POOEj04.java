package pooej04;

import pooej04.entidades.Rectangulo;

/**
 * @author Eduardo
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
 * base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
 * con los datos del Rectángulo dados por el usuario. También incluirá un método para
 * calcular la superficie del rectángulo y un método para calcular el perímetro del
 * rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
 * asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
 * setters y constructores correspondientes.
 * Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class POOEj04 {

    public static void main(String[] args) {
        
        Rectangulo rt = new Rectangulo();
        
        rt.crearRectangulo();
        System.out.println("Superficie.:" + rt.calcularSuperficie());
        System.out.println("Perímetro..:" + rt.calcularPerimetro());
        rt.dibujarRectangulo();
    }
    
}
