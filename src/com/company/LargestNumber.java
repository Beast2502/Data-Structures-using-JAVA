package com.company;
import java.sql.PseudoColumnUsage;
import java.util.*;

public class LargestNumber {

    static float findLargestNo(float a , float b , float c){
                if(a>b && a >c){
                    return a ;
                }
                if(b>c && b>a){
                    return b;
                }
                if(c>a && c>b){
                    return c;
                }
                return 0;
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        float a = sc.nextFloat();
        System.out.println("Enter Second Number");
        float b = sc.nextFloat();
        System.out.println("Enter Third Number");
        float c = sc.nextFloat();
        float result = findLargestNo(a,b,c);

        if(result - (int)result == 0){
            System.out.println((int) result);
        }
        else{
            System.out.println(result);
        }

    }
}
