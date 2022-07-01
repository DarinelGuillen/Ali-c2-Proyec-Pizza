package com.upchiapas.PizzaFlamingos.models;

import java.util.*;

public class CatalagoTickets {
    Scanner T = new Scanner(System.in);
    byte SIZE;
    Queue<Ticket> ListaTickets = new LinkedList<Ticket>();
    ArrayList<Ticket> ArrayListTickets = new ArrayList<>();

    /*public boolean AddTicketsPredeterminados() {

        SIZE = (byte) ListaTickets.size();
        System.out.println("SIZE ListaTickets====== " + SIZE);

        Random random = new Random(System.nanoTime());
        ListaTickets.add(new Ticket("Pablin", "Perez", ((-2)*(random.nextInt())), "ETC.----", 240));
        ListaTickets.add(new Ticket("Recho", "Sanches", ((-2)*(random.nextInt())), "ETC.----", 230));
        ListaTickets.add(new Ticket("Scalett", "Ruri", ((-2)*(random.nextInt())), "ETC.----", 400));
        ListaTickets.add(new Ticket("Ruy", "Escobar", ((-2)*(random.nextInt())), "ETC.----", 500));
        ListaTickets.add(new Ticket("Vucho", "Gabacho ", ((-2)*(random.nextInt())), "ETC.----", 900));

        SIZE = (byte) ListaTickets.size();
        System.out.println("SIZE  ListaTickets 2  ====== " + SIZE);
        return true;

    }*/
    public boolean addNewTicket(String nombre, String apellido, int numOrden, String itemsPizza, float priceTicket){
        ListaTickets.add(new Ticket( nombre,  apellido,  numOrden, itemsPizza, priceTicket));
        ArrayListTickets.add(new Ticket(nombre,  apellido,  numOrden, itemsPizza, priceTicket));
        return true;
    }

    public boolean ReporteDeVentas(){
        Ticket aux=new Ticket();
        Ticket aux2=new Ticket();
        for(int i = 0; i<(ArrayListTickets.size()-1); i++){
            for(int j = 0; j<(ArrayListTickets.size()-1); j++){
                if(ArrayListTickets.get(j).getNumOrden()>(ArrayListTickets.get(j+1).getNumOrden())){
                    aux= ArrayListTickets.get(j); //aux se combierte en el numero actual
                    aux2=ArrayListTickets.get(j+1);
                    //ArrayListTickets.get(j) = ArrayListTickets.get(j+1);
                    ArrayListTickets.remove(j);
                    ArrayListTickets.add(j,aux2);
                    //numero actual agregamos el numero siguiente

                    ArrayListTickets.remove(j+1);
                    ArrayListTickets.add(j+1, aux) ;

                }
            }

        }

        return true;
    }
    public ArrayList<Ticket> ShowArrayListaTickets () {
        ReporteDeVentas();
        return ArrayListTickets; }


}
