package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class factString {
    static int[] largeFactorial(int n){
        return null;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        int ans[] = largeFactorial(n);
        for(int j: ans){
            System.out.println(j);
        }
    }
}
