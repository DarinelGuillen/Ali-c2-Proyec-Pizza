package com.upchiapas.PizzaFlamingos.models;

import com.upchiapas.PizzaFlamingos.Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Pizzeria {
    byte SIZE = 0;
    Scanner T=new Scanner(System.in);
    CatalogoPizza Cat=new CatalogoPizza();
    byte opc=0;
 public void MuestraMenu(){
     Cat.AddCatalagoPredeterminados();
        do {
            System.out.println("Hey there Insert a number ");
            System.out.println("1.Mostrar catalago ");
            System.out.println("2.Agregar Pizza nueva");
            System.out.println("3. Levantar orden");

            System.out.println("10. Salir");
             opc= T.nextByte();
            switch (opc) {
                case 1:
                    //Catalago provisional agregado previamente
                    System.out.println(Cat.ShowCatalagoPizza());
                    break;
                case 2:
                    System.out.println("Usted esta por agregar un nueva pizza");
                    byte  id = (byte) (1+ Cat.Catalago.size());
                    System.out.println("Ingrese el nombre de la Pizza nueva");
                    String Delete=T.nextLine();
                    String NombrePizza = T.nextLine();
                    System.out.println("Ingrese el precio de la Pizza");
                    float Precio = T.nextFloat();
                    Cat.AddNewPizzaMenu(id,NombrePizza,Precio);
                    SIZE= (byte) Cat.Catalago.size();
                    System.out.println("AddNewPizzaMenu== "+ SIZE);
                    break;
                case 3:
                    int opc1=0;
                    do {


                        System.out.println("Usted levatara una orden");
                        System.out.println(Cat.ShowCatalagoPizza());
                        System.out.println("(666) finalizar orden");
                        System.out.println("Selecione alguna Id de alguna pizza");
                        opc1=T.nextInt();




                    }while(!(opc1 ==666));
                    System.out.println("Orden exitosa");
                    break;
                case 10:
                    System.out.println("Salida exitosa");
                    break;
            }
        }while(opc<=10);



 }
 }



