package com.company.controller;

import com.company.model.Order;
import com.company.model.Product;
import com.company.model.User;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllProduct {

    private ArrayList<Product> products;

    public ControllProduct(){

        this.products=new ArrayList<>();

        load();
    }

    public void load() {

        try {

            File file=new File("C:\\mycode\\JavaBasics\\OOP\\mostenirea\\OnlineShop\\src\\com\\company\\resouces\\Products.txt");
            Scanner scanner=new Scanner(file);

            while(scanner.hasNextLine()) {

                String text = scanner.nextLine();
                Product product = new Product(text);

                products.add(product);
            }

        } catch (Exception a) {

            a.printStackTrace();
        }
    }

    public void addUser(Product product){

        this.products.add(product);
    }

    public void afisare(){

        for(int i=0; i<products.size();i++){

            System.out.println(products.get(i).toString());
        }
    }

    public int pozById(int id){

        int poz=-1;

        for(int i=0; i<products.size();i++){

            if(products.get(i).getId()==id){

                poz=i;
            }
        }
        return poz;
    }

    public void delete(int id){

        int poz=pozById(id);

        if(poz!=-1){

            products.remove(poz);
        }
    }

    public String toSave(){
        String text="";
        for(Product product:products){
            text+=product.formatToSave()+"\n";
        }
        return text;
    }

    public void save(){

        try{

            File file=new File("C:\\mycode\\JavaBasics\\OOP\\mostenirea\\OnlineShop\\src\\com\\company\\resouces\\Products.txt");

            FileWriter writer=new FileWriter(file);

            PrintWriter printWriter=new PrintWriter(writer);
            printWriter.print(this.toSave());

            printWriter.close();

        }catch (Exception x){

            x.printStackTrace();
        }
    }

    public int nextAvailableId(){
        if(products.size()>0){
            return products.get(products.size()-1).getId()+1;
        }
        return 0;
    }
}
