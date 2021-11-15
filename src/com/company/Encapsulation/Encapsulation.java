package com.company.Encapsulation;
class Laptop{
    int ram;
    private int price;

    public void setPrice(int price){
        // is the user an admin
        boolean isAdmin = true;
        if(!isAdmin){
            System.out.println("You cannot set the price");
        }
        else{
            this.price= price;
            System.out.println("Price is changed "+ this.price);
        }

    }
}




public class Encapsulation {


    private void dowork(){
        System.out.println("Encapsulation do work");
    }

    public void doWork(){
        System.out.println("public check ");
    }

    public static void main(String[] args){
        Laptop l1 = new Laptop();
        l1.setPrice(25);


    }
}
