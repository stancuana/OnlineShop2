package com.company.controller;

import com.company.model.Admin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllAdminTest {

    @Test
    public void loadAfisareTest(){

        ControllAdmin controllAdmin=new ControllAdmin();

        controllAdmin.afisare();
    }

    @Test
    public void nrElemLista(){

        ControllAdmin controllAdmin=new ControllAdmin();
        assertEquals(3,controllAdmin.nrElemLista());
    }

    @Test
    public void addAdminTest(){

        Admin admin=new Admin("3,anamaria@gmail.com,ndfjshf,Surdu Andrei,Str. Vasile Aron nr.3,074556545,manager,1000,str.Frunzei nr.4,20");
        ControllAdmin controllAdmin=new ControllAdmin();
        int nrInitialLista=controllAdmin.nrElemLista();
        controllAdmin.addAdmin(admin);
        assertEquals(nrInitialLista+1,controllAdmin.nrElemLista());
    }

    @Test
    public void pozByIdTest(){

        ControllAdmin controllAdmin=new ControllAdmin();
        assertEquals(0,controllAdmin.pozById(1));
    }

    @Test
    public void delete(){

        ControllAdmin controllAdmin=new ControllAdmin();
        int nrInitialLista=controllAdmin.nrElemLista();
        controllAdmin.delete(1);

        assertEquals(nrInitialLista-1,controllAdmin.nrElemLista());
    }

    @Test
    public void saveTest(){

        Admin admin=new Admin("4,anamaria@gmail.com,ndfjshf,Surdu Andrei,Str. Vasile Aron nr.3,074556545,manager,1000,str.Frunzei nr.4,20");
        ControllAdmin controllAdmin=new ControllAdmin();
        int nrInitialLista=controllAdmin.nrElemLista();
        controllAdmin.save();
        assertEquals(nrInitialLista+1,controllAdmin.nrElemLista());

    }
}