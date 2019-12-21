/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo3;
import javax.swing.*;
/**
 *
 * @author Melvin
 */
public class Modulo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ciudadano var= new Ciudadano();
        
        //var.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad")));
       // var.setExperiencia(Integer.parseInt(JOptionPane.showInputDialog("Años Experiencia")));
       // var.setNombre(JOptionPane.showInputDialog("Nombre"));
               
        var.edad=Integer.parseInt(JOptionPane.showInputDialog("Edad"));
        var.experiencia=Integer.parseInt(JOptionPane.showInputDialog("Años de Experiencia"));
        var.nombre=JOptionPane.showInputDialog("Nombre");
       
       System.out.println("Edad "+ var.getEdad());
       System.out.println("Años de Experiencia "+ var.getExperiencia());
       System.out.println("Nombre "+ var.getNombre());
       
       
        
        
    }
    
}
