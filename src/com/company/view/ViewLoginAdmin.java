package com.company.view;

import com.company.controller.ControllAdmin;
import com.company.controller.ControllOrder;
import com.company.controller.ControllProduct;

import java.util.Scanner;

public class ViewLoginAdmin {

    private Scanner scanner;
    private ControllOrder controllOrder;
    private ControllProduct controllProduct;
    private ControllAdmin controllAdmin;


    public ViewLoginAdmin(){

        scanner=new Scanner(System.in);
        controllOrder=new ControllOrder();
        controllProduct=new ControllProduct();
        controllAdmin=new ControllAdmin();

    }

    public void maniu(){

        System.out.println("Apasati tasta 1 pentru a va loga");


    }

    public void play(){

        boolean running=true;

        while(running==true){

            maniu();

            int alegere=Integer.parseInt(scanner.nextLine());

            switch (alegere){

                case 1:loginAdmin();
                    break;
                case 2:


            }
        }
    }

    public void loginAdmin(){

        System.out.println("Introduceti adresa de email: ");
        String email=scanner.nextLine();

        System.out.println("Introduceti parola: ");
        String password=scanner.nextLine();

        controllAdmin.login(email,password);
        System.out.println("V-ati logat cu succes!"+"\n");

    }
}
