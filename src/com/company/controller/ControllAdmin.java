package com.company.controller;

import com.company.model.Admin;
import com.company.model.Customer;
import com.company.model.Order;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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

    public void addAdmin(Admin admin){

        this.admins.add(admin);
    }

    public int pozById(int id){

        int poz=-1;

        for(int i = 0; i< admins.size(); i++){

            if(admins.get(i).getId()==id){

                poz=i;
            }
        }
        return poz;
    }

    public void delete(int id){

        int poz=pozById(id);

        if(poz!=-1){

            admins.remove(poz);
        }
    }

    private String toSave(){
        String text="";
        for(Admin admin:admins){
            text+=admin.formatToSave()+"\n";
        }
        return text;
    }

    public void save(){

        try{

            File file=new File("c:\\mycode\\JavaBasics\\OOP\\mostenirea\\OnlineShop\\src\\com\\company\\resouces\\Admins.txt");

            FileWriter writer=new FileWriter(file);

            PrintWriter printWriter=new PrintWriter(writer);
            printWriter.print(this.toSave());

            printWriter.close();

        }catch (Exception x){

            x.printStackTrace();
        }
    }

    public int nextAvailableId(){
        if(admins.size()>0){
            return admins.get(admins.size()-1).getId()+1;
        }
        return 0;
    }

    public Admin login(String email, String password){

        for(int i=0; i<admins.size();i++){
            if(admins.get(i).getEmail().equals(email) && admins.get(i).getPassword().equals(password)){
                return admins.get(i);
            }
        }
        return null;
    }

    public int nrElemLista(){

        return admins.size();
    }

}
