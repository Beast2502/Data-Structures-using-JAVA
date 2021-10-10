package com.company;
import java.util.*;

public class Avg {

    static float averageHeight(int n , float [] a){
        float sum =0;

       for(int i =0; i<n ;i++){
           sum = sum+a[i];
       }
       return sum/n;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers of value would be ");
        int n = sc.nextInt();
        float a[] = new float[n];

        System.out.println("enteer the values ");
        for(int i =0;i<n ;i++){
            a[i] = Float.parseFloat(sc.next());

        }
        float avgHeight = averageHeight(n,a);
        System.out.println(avgHeight);

    }
}
