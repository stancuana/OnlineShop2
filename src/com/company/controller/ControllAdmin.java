package com.company.controller;

import com.company.model.Admin;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllAdmin {

    private ArrayList<Admin> admins;

    public ControllAdmin(){

        this.admins=new ArrayList<>();

        load();
    }

    public void load(){

        try{

            File file=new File("C:\\mycode\\JavaBasics\\OOP\\mostenirea\\OnlineShop\\src\\com\\company\\resouces\\Admins.txt");
            Scanner scanner=new Scanner(file);

            while(scanner.hasNextLine()){

                String text=scanner.nextLine();
                Admin admin=new Admin(text);

                this.admins.add(admin);
            }

        }catch (Exception a){

            a.printStackTrace();
        }
    }

    public void afisare(){

        for(int i=0; i<admins.size();i++){

            System.out.println(admins.get(i).toString());
        }
    }


}
