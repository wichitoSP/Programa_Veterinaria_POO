package org.example.Model;

import java.util.Date;

public class ModelConsulta {
    private  int idConsulta;
    private Date fecha;
    private  ModelMascota mascota;
    private  ModelVeterinario veterinario;
    private  String motivo;
    private String diagnostico;
    private String tratamiento;
    private  double costo;

    public ModelConsulta(int idConsulta, Date fecha, ModelMascota mascota, ModelVeterinario veterinario,String motivo,String diagnostico,String tratamiento,double costo){
        this.idConsulta = idConsulta;
        this.fecha = fecha;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.costo = costo;


    }

}
