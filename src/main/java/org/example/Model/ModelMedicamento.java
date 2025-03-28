package org.example.Model;

public class ModelMedicamento {
    private int id;
    private String nombre;
    private String descripcion;
    private String dosis;
    private double precio;
    private int stock;

    public ModelMedicamento(int id,String nombre, String descripcion, String dosis, double precio,int stock){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dosis = dosis;
        this.precio = precio;
        this.stock = stock;



    }

}
