package com.company.view;

import com.company.controller.ControllCustomer;
import com.company.controller.ControllOrder;
import com.company.controller.ControllProduct;

import java.util.Scanner;

public class ViewLoginCustomer {

    private Scanner scanner;
    private ControllOrder controllOrder;
    private ControllProduct controllProduct;
    private ControllCustomer controllCustomer;

    public ViewLoginCustomer(){

        scanner=new Scanner(System.in);
        controllOrder=new ControllOrder();
        controllProduct=new ControllProduct();
        controllCustomer=new ControllCustomer();
    }

    public void meniu(){

        System.out.println("Pentru a va loga apasati tasta 1");
        System.out.println("Pentru a va inregistra apasati tasta 2");


    }

    public void play(){

        boolean running=true;

        while(running==true){

            meniu();

            int alegere=Integer.parseInt(scanner.nextLine());

            switch (alegere){

                case 1: loginCustomer();
                break;

                default:
                    meniu();
            }
        }
    }

    public void loginCustomer(){

        System.out.println("Introduceti adresa de email: ");
        String email=scanner.nextLine();

        System.out.println("Introduceti parola: ");
        String password=scanner.nextLine();

        controllCustomer.login(email,password).toString();
        System.out.println("V-ati logat cu succes!"+"\n");

    }
}
