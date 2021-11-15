package com.company;

import java.util.Scanner;

public class leftMost {
    static int findElement(int n,int[] arr,int x){
        int leftMost =0;
        int count =0;
        int value=0;
        for(int i =0;i<arr.length;i++){
            // if(arr[i]== x){
            //     if(leftMost>=i){
            //         count++;
            //         leftMost=i;}
            //         }
            if(arr[i] == x){
                if(leftMost == x){
                    System.out.println(leftMost);
                    return leftMost;
                }else{
                    leftMost = arr[i];
                    System.out.println(leftMost);
                }
            }
        }
        // if(count ==0){
        return 1;
        // }
        //  return leftMost;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Numbers");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the Number to find");
        int x = sc.nextInt();
        int result = findElement(n,arr,x);
        System.out.println(result);
    }
}
