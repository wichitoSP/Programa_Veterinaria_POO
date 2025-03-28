package org.example.Model;

public class ModelVeterinario {
    private int id;
    private String nombre;
    private String apellido;
    private String especialidad;
    private String telefono;
    private String horarioTrabajo;

    public  ModelVeterinario(int id, String nombre, String apellido,String especialidad,String telefono, String horarioTrabajo){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.horarioTrabajo = horarioTrabajo;


    }

}
