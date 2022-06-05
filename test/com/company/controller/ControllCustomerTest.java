package com.company.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllCustomerTest {

    @Test
    public void loadAfisareTest(){

        ControllCustomer controllCustomer=new ControllCustomer();
        controllCustomer.afisare();
    }

}