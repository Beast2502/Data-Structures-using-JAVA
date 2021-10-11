package com.company;
import java.util.*;

public class reverseInt {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        System.out.println(num);
        int reverse =0, remainder=0;
        while(num!=0){
         remainder = num%10;
         reverse = reverse*10 + remainder;
         num= num/10;
        }
        System.out.println(reverse);
    }
}
