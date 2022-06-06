package com.company.view;

import com.company.controller.ControllAdmin;
import com.company.controller.ControllCustomer;
import com.company.controller.ControllOrder;
import com.company.controller.ControllProduct;

import java.util.Scanner;

public class ViewUser {

    private Scanner scanner;
    private ControllOrder controllOrder;
    private ControllProduct controllProduct;

    public ViewUser(){

        scanner=new Scanner(System.in);
        controllOrder=new ControllOrder();
        controllProduct=new ControllProduct();
    }

    public void maniu(){

        System.out.println("Daca sunteti client apasati tasta 1");
        System.out.println("Daca sunteti admin apasati tasta 2");

    }

    public void play(){

        boolean running=true;

        while(running==true){

            maniu();

            int alegere=Integer.parseInt(scanner.nextLine());

            switch (alegere){


            }
        }
    }

    public void alegereCilentSauAdmin(){

        
    }
}
