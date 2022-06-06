package com.company.model;

public class Order {

    private int id;
    private int customerId;
    private String ammount;
    private String orderAddress;
    private String orderDate;


    public Order(String atribute) {

        this.id=Integer.parseInt(atribute.split(",")[0]);
        this.customerId=Integer.parseInt(atribute.split(",")[1]);
        this.ammount=atribute.split(",")[2];
        this.orderAddress=atribute.split(",")[3];
        this.orderDate= atribute.split(",")[4];

    }

    public Order(int id, int customerId, String ammount, String orderAddress, String orderDate) {

        this.id=id;
        this.customerId=customerId;
        this.ammount=ammount;
        this.orderAddress=orderAddress;
        this.orderDate=orderDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAmmount() {
        return ammount;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString(){

        return "id: "+getId()+"\n"+
       "customerId: "+getCustomerId()+"\n"+
        "ammount: "+getAmmount()+"\n"+
      "orderAddress: "+getOrderAddress()+"\n"+
      "orderDate: "+getOrderDate()+"\n";
    }

    @Override
    public boolean equals(Object a){

        Order order=(Order) a;

        return (this.id==order.id && this.customerId==order.customerId);
    }

    public String formatToSave(){
        return this.getId()+","+this.getCustomerId()+","+this.getAmmount()+","+this.getOrderAddress()+","+this.getOrderDate();
    }


}
