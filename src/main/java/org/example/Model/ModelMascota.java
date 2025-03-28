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

    public ModelMascota(int id, String nombre, String especie, String raza, Date fechaNacimiento, double peso, char sexo, ModelDueño dueño){
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.sexo = sexo;
        this.dueño = dueño;

        // Creamos los metodos Get y Set a nuesrtra calse
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public char getSexo() {
        return sexo;
    }

    public ModelDueño getDueño() {
        return dueño;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setDueño(ModelDueño dueño) {
        this.dueño = dueño;
    }
}
