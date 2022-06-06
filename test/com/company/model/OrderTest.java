package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    public void toStringTest(){

        Order order=new Order(1,2,"222","tygfwedfew","22/08/2022");

        assertEquals("id: 1\n" +
                "customerId: 2\n" +
                "ammount: 222\n" +
                "orderAddress: tygfwedfew\n" +
                "orderDate: 22/08/2022\n",order.toString());
    }

    @Test
    public void equalsTest(){

        Order order1=new Order(1,2,"222","tygfwedfew","22/08/2022");
        Order order2=new Order(2,2,"4244","tygfwedfew","22/08/2022");

        assertEquals(false,order1.equals(order2));

    }

}