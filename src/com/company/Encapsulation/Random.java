package com.company.Encapsulation;

import java.util.ArrayList;
import java.util.Scanner;


public class Random {
    static Boolean check(ArrayList<String> keywords , ArrayList<String> sentences){
        int count = 0;
        for(int i=0; i<2; i++){
            String keyword = keywords.get(i);
            String sentence = sentences.get(i);
            String []s = sentence.split(" ");
            for(String temp: s){
                if(temp.compareTo(keyword) == 0){
                  //  System.out.println("Matched");
                    count++;
                }

            }
            if(count == 2){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<String> keywords = new ArrayList<>();
        ArrayList<String> sentences = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the keywords");
        for(int i=0 ; i<2 ;i++){
            keywords.add(sc.nextLine());
        }
        System.out.println("Enter the sentences");
        for(int i=0 ; i<2 ;i++){
          sentences.add(sc.nextLine());
        }

        Boolean result =  check(keywords,sentences);
        System.out.println(result);

    }
}
