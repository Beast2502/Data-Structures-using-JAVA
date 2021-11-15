package com.company;

import com.company.Encapsulation.Encapsulation;

import java.util.Locale;

class Person{
    protected String name;
    int age;
    static int count = 0;

    public Person(){
        count++;
        System.out.println("Default Constructor Callinig \n");
    }
    public Person(int newAge , String newName){
        this();
        this.name = newName;
        this.age = newAge;

    }


    // Polymorphism
    //methods
    void walk(){
        System.out.println(name + " is walking");
    }

    void  walk(int steps){
        System.out.println(steps);
    }

    void  eat(){
        System.out.println(name +" is eating");
    }
}

class Developer extends Person{
    public Developer (int age , String name){
        super(age,name);
    }
    // Run time polymorphism
    void walk(){
        System.out.println("Developer "+ name + " is walking");
    }

}


public class OOPS1 {
    public static void main(String args[]){
        Person p1 = new Person();
        p1.name = "Mehul";
        p1.age= 66;

        System.out.println(p1.name + " " + p1.age);
        // Methods
        p1.eat();
        p1.walk();
        p1.walk(10);

        Person p2 = new Person();
        p2.name = "Ekanshi";
        p2.age=41;

        System.out.println(p2.name + " " + p2.age);
        //Methods
        p2.eat();
        p2.walk();
        p2.walk(20);

        //Static used for the those variables which are not dependent on the Objects
        System.out.println("Static value of the Class Count" + Person.count);


        Person p3 = new Person(31,"Mehul Saxena xyz");
        System.out.println(p3.name +" "+ p3.age);
        System.out.println("Count "+ Person.count);


        Developer d1 = new Developer(25, "Dev Mehul");
        System.out.println("Developer name "+d1.name + " age is"+d1.age);
        d1.walk();


        // Encapsulation
        Encapsulation obj = new Encapsulation();

    }
}
