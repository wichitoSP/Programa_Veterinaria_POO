package org.example.Model;

import java.util.Date;

public class ModelMascota {
    private int id;
    private  String nombre;
    private String especie;
    private String raza;
    private Date fechaNacimiento;
    private double peso;
    private char sexo;
    private ModelDueño dueño;

    // Creamos el constructor

    public ModelMascota(int id, String nombre,String especie, String raza,Date fechaNacimiento,double peso, char sexo,ModelDueño dueño){
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.sexo = sexo;
        this.dueño = dueño;
        

    }

}
