package com.company;
import java.lang.Math;
import java.util.*;

public class checkPrime {

    static boolean checkPrime(int n){
       if(n<=1){
           return false;
       }
       else if(n==2){
           return true;
       }
       else if(n%2 == 0){
           return false;
       }

       for(int i=3;i<=Math.sqrt(n);i+=2){
           if(n%i == 0){
               return false;
           }
       }
       return true;

    }

    static ArrayList<Boolean> printNum(int t , ArrayList<Integer> num){
        ArrayList<Boolean> data = new ArrayList<>();
        for(int i=0; i<t;i++){
            int n= num.get(i);
            data.add(checkPrime(n));
        }
        return data;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int t = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter the Array");
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            nums.add(n);
        }
        ArrayList<Boolean> ans = printNum(t,nums);

        for(boolean res: ans){
            System.out.println(res);
        }

    }
}
