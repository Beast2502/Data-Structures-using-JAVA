package com.company;
import java.util.Scanner;

public class CyclicRotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Values ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotations");
        int k = sc.nextInt();

        int rotatedArr[] = cyclicRotation(n, arr, k);

        for (int j : rotatedArr)
            System.out.print(j + " ");

    }

    static void rotate(int [] arr)
    {
        int i = 0, j = arr.length - 1;
        while(i != j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }
    static int[] cyclicRotation(int n, int[] arr, int k){
        while(k!=0){
            rotate(arr);
            k--;
        }
        return arr;
    }
}
