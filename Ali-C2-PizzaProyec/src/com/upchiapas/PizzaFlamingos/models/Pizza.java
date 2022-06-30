package com.upchiapas.PizzaFlamingos.models;

public class Pizza {
    //Onjeto de pizza
    private byte id;
    private String especialidad;
    private float precio;
            //Costructor
    public Pizza(byte id, String especialidad, float precio) {
        this.id = id;
        this.especialidad = especialidad;
        this.precio = precio;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "  \n" +"id=" + id + " = especialidad='" + especialidad + '\'' + ", precio=" + precio;
    }
}
