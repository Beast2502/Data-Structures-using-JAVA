//package com.company;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ReduceArray {
//    static int[] remove(int arr,int larg, int secLarg,int diff , int n){
//        int newArr[] = new int[n-1];
//        for(int i=0;i<n;i++){
//           // arr
//        }
//
//
//        return newArr;
//    }
//
//
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the Length of the Array");
//        int n = sc.nextInt();
//
//        int arr[] = new int[n];
//        System.out.println("Enter the values in the Array");
//        for(int i=0;i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//
//        int diff =0;
//        while(n<=1){
//            Arrays.sort(arr);  //sort
//            diff=arr[n-1]-arr[n-2];  //differnce
//            arr = remove(arr,arr[n-1],arr[n-2],diff,n);//remove from the current and add diff
//
//
//            n--;
//
//        }
//        System.out.println(diff);
//
//
//    }
//}