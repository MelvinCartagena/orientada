
package formass;

import javax.swing.JOptionPane;
public class Triangulo extends Formass{
     //Creacion de variables para carlcular el area de Triangulo
    public int area, base=0,altura=0 ;
    
    
     //Metodo calcular area del Triangulo
      public void calcular_area(){
      base= Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA BASE"));
      altura= Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA ALTURA"));
      
      area=(base*altura)/2;
      
      JOptionPane.showMessageDialog(null, "AREA :" +area);
  }
    
      //Metodo dibujar
      public void dibujar(){
      
      JOptionPane.showMessageDialog(null, "Dibujar Triangulo");
  }
}
