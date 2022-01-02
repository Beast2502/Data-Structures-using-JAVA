package com.company;

import java.util.Scanner;

public class LeftRotation {
    static int[] leftRotation(int n , int[] arr , int k){
        while(k!=0){
            rotate(arr);
            k--;
        }
        return arr;
    }

    static void rotate(int [] arr){
        int i=0,j=arr.length-1;
        int last = arr[0];
        while(i!=j){
            arr[i]=arr[i+1];
            i++;
        }
        arr[arr.length-1]=last;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int n= sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Values");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of Rotations");
        int k = sc.nextInt();

        int rotationArr[] = leftRotation(n,arr,k);
        for(int j:rotationArr){
            System.out.print(j+" ");
        }
    }
}
