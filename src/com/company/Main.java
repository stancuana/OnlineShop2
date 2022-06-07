package com.company;

import com.company.controller.ControllAdmin;
import com.company.model.Admin;
import com.company.view.ViewLoginUser;

public class Main {

    public static void main(String[] args) {

        ControllAdmin controllAdmin=new ControllAdmin();
        Admin admin=new Admin("3,anamaria@gmail.com,ndfjshf,Surdu Andrei,Str. Vasile Aron nr.3,074556545,manager,1000,str.Frunzei nr.4,20");
        controllAdmin.addAdmin(admin);
        controllAdmin.save();
    }
}
