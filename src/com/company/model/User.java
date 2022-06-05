package com.company.model;

import java.util.Objects;

public class User {

    private int id;
    private String email;
    private String password;
    private String fullName;
    private String billingAddress;
    private String phone;


    public User(String atribute){

        this.id=Integer.parseInt(atribute.split(",")[0]);
        this.email=atribute.split(",")[1];
        this.password=atribute.split(",")[2];
        this.fullName=atribute.split(",")[3];
        this.billingAddress=atribute.split(",")[4];
        this.phone=atribute.split(",")[5];

    }

    public User(int id, String email, String password, String fullName, String billingAddress, String phone){

        this.id=id;
        this.email=email;
        this.fullName=fullName;
        this.billingAddress=billingAddress;
        this.phone=phone;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }



    public String getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {

        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        return "User: " +"\n"+
                "id: " + id +"\n"+
                "email: " + email + "\n" +
                "password: " + password + "\n" +
                "fullName: " + fullName + "\n" +
                "billingAddress: " + billingAddress + "\n" +
                "phone: " + phone + "\n";
    }

    @Override
    public boolean equals(Object a){
        User user= (User) a;
        return  (this.id== user.id && this.email.equals(user.email));

    }

    public String formatToSave(){
        return this.getId()+","+this.getEmail()+","+this.getPassword()+","+this.getFullName()+","+this.getBillingAddress()+","+this.getPhone();
    }
}
