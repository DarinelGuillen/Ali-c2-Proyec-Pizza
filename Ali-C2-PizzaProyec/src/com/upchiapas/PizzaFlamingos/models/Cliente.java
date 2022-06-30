package com.upchiapas.PizzaFlamingos.models;

public class Cliente {

    private String Nombre;
    private String Apellido;

    public Cliente(String nombre, String apellido) {
        this.Nombre = nombre;
        this.Apellido = apellido;
    }

    public Cliente() {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    @Override
    public String toString() {
        return "//////////////////////////////////////////////" +
                "Ticket de " +"Cliente \n" +
                "Nombre= '" + Nombre + '\'' +
                ", Apellido= '" + Apellido;
    }
}
