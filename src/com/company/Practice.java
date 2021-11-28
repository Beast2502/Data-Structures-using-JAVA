package com.company;

import java.util.Scanner;

public class Practice {

    static String findSum(String str1, String str2){
        if(str2.length() > str2.length()){
            String temp = str1;
            str1 = str2;
            str2 = temp;

        }

        String str = "";
        // cal the length of the both String
        int n1 = str1.length();
        int n2 = str1.length();


        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();


        int carry = 0;
        for(int i= 0 ; i<n1;i++){
            int sum = ((int)(str1.charAt(i) - '0') +
                    (int)(str2.charAt(i)-'0')+ carry);
            str += (char)(sum % 10 + '0');

            // Calculate carry for next step
            carry = sum/10;
        }
        //add remaing digits of larger number
        for(int i =n1;i<n2;i++){
            int sum = ((int)str2.charAt(i)-'0') + carry;
            str += (char)(sum % 10 +'0');
            carry =sum /10;
        }

        // add remaining carry
        if(carry > 0)
            str += (char)(carry + '0');

        //reverse resultant string
        str = new StringBuilder(str).reverse().toString();

        return str;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        String ans = findSum(num1, num2);
        System.out.print(ans);
        System.out.println("check");
        
    }
}
