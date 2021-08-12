
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Persona;
import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Directivo;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Empresa;
import javax.swing.JOptionPane;


public class Aplicacion {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setEdad("18");
        p1.setNombre("Ricardo");
        
        Cliente c1 = new Cliente();
        c1.setTelefono("0980982062");
        
        Directivo d1 = new Directivo();
        d1.setCategoria("Empleado");
        
        Empresa em1 = new Empresa();
        em1.setNombreempresa("Samsung");
        System.out.println("Aqui los datos de la Persona");
        System.out.println("Nombre: " +p1.getNombre()+ "\n"
                + "Edad: "+ p1.getEdad()+ "\n"
                        + "Celular: "+ c1.getTelefono()+ "\n"
                                + "Cargo: "+d1.getCategoria()+ "\n"
                                        + "Nombre de la Empresa: "+ em1.getNombreempresa()+ "\n"
                                                + "Sueldo a Recibir: 400");
        
    }
}
