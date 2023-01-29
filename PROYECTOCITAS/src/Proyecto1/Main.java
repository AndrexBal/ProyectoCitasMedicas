
package Proyecto1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();
        List<Cita> citas = new ArrayList<>();
        int opcion = 0;
        
        while(opcion !=5){
            System.out.println("\n1. Agregar paciente: ");
            System.out.println("2. Agregar medico: ");
            System.out.println("3. Agregar cita: ");
            System.out.println("4. Mostrar cita paciente o medico: ");
            System.out.println("5.salir");
            System.out.println("\nIngrese una opción");
            opcion = entrada.nextInt();
            
            switch(opcion){
                
                case 1: //Agregar
                    System.out.println("\nIngrese el nombre del paciente: ");
                    entrada.nextLine();
                    String nombre = entrada.nextLine();
                    System.out.println("Ingrese la dirección del paciente: ");
                    String direccion = entrada.nextLine();
                    System.out.println("Ingrese el telefono del paciente: ");
                    String telefono = entrada.nextLine();
                    //creamos el objeto 
                    pacientes.add(new Paciente(nombre, direccion, telefono));
                    System.out.println("Paciente agregado correctamente");
                    break;
                
                case 2://agregar medico
                    System.out.println("\nIngrese el nombre del medico: ");
                    entrada.nextLine();
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese el apellido del medico: ");
                    String apellido = entrada.nextLine();
                    System.out.println("Ingrese la especialidad del medico: ");
                    String especialidad = entrada.nextLine();
                    System.out.println("Ingrese el telefono del medico: ");
                    telefono = entrada.nextLine();
                    //creamos un objeto
                    medicos.add(new Medico(nombre, apellido, especialidad, telefono));
                    System.out.println("Medico agregado correctamente");
                    break;
                    
                case 3:
                    System.out.println("\nIngrese la fecha de la cita (dd/mm/yyyy): ");
                    entrada.nextLine();
                    String fecha = entrada.nextLine();
                    System.out.println("Ingrese la hora de la cita (HH:mm): ");
                    String hora = entrada.nextLine();
                    System.out.println("Ingrese el motivo de la cita : ");
                    String motivo = entrada.nextLine();
                    
                    
                    System.out.println("\nSeleccione un paciente");
                    //Mostrar la lista de pacientes y le pedimos al usuario que seleccione uno
                    for(int i=0; i<pacientes.size(); i++){
                        System.out.println((i+1)+". "+ pacientes.get(i).getNombre());
                    }
                    int pacienteSeleccionado = entrada.nextInt() -1;
                    
                    
                    //Mostrar la lista de medicos y le pedimos al usuario que seleccione uno
                    System.out.println("\n seleccione un medico: ");
                    for(int i=0; i<medicos.size(); i++){
                        System.out.println((i+1)+". "+ medicos.get(i).getNombre());
                    }
                    int medicoSeleccionado = entrada.nextInt();
                    
                    //creamos un objeto de tipo lista y lo agregamos a la lista dinamica
                    citas.add(new Cita(pacientes.get(pacienteSeleccionado), medicos.get(medicoSeleccionado), fecha, hora, motivo));
                    System.out.println("Cita agregada correctamente");
                    break;
                    
                case 4://mostrar citas de un paciente o medico
                    System.out.println("Ingrese el nombre del medico o paciente: ");
                    entrada.nextLine();
                    nombre = entrada.nextLine();
                    
                    boolean encontrado = false;
                    for(Cita cita: citas){
                        if(cita.getPaciente().getNombre().equals(nombre) || cita.getMedico().getNombre().equals(nombre)){
                            System.out.println("\nPaciente: "+cita.getPaciente().getNombre());
                            System.out.println("Medico: "+cita.getMedico().getNombre());
                            System.out.println("Fecha: "+cita.getFecha());
                            System.out.println("Hora: "+cita.getHora());
                            encontrado = true;
                        }
                    }
                    if(!encontrado)
                        System.out.println("No se ha encontra citas para el paciente o medico");
                    break;
                   
                    
                case 5: //salir
                    System.out.println("Hasta la proxima");
                    break;
                    
                default: 
                    System.out.println("Opción  no valida intente de nuevo");
                    
                    
                    
                    
            }
            
        }   
        
    }
    
}
