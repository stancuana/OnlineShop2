package com.company.controller;

import com.company.model.Order;
import com.company.model.User;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllOrder {

    private ArrayList<Order> orders;

    public ControllOrder(){

        this.orders =new ArrayList<>();

        load();
    }

    public void load() {

        try {

            File file=new File("C:\\mycode\\JavaBasics\\OOP\\mostenirea\\OnlineShop\\src\\com\\company\\resouces\\Orders.txt");
            Scanner scanner=new Scanner(file);

            while(scanner.hasNextLine()) {

                String text = scanner.nextLine();
                Order order = new Order(text);

                orders.add(order);
            }

        } catch (Exception a) {

            a.printStackTrace();
        }
    }

    public void addOrder(Order order){

        this.orders.add(order);
    }

    public void afisare(){

        for(int i = 0; i< orders.size(); i++){

            System.out.println(orders.get(i).toString());
        }
    }

    public int pozById(int id){

        int poz=-1;

        for(int i = 0; i< orders.size(); i++){

            if(orders.get(i).getId()==id){

                poz=i;
            }
        }
        return poz;
    }

    public void delete(int id){

        int poz=pozById(id);

        if(poz!=-1){

            orders.remove(poz);
        }
    }

    public String toSave(){
        String text="";
        for(Order course:orders){
            text+=course.formatToSave()+"\n";
        }
        return text;
    }

    public void save(){

        try{

            File file=new File("C:\\mycode\\JavaBasics\\OOP\\mostenirea\\OnlineShop\\src\\com\\company\\resouces\\Orders.txt");

            FileWriter writer=new FileWriter(file);

            PrintWriter printWriter=new PrintWriter(writer);
            printWriter.print(this.toSave());

            printWriter.close();

        }catch (Exception x){

            x.printStackTrace();
        }
    }

    public int nextAvailableId(){


        if(orders.size()>0){
            return orders.get(orders.size()-1).getId()+1;
        }

        return 0;
    }

    public int nrElemLista(){

       int nrElem=0;
       return nrElem=orders.size();
    }
}
