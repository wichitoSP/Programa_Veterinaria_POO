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

    public ModelConsulta(int idConsulta, Date fecha, ModelMascota mascota, ModelVeterinario veterinario, String motivo, String diagnostico, String tratamiento, double costo){
        this.idConsulta = idConsulta;
        this.fecha = fecha;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.costo = costo;




    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ModelMascota getMascota() {
        return mascota;
    }

    public void setMascota(ModelMascota mascota) {
        this.mascota = mascota;
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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }



}
