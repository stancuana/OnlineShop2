package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void descriereConstructorTest(){

        User user=new User(1,"anamaria@gmail.com","ndfjshf","Stancu Ana-Maria","Str. Lunga nr.3","074556545");
        User user1=new User(2,"stancuAna@gmail.com","nsnxasbanshf","Stancu Ana","Str. Lunga nr.3","074556545");
        assertEquals("User: \n" +
                "id: 1\n" +
                "email: anamaria@gmail.com\n" +
                "password: null\n" +
                "fullName: Stancu Ana-Maria\n" +
                "billingAddress: Str. Lunga nr.3\n" +
                "phone: 074556545\n",user.toString());

    }

    @Test
    public void metodaEqualsTest(){

        User user=new User(1,"anamaria@gmail.com","ndfjshf","Stancu Ana-Maria","Str. Lunga nr.3","074556545");
        User user1=new User(1,"anamaria@gmail.com","nsnxasbanshf","Stancu Ana","Str. Lunga nr.3","074556545");

        assertEquals(true,user.equals(user1));

    }

    @Test
    public void formatTosaveTest(){

        User user=new User("1,anamaria@gmail.com,ndfjshf,Stancu Ana-Maria,Str. Lunga nr.3,074556545");
        assertEquals("1,anamaria@gmail.com,ndfjshf,Stancu Ana-Maria,Str. Lunga nr.3,074556545",user.formatToSave());
    }

}