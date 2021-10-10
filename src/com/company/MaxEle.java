package com.company;
import java.util.*;

public class MaxEle {

    static int findMax(int n,int a[]){
        int max =0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max= a[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array");
        int n = sc.nextInt();
        System.out.println("Enter the elements ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        int findMax = findMax(n,a);
        System.out.println(findMax);
    }
}
