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
public class Ciudadano {

    int edad=0, experiencia=0;
    String nombre="";

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
