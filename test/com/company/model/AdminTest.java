package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    @Test
    public void descriereConstructorTest(){

        Admin admin=new Admin("1,anamaria@gmail.com,ndfjshf,Stancu Ana-Maria,Str. Lunga nr.3,074556545,manager,1000,str.Frunzei nr.4,20");

        assertEquals("User: \n" +
                "id: 1\n" +
                "email: anamaria@gmail.com\n" +
                "password: ndfjshf\n" +
                "fullName: Stancu Ana-Maria\n" +
                "billingAddress: Str. Lunga nr.3\n" +
                "phone: 074556545\n" +
                "position: manager\n" +
                "salary: 1000\n" +
                "building address: str.Frunzei nr.4\n" +
                "number of employees: manager\n",admin.toString());

    }

    @Test
    public void metodaEqualsTest(){

        Admin admin1=new Admin("1,anamaria@gmail.com,ndfjshf,Stancu Ana-Maria,Str. Lunga nr.3,074556545,manager,1000,str.Frunzei nr.4,20");
        Admin admin2=new Admin("2,anamaria@gmail.com,ndfjshf,Stancu Ana-Maria,Str. Lunga nr.3,074556545,manager,1000,str.Frunzei nr.4,20");

        assertEquals(false,admin1.equals(admin2));

    }

    @Test
    public void formatTosaveTest(){

       Admin admin=new Admin(1,"anamaria@gmail.com","ndfjshf","Stancu Ana-Maria","Str. Lunga nr.3","074556545","manager",3000,"hhhh",200);
        assertEquals("1,anamaria@gmail.com,null,Stancu Ana-Maria,Str. Lunga nr.3,074556545manager,3000,hhhh,200",admin.formatToSave());
    }

}