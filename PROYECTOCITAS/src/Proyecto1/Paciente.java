
package Proyecto1;

import java.util.List;


public class Paciente {
    
    private String nombre;
    private String direccion;
    private String telefono;

    public Paciente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
    
    public static void add(Paciente paciente, List<Paciente> pacientes){
        pacientes.add(paciente);
        
    }
}
