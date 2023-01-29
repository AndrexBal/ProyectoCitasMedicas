
package Proyecto1;

import java.util.ArrayList;
import java.util.List;


public class Cita {
    
    private Paciente paciente;
    private Medico medico;
    private String fecha;
    private String hora;
    private String motivo;
    private ArrayList<Cita> citas;

    public Cita(Paciente paciente, Medico medico, String fecha, String hora, String motivo) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }
    
    
    public void addCita(Paciente paciente, Medico medico, String fecha, String hora, String motivo){
        Cita cita = new Cita(paciente, medico, fecha, hora, motivo); 
        citas.add(cita);
}
}                     
