package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    public void toStringTest(){

        Customer customer=new Customer(1,"anamaria@gmail.com","ndfjshf","Stancu Ana-Maria","Str. Lunga nr.3","074556545","Str.Lunga nr.3","ramburs","lei","10.05.2022");

        assertEquals("User: \n" +
                "id: 1\n" +
                "email: anamaria@gmail.com\n" +
                "password: null\n" +
                "fullName: Stancu Ana-Maria\n" +
                "billingAddress: Str. Lunga nr.3\n" +
                "phone: 074556545\n" +
                "delivery address: Str.Lunga nr.3\n" +
                "payment method: ramburs\n" +
                "currency: lei\n" +
                "delivery date: 10.05.2022\n",customer.toString());
    }

    @Test
    public void equalsTest(){

        Customer customer1=new Customer(3,"anamaria@gmail.com","ndfjshf","Stancu Ana-Maria","Str. Lunga nr.3","074556545","Str.Lunga nr.3","ramburs","lei","10.05.2022");
        Customer customer2=new Customer(1,"anamaria@gmail.com","ndfjshf","Stancu Ana-Maria","Str. Lunga nr.3","074556545","Str.Lunga nr.3","ramburs","lei","10.05.2022");

        assertEquals(false,customer1.equals(customer2));
    }

    @Test
    public void formatToSave(){

        Customer customer2=new Customer(1,"anamaria@gmail.com","ndfjshf","Stancu Ana-Maria","Str. Lunga nr.3","074556545","Str.Lunga nr.3","ramburs","lei","10.05.2022");

        assertEquals("1,anamaria@gmail.com,null,Stancu Ana-Maria,Str. Lunga nr.3,074556545Str.Lunga nr.3,ramburs,lei,10.05.2022",customer2.formatToSave());
    }

}