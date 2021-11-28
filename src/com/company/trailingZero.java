package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class trailingZero {

    static ArrayList<Integer>multiply(ArrayList<Integer> oldFact , int n){
        ArrayList<Integer> newFact = new ArrayList<>();
     //   System.out.println("Check multiply");
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
    static int factorial(int n){
        //System.out.println("Check fact");
        ArrayList<Integer> fact = new ArrayList<>();
        if(n<1) return n;


        fact.add(1);
        for(int i=2 ;i<=n;i++){
            fact = multiply(fact,i);
        }
        int result = countZero(fact);


        return result;
    }

    static int countZero (ArrayList<Integer> factArr){
        int count=0;
        for(int i=0;i< factArr.size();i++){
            if(factArr.get(i)==0){
                count ++;
            }
            else
            {
                return count;
            }
        }
        return count;
    }






    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the Number");
        int input =  sc.nextInt();
        int result = factorial(input);

        System.out.println(result);

    }
}
