package com.company;
import java.util.*;

public class PrintOddNumber {

    static ArrayList<Integer> oddNum (int n){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i =0; i<=n;i++){
            if(i%2 !=0){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        ArrayList<Integer> result = oddNum(n);
        System.out.println(result);
    }
}
