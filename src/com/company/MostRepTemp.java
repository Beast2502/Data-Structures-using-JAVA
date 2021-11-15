package com.company;
import java.util.*;

public class MostRepTemp {

    static int mostRepeatedTemperature(int n , int a[]){
        int maxCounter = 0;
        int element=0;
        for (int i = 0; i <n ; i++) {
            int counter =1;
            for (int j = i+1; j <n; j++) {
                if(a[i]==a[j]){
                    counter++;
                }
            }
            if(maxCounter<counter){
                maxCounter=counter;
                element = a[i];
            }
        }
        System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCounter);
        return element;

    }
    public static void main(String args[]){



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int n= sc.nextInt();

        System.out.println("Enter the value in Array");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(sc.next());
        }

        int ans = mostRepeatedTemperature(n,a);
        System.out.println(ans);

    }
}
