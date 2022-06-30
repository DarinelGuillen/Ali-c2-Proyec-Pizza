package com.upchiapas.PizzaFlamingos.models;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class CatalagoTickets {
    Scanner T = new Scanner(System.in);
    byte SIZE;
    Queue<Ticket> ListaTickets = new LinkedList<Ticket>();

    public boolean AddTicketsPredeterminados() {

        SIZE = (byte) ListaTickets.size();
        System.out.println("SIZE ListaTickets====== " + SIZE);

        Random random = new Random(System.nanoTime());


        ListaTickets.add(new Ticket("Pablin", "Perez", random.nextInt(), "ETC.----", 240));
        ListaTickets.add(new Ticket("Recho", "Sanches", random.nextInt(), "ETC.----", 230));
        ListaTickets.add(new Ticket("Scalett", "Ruri", random.nextInt(), "ETC.----", 400));
        ListaTickets.add(new Ticket("Ruy", "Escobar", random.nextInt(), "ETC.----", 500));
        ListaTickets.add(new Ticket("Vucho", "Gabacho ", random.nextInt(), "ETC.----", 900));

        SIZE = (byte) ListaTickets.size();
        System.out.println("SIZE  ListaTickets 2  ====== " + SIZE);
        return true;

    }

    /*public boolean showTicketsList(){

        return null;
    }*/

}
