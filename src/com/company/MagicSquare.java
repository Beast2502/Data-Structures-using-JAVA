package com.company;

import java.util.Scanner;

public class MagicSquare {
    static int checkSquare(int n, int arr[][]){
        int sum=0;
        int sum1=0;
        int sum2 =0;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i==j){
                    sum = sum +arr[i][j];
                }
                if(i==0){
                    sum1= sum1+arr[i][j];
                }
                if(j==0){
                    sum2 = sum2 +arr[i][j];
                }
            }
        }
        System.out.println("Diagonal "+sum);
        System.out.println("row"+sum1);
        System.out.println("Column"+sum2);
        return 1;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenghth");
        int n = sc.nextInt();
        int arr[][] = new int [n][n];
        System.out.println("Enter the Matrix");
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int result = checkSquare(n, arr);
    }
}
