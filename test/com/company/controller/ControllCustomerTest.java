package com.company.controller;

import com.company.model.Admin;
import com.company.model.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllCustomerTest {

    @Test
    public void loadAfisareTest(){

        ControllCustomer controllCustomer=new ControllCustomer();
        controllCustomer.afisare();
    }

    @Test
    public void nrElemLista(){

        ControllCustomer controllCustomer=new ControllCustomer();
        assertEquals(1,controllCustomer.nrElemLista());
    }

    @Test
    public void addAdminTest(){

        Customer customer=new Customer("3,anamaria@gmail.com,ndfjshf,Surdu Andrei,Str. Vasile Aron nr.3,074556545,manager,1000,str.Frunzei nr.4,20");
        ControllCustomer controllCustomer=new ControllCustomer();
        int nrInitialLista=controllCustomer.nrElemLista();
        controllCustomer.addCustomer(customer);
        assertEquals(nrInitialLista+1,controllCustomer.nrElemLista());
    }

    @Test
    public void pozByIdTest(){

        ControllCustomer controllCustomer=new ControllCustomer();
        assertEquals(0,controllCustomer.pozById(1));
    }

    @Test
    public void delete(){

        ControllCustomer controllCustomer=new ControllCustomer();
        int nrInitialLista=controllCustomer.nrElemLista();
        controllCustomer.delete(1);

        assertEquals(nrInitialLista-1,controllCustomer.nrElemLista());
    }

    @Test
    public void nextAvailableId(){

        ControllCustomer controllCustomer=new ControllCustomer();
        assertEquals(controllCustomer.nrElemLista()+1,controllCustomer.nextAvailableId());
    }

}