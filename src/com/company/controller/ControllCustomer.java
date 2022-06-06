package com.company.controller;

import com.company.model.Customer;

import java.io.File;
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
}
