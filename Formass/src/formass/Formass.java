package formass;
import javax.swing.*;

/**
 *
 * @author Melvin
 */
public class Formass {
    public static void main(String[] args) {
        //Creacion de variables de instancia para comunicarse con las clases
        Circulo circulo= new Circulo();
        Cuadrado cuadrado= new Cuadrado();
        Linea linea= new Linea();
        Triangulo triangulo= new Triangulo();
        
        //Invocar eventos que se encuentra en cada clase
        circulo.dibujar();
        circulo.calcular_radio();
        
        cuadrado.dibujar();
        cuadrado.calcular_area();
        
        linea.dibujar();
        
        triangulo.dibujar();
        triangulo.calcular_area();  
    }
    
    
}
