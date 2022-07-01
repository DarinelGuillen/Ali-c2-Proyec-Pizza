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
            Catalago.add(new Pizza((byte) 12, "Hawaiana", (float) 120));
            Catalago.add(new Pizza((byte) 23, "Orillas de queso", (float) 230));
            Catalago.add(new Pizza((byte) 34, "Peperoni", (float) 130));
            Catalago.add(new Pizza((byte) 45, "4 quesos", (float) 200));
            Catalago.add(new Pizza((byte) 56, "Mexicana", (float) 100));
            Catalago.add(new Pizza((byte) 67, "Chiken Hawaiana", (float) 300));
            SIZE= (byte) Catalago.size();
            System.out.println("SIZE 2  ====== "+SIZE);
            return true;

        }
        public boolean AddNewPizzaMenu (byte id, String NombrePizza, float Precio) {
            Catalago.add(new Pizza(id, NombrePizza,Precio));
            return true;

        }
        public ArrayList<Pizza> ShowCatalagoPizza () {
            return Catalago;
        }

}
