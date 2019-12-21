/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;
import javax.swing.*;

/**
 *
 * @author Melvin
 */
public class Recursos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Recursos var= new Recursos();
        var.primer_metodo();
        var.segundo_metodo();
        var.tercer_metodo();
        var.cuarto_metodo();
    }
    
    public void primer_metodo(){
        System.out.println("Estoy aprendiendo, pero sere el mejor programador de mundo");
        
        
    }
    
    public void segundo_metodo(){
        int nota=85;
        
        if(nota>=70){
            System.out.println("Aprobado "+nota);
        }
        else{
            System.out.println("Reprobado "+nota);
        }
    }
    
    public void tercer_metodo(){
        int numerador=0, denominador=0, resultado;

        numerador=Integer.parseInt(JOptionPane.showInputDialog("Digite el numerador"));
        denominador=Integer.parseInt(JOptionPane.showInputDialog("Digite el denomindor"));
        
        
        if(numerador>0 && denominador>0){
            resultado=numerador/denominador;
            System.out.println("Resultado "+resultado);
        }
        else{
            if(denominador==0){
               // resultado=numerador/denominador;
                System.out.println("Error ");
                        
            }
        }
        
    }
    
    public void cuarto_metodo(){
        int x=0, valor;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite el limite"));
        for(int i=0;i<x;i++){
            valor=Integer.parseInt(JOptionPane.showInputDialog("Digite el Valor"));
            
            System.out.println(" "+valor);
        }
    }
    
    
}
