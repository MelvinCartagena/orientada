
package formass;

import javax.swing.JOptionPane;
public class Cuadrado extends Formass{
    //Creacion de variables para carlcular el area de Cuadrado
    public int area, superficie=0 ;
    
     //Metodo calcular area del cuadrado
      public void calcular_area(){
      superficie= Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA SUPERFICIE EN C"));
      
      area=superficie*superficie;
      
      JOptionPane.showMessageDialog(null, "AREA :" +area);
  }
      //Metodo dibujar
             
      public void dibujar(){
      
      JOptionPane.showMessageDialog(null, "DIBUJAR CUADRADO");
  }
}
