package com.company.model;

public class Customer extends User{

    private String deliveryAddress;
    private String paymentMethod;
    private String currency;
    private String deliveryDate;


    public Customer(String atribute){

        super(atribute);
        this.deliveryAddress=atribute.split(",")[6];
        this.paymentMethod=atribute.split(",")[7];
        this.currency=atribute.split(",")[8];
        this.deliveryDate=atribute.split(",")[9];
    }

    public Customer(int id, String email, String password, String fullName, String billingAddress, String phone,String deliveryAddress, String paymentMethod, String currency, String deliveryDate){

        super(id,email,password,fullName,billingAddress,phone);
        this.deliveryAddress=deliveryAddress;
        this.paymentMethod=paymentMethod;
        this.currency=currency;
        this.deliveryDate=deliveryDate;
    }


    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    @Override
    public String toString(){

        return super.toString()+
                "delivery address: "+this.getDeliveryAddress()+"\n"+
                "payment method: "+this.getPaymentMethod()+"\n"+
                "currency: "+this.getCurrency()+"\n"+
                "delivery date: "+this.getDeliveryDate()+"\n";
    }

    @Override
    public boolean equals(Object a){

       return super.equals(a);
    }

    @Override
    public String formatToSave(){

        return super.formatToSave()+this.getDeliveryAddress()+","+this.getPaymentMethod()+","+this.getCurrency()+","+this.getDeliveryDate();
    }
}
