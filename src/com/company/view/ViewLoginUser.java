package com.company.view;

import com.company.controller.ControllOrder;
import com.company.controller.ControllProduct;

import java.util.Scanner;

public class ViewLoginUser {

    private Scanner scanner;
    private ControllOrder controllOrder;
    private ControllProduct controllProduct;
    private ViewLoginCustomer viewCustomer;
    private ViewLoginAdmin viewLoginAdmin;

    public ViewLoginUser(){

        scanner=new Scanner(System.in);
        controllOrder=new ControllOrder();
        controllProduct=new ControllProduct();
        viewCustomer=new ViewLoginCustomer();
        viewLoginAdmin=new ViewLoginAdmin();
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

                case 1:viewCustomer.play();
                break;
                case 2:viewLoginAdmin.play();
                break;


            }
        }
    }


}
