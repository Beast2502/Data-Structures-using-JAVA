package com.company;
import java.util.*;

public class MaxElemIndex {

    static  int findelement (int n, int [] arr , int x){
        for(int i =0;i<n;i++){
            if(x== arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number to find");
        int x = sc.nextInt();
        int result = findelement (n , arr , x);
        System.out.println(result);
    }
}
