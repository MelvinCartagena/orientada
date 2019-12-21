
package formass;
import javax.swing.*;
import java.math.*;

public class Circulo extends Formass {
  //Creacion de variables para carlcular el area de circulo
    public double radio=0, area;
   
    //Metodo calcular area de circulo
    public void calcular_radio(){
   
        radio= Double.parseDouble(JOptionPane.showInputDialog(null,"DIGITE EL RADIO"));
        area = 3.1416 * Math.pow(radio,2);
                
        JOptionPane.showMessageDialog(null, "RADIO CIRCULO" +area );
    }
    
    //Metodo dibujar 
  public void dibujar(){
      
      JOptionPane.showMessageDialog(null, "Dibujar Circulo");
  }
}
