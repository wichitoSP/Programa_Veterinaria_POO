package org.example.Model;

public class ModelMedicamento {
    private int id;
    private String nombre;
    private String descripcion;
    private String dosis;
    private double precio;
    private int stock;

    public ModelMedicamento(int id, String nombre, String descripcion, String dosis, double precio, int stock){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dosis = dosis;
        this.precio = precio;
        this.stock = stock;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }



}
