package com.company.model;

public class Admin extends User{

    private String position;
    private int salary;
    private String buildindAddress;
    private int nrOfEmployees;


    public Admin(String atribute){

        super(atribute);
        this.position=atribute.split(",")[6];
        this.salary=Integer.parseInt(atribute.split(",")[7]);
        this.buildindAddress=atribute.split(",")[8];
        this.nrOfEmployees=Integer.parseInt(atribute.split(",")[9]);
    }

    public Admin(int id, String email, String password, String fullName, String billingAddress, String phone,String position, int salary,String buildindAddress, int nrOfEmployees){

        super(id,email,password,fullName,billingAddress,phone);
        this.position=position;
        this.salary=salary;
        this.buildindAddress=buildindAddress;
        this.nrOfEmployees=nrOfEmployees;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getBuildindAddress() {
        return buildindAddress;
    }

    public void setBuildindAddress(String buildindAddress) {
        this.buildindAddress = buildindAddress;
    }

    public int getNrOfEmployees() {
        return nrOfEmployees;
    }

    public void setNrOfEmployees(int nrOfEmployees) {
        this.nrOfEmployees = nrOfEmployees;
    }


    @Override
    public String toString(){

        return super.toString()+
                "position: "+this.getPosition()+"\n"+
                "salary: "+this.getSalary()+"\n"+
                "building address: "+this.getBuildindAddress()+"\n"+
                "number of employees: "+this.getPosition()+"\n";
    }

    @Override
    public boolean equals(Object a){

          return  super.equals(a);
    }

    @Override
    public String formatToSave(){

        return super.formatToSave()+this.getPosition()+","+this.getSalary()+","+this.getBuildindAddress()+","+this.getNrOfEmployees();
    }
}
