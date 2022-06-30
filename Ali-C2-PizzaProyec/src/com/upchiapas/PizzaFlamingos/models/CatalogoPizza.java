package com.upchiapas.PizzaFlamingos.models;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoPizza {

    //Arreglos de pizza

        Scanner T = new Scanner(System.in);
         ArrayList<Pizza> Catalago = new ArrayList<>();
        byte SIZE;

        public boolean AddCatalagoPredeterminados () {
            SIZE = (byte) Catalago.size();
            System.out.println("SIZE ====== "+SIZE);
            Catalago.add(new Pizza((byte) 1, "Hawaiana", (float) 120));
            Catalago.add(new Pizza((byte) 2, "Orillas de queso", (float) 230));
            Catalago.add(new Pizza((byte) 2, "Peperoni", (float) 130));
            Catalago.add(new Pizza((byte) 3, "4 quesos", (float) 200));
            Catalago.add(new Pizza((byte) 4, "Mexicana", (float) 100));
            Catalago.add(new Pizza((byte) 5, "Chiken Hawaiana", (float) 300));
            SIZE= (byte) Catalago.size();
            System.out.println("SIZE 2  ====== "+SIZE);
            return true;

        }
        public boolean AddNewPizzaMenu (byte id, String NombrePizza, float Precio) {
            Catalago.add(new Pizza(id, NombrePizza,Precio));
            return true;

        }
        public ArrayList<Pizza> ShowCatalagoPizza () {
            ArrayList<Pizza> pizza = new ArrayList<>();
            for (int i = 0; i < Catalago.size(); i++) {
                //System.out.println("" + Catalago.get(i));
                //return Catalago.get(i);
            }
            return Catalago;
        }

}
