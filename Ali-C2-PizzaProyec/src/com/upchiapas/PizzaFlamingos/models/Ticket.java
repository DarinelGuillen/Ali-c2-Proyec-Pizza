package com.upchiapas.PizzaFlamingos.models;

public class Ticket extends Cliente{
    private int numOrden;
    private String ItemsPizza="";
    private float PriceTicket;

    //public Ticket(String nombre, String apellido, int numOrden,) {super(nombre, apellido);}


    public Ticket(){

    }
    public Ticket(String nombre, String apellido, int numOrden, String itemsPizza, float priceTicket) {
        super(nombre, apellido);
        this.numOrden = numOrden;
        ItemsPizza = itemsPizza;
        PriceTicket = priceTicket;
    }


    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public String getItemsPizza() {
        return ItemsPizza;
    }

    public void setItemsPizza(String itemsPizza) {
        ItemsPizza = itemsPizza;
    }

    public float getPriceTicket() {
        return PriceTicket;
    }

    public void setPriceTicket(float priceTicket) {
        PriceTicket = priceTicket;
    }

    @Override
    public String toString() {
        return super.toString() +"\nItems selecionados de Pizza=" + ItemsPizza +
                "\nnumero de Orden=" + numOrden +"\nPrecio Total=" + PriceTicket
                +"\n//////////////////////////////////////////////";
    }
}

