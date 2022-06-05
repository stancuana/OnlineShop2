package com.company.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllAdminTest {

    @Test
    public void loadAfisareTest(){

        ControllAdmin controllAdmin=new ControllAdmin();

        controllAdmin.afisare();
    }
}