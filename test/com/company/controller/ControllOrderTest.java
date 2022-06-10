package com.company.controller;

import com.company.model.Admin;
import com.company.model.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllOrderTest {


    @Test
    public void loadAfisareTest(){

        ControllOrder controllOrder=new ControllOrder();

        controllOrder.afisare();
    }

    @Test
    public void nrElemLista(){

        ControllOrder controllOrder=new ControllOrder();
        assertEquals(controllOrder.nextAvailableId()-1,controllOrder.nrElemLista());
    }

    @Test
    public void addAdminTest(){

        Order order=new Order(1,2,"222","tygfwedfew","22/08/2022");
        ControllOrder controllOrder=new ControllOrder();
        int nrInitialLista=controllOrder.nrElemLista();
        controllOrder.addOrder(order);
        assertEquals(nrInitialLista+1,controllOrder.nrElemLista());
    }

    @Test
    public void pozByIdTest(){

        ControllOrder controllOrder=new ControllOrder();
        assertEquals(0,controllOrder.pozById(1));
    }

    @Test
    public void delete(){

        ControllOrder controllOrder=new ControllOrder();
        int nrInitialLista=controllOrder.nrElemLista();
        controllOrder.delete(1);

        assertEquals(nrInitialLista-1,controllOrder.nrElemLista());
    }

    @Test
    public void nextAvailableId(){

        ControllOrder controllOrder=new ControllOrder();
        assertEquals(controllOrder.nrElemLista()+1,controllOrder.nextAvailableId());
    }

}