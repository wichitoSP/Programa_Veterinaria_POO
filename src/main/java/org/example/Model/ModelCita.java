package org.example.Model;

import java.util.Date;

public class ModelCita {
    private  int idCita;
    private Date fechaHora;
    private ModelMascota mascota;
    private  ModelDueño dueño;
    private  ModelVeterinario veterinario;
    private String motivo;

    public ModelCita(int idCita,Date fechaHora,ModelMascota mascota,ModelDueño dueño, ModelVeterinario veterinario,String motivo){
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.mascota = mascota;
        this.dueño = dueño;
        this.veterinario = veterinario;
        this.motivo = motivo;


    }

}
