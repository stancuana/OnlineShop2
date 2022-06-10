package com.company;

import com.company.controller.ControllAdmin;
import com.company.model.Admin;
import com.company.view.ViewLoginUser;

public class Main {

    public static void main(String[] args) {

        Admin admin=new Admin(4,"anamaria@gmail.com","ndfjshf","Surdu Andrei","Str. Vasile Aron nr.3","074556545","manager",1000,"str.Frunzei nr.4",20);
        ControllAdmin controllAdmin=new ControllAdmin();
        int nrInitialLista=controllAdmin.nrElemLista();
        controllAdmin.addAdmin(admin);
        controllAdmin.save();
    }
}
