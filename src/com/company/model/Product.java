package com.company.model;

public class Product {

    private int id;
    private String name;
    private String description;
    private String image;
    private int stock;


    public Product(String atribute){

        this.id=Integer.parseInt(atribute.split(",")[0]);
        this.name=atribute.split(",")[1];
        this.description=atribute.split(",")[2];
        this.image=atribute.split(",")[3];
        this.stock=Integer.parseInt(atribute.split(",")[4]);

    }

    public Product(int id, String name, String description, String image, int stock){

        this.id=id;
        this.name=name;
        this.description=description;
        this.image=image;
        this.stock=stock;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    @Override
    public String toString(){

        return "id: "+getId()+"\n"+
                "name: "+getId()+"\n"+
                "description: "+getId()+"\n"+
                "image: "+getId()+"\n"+
                "stock: "+getId()+"\n";
    }

    @Override
    public boolean equals(Object a){

        Product product=(Product) a;

        return (this.id==product.id || this.name.equals(product.name));
    }

    public String formatToSave(){
        return this.getId()+","+this.getName()+","+this.getDescription()+","+this.getImage()+","+this.getStock();
    }
}
