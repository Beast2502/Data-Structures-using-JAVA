package com.company;

import java.util.Scanner;

public class MagicSquare {
    static String checkSquare(int n, int arr[][]){

        // diagonal check
        int sum1 =0, sum2 =0;
        for(int i=0;i<n;i++){
            sum1 += arr[i][i];
            sum2 += arr[i][n-1-i];
        }
        if(sum1 != sum2){
            return "False";
        }

        // row and columns check
        for(int i =0;i<n ;i++){
            int rowSum=0, colSum=0;
            for(int j=0;j<n;j++){
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            if(rowSum != colSum || colSum != sum1){
                return "False";
            }
        }
        return "True";
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

        String result = checkSquare(n, arr);
        System.out.print(result);
    }
}
