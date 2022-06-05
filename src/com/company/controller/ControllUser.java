package com.company.controller;

import com.company.model.Order;
import com.company.model.User;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllUser {

    private ArrayList<User> users;

    public ControllUser(){

        this.users=new ArrayList<>();

        load();
    }

    public void load() {

        try {

            File file=new File("C:\\mycode\\JavaBasics\\OOP\\mostenirea\\OnlineShop\\src\\com\\company\\resouces\\Users.txt");
            Scanner scanner=new Scanner(file);

            while(scanner.hasNextLine()) {

                String text = scanner.nextLine();
                User user = new User(text);

                users.add(user);
            }

        } catch (Exception a) {

            a.printStackTrace();
        }
    }

    public void addUser(User user){

        this.users.add(user);
    }

    public void afisare(){

        for(int i=0; i<users.size();i++){

            System.out.println(users.get(i).toString());
        }
    }

    public int pozById(int id){

        int poz=-1;

        for(int i=0; i<users.size();i++){

            if(users.get(i).getId()==id){

                poz=i;
            }
        }
        return poz;
    }

    public void delete(int id){

        int poz=pozById(id);

        if(poz!=-1){

            users.remove(poz);
        }
    }

    public String toSave(){
        String text="";
        for(User user:users){
            text+=user.formatToSave()+"\n";
        }
        return text;
    }

    public void save(){

        try{

            File file=new File("C:\\mycode\\JavaBasics\\OOP\\mostenirea\\OnlineShop\\src\\com\\company\\resouces\\Users.txt");

            FileWriter writer=new FileWriter(file);

            PrintWriter printWriter=new PrintWriter(writer);
            printWriter.print(this.toSave());

            printWriter.close();

        }catch (Exception x){

            x.printStackTrace();
        }
    }

    public int nextAvailableId(){


        if(users.size()>0){
            return users.get(users.size()-1).getId()+1;
        }

        return 0;
    }
}
