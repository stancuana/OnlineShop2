package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    public void toStringTest(){

        Product product=new Product(1,"phone","an fabricatie 2022","imagine",2000);

        System.out.println(product.toString());
    }

    @Test
    public void equalsTest(){

        Product product1=new Product(1,"phone","an fabricatie 2022","imagine",2000);
        Product product2=new Product(3,"hone","an fabricatie 2022","imagine",2000);

        System.out.println(product1.equals(product2));

    }

}