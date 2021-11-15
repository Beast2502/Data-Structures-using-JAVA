package com.company;
import java.util.Scanner;
import java.math.BigInteger;

public class trailingZeros {

    static BigInteger factNum(int num){

        BigInteger fact = new BigInteger("1");
        for(int i=1 ;i<=num;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    static int findZero(int num){
        BigInteger fact = factNum(num);
       
        System.out.println(fact);
        String conv = String.valueOf(fact);
        char [] a = conv.toCharArray();
        int count =0;
        for(int i =0; i<conv.length();i++){
            if(a[i]== '0'){
                count++;
            }
        }

        return count;

    }

    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number");
       int num = sc.nextInt();
       int result = findZero(num);
       System.out.println(result);


    }
}
