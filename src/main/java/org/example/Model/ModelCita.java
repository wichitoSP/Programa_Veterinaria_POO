package org.example.Model;

import java.util.Date;

public class ModelCita {
    private  int idCita;
    private Date fechaHora;
    private ModelMascota mascota;
    private  ModelDueño dueño;
    private  ModelVeterinario veterinario;
    private String motivo;

    public ModelCita(int idCita, Date fechaHora, ModelMascota mascota, ModelDueño dueño, ModelVeterinario veterinario, String motivo){
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.mascota = mascota;
        this.dueño = dueño;
        this.veterinario = veterinario;
        this.motivo = motivo;
        

    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public ModelMascota getMascota() {
        return mascota;
    }

    public void setMascota(ModelMascota mascota) {
        this.mascota = mascota;
    }

    public ModelDueño getDueño() {
        return dueño;
    }

    public void setDueño(ModelDueño dueño) {
        this.dueño = dueño;
    }

    public ModelVeterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(ModelVeterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }



}
