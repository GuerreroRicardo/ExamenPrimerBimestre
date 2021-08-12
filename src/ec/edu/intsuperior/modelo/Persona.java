
package ec.edu.intsuperior.modelo;

import java.util.Date;
import javax.swing.JOptionPane;

public class Persona {
    private String nombre;
    private String edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public Persona(){
        JOptionPane.showMessageDialog(null, "Se ha creado un onjeto de la clase Persona");
    }
    
    public Persona(String nombre, String edad){
        this.edad=edad;
        this.nombre=nombre;
    }
}