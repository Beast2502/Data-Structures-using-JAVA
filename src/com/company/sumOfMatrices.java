package com.company;

import java.util.Scanner;

public class sumOfMatrices {

    static int[][] sum (int n , int m , int arr[][] , int arr2[][]){
        int sum[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum[i][j]= arr[i][j]+arr2[i][j];
            }
        }
        return sum;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row");
        int n = sc.nextInt();

        System.out.println("Enter the column");
        int m = sc.nextInt();

        System.out.println("Enter the value in the first matrix matrix");
        int arr [][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();

            }
        }

        System.out.println("Enetr the value in the Second matrix");
        int arr2[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j]=sc.nextInt();

            }
        }

        int sum[][] = sum(n,m ,arr , arr2);
        System.out.println("print the result matrix");
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(sum[i][j]);
            }
            System.out.println();
        }
    }
}
