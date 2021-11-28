package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class printOddNum {

    static ArrayList<Integer> oddNumbers(int n){
        ArrayList<Integer> oddList = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2 !=0){
                oddList.add(i);
            }
        }
        return oddList;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> result = oddNumbers(n);

        for(int j : result){
            System.out.println(j + " ");
        }

    }
}
