package controllers;
import models.Order;

import java.util.ArrayList;


public class OrderController {



    public  ArrayList<Order> order;

    public OrderController(){
        this.order=new ArrayList<>();
        this.load();
    }

    public void load(){
        Order order1= new Order(20, 12, 3, 1 );
        Order order2= new Order(20, 12, 3, 1 );
        Order order3= new Order(20, 12, 3, 1 );
        Order order4= new Order(20, 12, 3, 1 );
        Order order5= new Order(20, 12, 3, 1 );

        order.add(order1);
        order.add(order2);
        order.add(order3);
        order.add(order4);
        order.add(order5);

    }

    //todo: functie ce afiseaza

    public void afisareOrder(){
        for(int i=0; i< order.size();i++){
            System.out.println((order.get(i).afisareOrder()));
        }
    }

    public Order findOrderById(int id){
        for(int i=0; i<order.size();i++){
            if(order.get(i).getId()==id){
                return order.get(i);
            }

        }
        return  null;
    }

    public void eraseOrder(Order order){
        this.order.remove(order);
    }

    public void addOrder(Order order){
        this.order.add(order);
    }

    //todo: functie ce editeaza userId
    public Boolean editUserId(int userId, int newUserId){
        Order findOrderById= this.findOrderById(userId);
        if(findOrderById!=null){
            findOrderById.setUserId(newUserId);
            return  true;
        }
        return false;
    }


    //todo: functie ce editeaza masina ID

    public  Boolean editCarId(int userId, int carId){
        Order findOrderById = this.findOrderById(userId);
        if(findOrderById!=null){
            findOrderById.setMasinaId(carId);
            return  true;
        }
        return  false;
    }



    //todo: functie ce editeaza cantitatea

    public  Boolean editCantitatea(int userId, int cantitatea){
        Order findOrderById = this.findOrderById(userId);
        if(findOrderById != null){
            findOrderById.setCantitate(cantitatea);
            return true;
        }
        return false;
    }
}
