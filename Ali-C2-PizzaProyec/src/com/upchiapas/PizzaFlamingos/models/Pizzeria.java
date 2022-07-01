package com.upchiapas.PizzaFlamingos.models;

import java.util.Random;
import java.util.Scanner;

public class Pizzeria {
    byte SIZE = 0;
    int S=0;
    Scanner T=new Scanner(System.in);
    CatalogoPizza Cat=new CatalogoPizza();
    CatalagoTickets Tick =new CatalagoTickets();
    Random random = new Random(300);

    int opc=0;
    int opc1=0;

 public void MuestraMenu(){
     Cat.AddCatalagoPredeterminados();
     //Tick.AddTicketsPredeterminados();
     System.out.println("catalago predeterminado ");
     System.out.println("Tickets predeterminado agregados\n\n");

        do {
            System.out.println("Hey there Insert a number ");
            System.out.println("1.Mostrar catalago ");
            System.out.println("2.Agregar Pizza nueva");
            System.out.println("3. Levantar orden");
            System.out.println("4. Reportes de ventas diarias");

            System.out.println("10. Salir");
             opc= T.nextByte();

            switch (opc) {
                case 1:
                    //Catalago provisional agregado previamente
                    System.out.println(Cat.ShowCatalagoPizza());
                    System.out.println("Cat" + Cat.Catalago.size()+"   "+ Cat.Catalago.get(1).getId());
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
                    String SSS="";
                    if (Tick.ListaTickets.size()>=1){

                        System.out.println("Pedido anterior"+Tick.ListaTickets.poll());

                    }else{
                        System.out.println("////////////////////////////////\n");
                        System.out.println("Lista de pedidos esta Vacío");
                        System.out.println("\n////////////////////////////////");
                    }
                     opc1=0;
                     opc=0;
                    float priceTicket=0;
                    do  {
                        //Nesesito obtener las pizzas y hacelos un String para enviar
                        //solo una cadena concatenada de igual manera obtener price y acumular
                        System.out.println("Usted levatara una orden");
                        System.out.println(Cat.ShowCatalagoPizza());
                        System.out.println("(111) finalizar orden");
                        System.out.println("Selecione alguna Id de alguna pizza\n" +
                                " para agregar a la compra");

                        opc1=T.nextByte();
                        for (int l=0; l<Cat.Catalago.size(); l++){
                            if(opc1 == Cat.Catalago.get(l).getId()){
                                System.out.println(" price " +Cat.Catalago.get(l).getPrecio());
                                 priceTicket+=Cat.Catalago.get(l).getPrecio();
                                SSS += String.valueOf(Cat.Catalago.get(l));
                                System.out.println("Pizza agregada"+ SSS);
                            }
                        }
                        System.out.println("Precio de Orden  " + priceTicket);
                         S=opc1;
                    }while (opc1!=111);
                    System.out.println("----------------");
                    System.out.println("Orden exitosa");
                    System.out.println("-------------------");
                    System.out.println("Ingrese datos del usuario");
                    String Just=T.nextLine();
                    System.out.println("Nombre");
                    String nombre=T.nextLine();
                    System.out.println("Apellidos");
                    String apellido=T.nextLine();
                    int numero = (int)(Math.random()*(75-25+1)+25);
                    Tick.addNewTicket( nombre,  apellido, numero, SSS, priceTicket);

                    break;
                case 4:

                    System.out.println(Tick.ShowArrayListaTickets());
                    float PrecioTickes=0;
                    for (int v=0; v<Tick.ArrayListTickets.size();v++){
                        PrecioTickes +=Tick.ArrayListTickets.get(v).getPriceTicket();
                    }
                    System.out.println("Precio General Final = "+ PrecioTickes);
                    break;
                default:

            }

            if (opc==10){
                opc=1212;}
        }while(opc!=1212);


 }
 }



