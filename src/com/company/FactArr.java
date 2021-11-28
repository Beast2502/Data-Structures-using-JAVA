package com.company;


import java.util.ArrayList;

import java.util.Scanner;

public class FactArr {


    static ArrayList<Integer> factorial(int n){
        System.out.println("Check fact");
        ArrayList<Integer> fact = new ArrayList<>();
        if(n<1) return fact;


        fact.add(1);
        for(int i=2 ;i<=n;i++){
            fact = multiply(fact,i);
        }

     return reverse(fact);
    }

    static ArrayList<Integer>multiply(ArrayList<Integer> oldFact , int n){
        ArrayList<Integer> newFact = new ArrayList<>();
        System.out.println("Check multiply");
        int carry =0;
        for(int i=0;i<oldFact.size();i++){
            int curVal = oldFact.get(i)*n + carry;
            int curDigit = curVal%10;
            carry = curVal/10;
            newFact.add(curDigit);
        }
        while(carry>0){
            int curDigit = carry%10;
            newFact.add(curDigit);
            carry=carry/10;
        }
        return newFact;
    }


    static ArrayList<Integer> reverse (ArrayList<Integer> arr){
        System.out.println("Check reverse");
        int n= arr.size();
        for(int i=0;i<n/2;i++){
            int t=arr.get(i);
            arr.set(i,arr.get(n-i-1));
            arr.set(n-i-1,t);
        }

        return arr;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the Number");
        int input =  sc.nextInt();
        ArrayList<Integer> result  =  factorial(input);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }


    }
}