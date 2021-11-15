package com.company;


class PersonPrac {
    String name;
    int age ;
    static int count =0;

    public PersonPrac(){
        count++;

    }

    public PersonPrac(int newAge , String newName){
        this();
        this.name = newName;
        this.age = newAge;
    }
    //Polymorphism
    void walk(){
        System.out.println(this.name + " is walking");
    }
    void walk(int steps){
        System.out.println(this.name+ " is waliking "+ steps);
    }
}

class DeveloperPrac extends PersonPrac{
    public DeveloperPrac(int age ,String name){
        super();
    }
    void walk(){
        System.out.println("Developer "+this.name + " is waking");
    }

}



public class inherit {
    public static void main(String args[]){
        PersonPrac p1 = new PersonPrac();
        p1.name="Check";


    }
}
