package com.company.controller;

import com.company.model.Admin;
import com.company.model.Customer;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllCustomer {

    private ArrayList<Customer> customers;

    public ControllCustomer(){

        this.customers =new ArrayList<>();

        load();
    }

    public void load(){

        try{

            File file=new File("c:\\mycode\\JavaBasics\\OOP\\mostenirea\\OnlineShop\\src\\com\\company\\resouces\\Customer.txt");
            Scanner scanner=new Scanner(file);

            while(scanner.hasNextLine()){

                String text=scanner.nextLine();
                Customer customer=new Customer(text);

                this.customers.add(customer);
            }

        }catch (Exception a){

            a.printStackTrace();
        }
    }

    public void afisare(){

        for(int i = 0; i< customers.size(); i++){

            System.out.println(customers.get(i).toString());
        }
    }

    public Customer login(String email, String password){

        for(int i=0; i<customers.size();i++){

            if(customers.get(i).getEmail().equals(email) && customers.get(i).getPassword().equals(password)){

                return customers.get(i);

            }
        }
        return null;
    }

    public void addCustomer(Customer customer){

        this.customers.add(customer);
    }

    public int pozById(int id){

        int poz=-1;

        for(int i = 0; i< customers.size(); i++){

            if(customers.get(i).getId()==id){

                poz=i;
            }
        }
        return poz;
    }

    public void delete(int id){

        int poz=pozById(id);

        if(poz!=-1){

            customers.remove(poz);
        }
    }

    private String toSave(){
        String text="";
        for(Customer customer:customers){
            text+=customer.formatToSave()+"\n";
        }
        return text;
    }

    public void save(){

        try{

            File file=new File("C:\\mycode\\JavaBasics\\OOP\\mostenirea\\OnlineShop\\src\\com\\company\\resouces\\Admins.txt");

            FileWriter writer=new FileWriter(file);

            PrintWriter printWriter=new PrintWriter(writer);
            printWriter.print(this.toSave());

            printWriter.close();

        }catch (Exception x){

            x.printStackTrace();
        }
    }

    public int nextAvailableId(){


        if(customers.size()>0){
            return customers.get(customers.size()-1).getId()+1;
        }

        return 0;
    }

    public int nrElemLista(){

        return customers.size();
    }
}
