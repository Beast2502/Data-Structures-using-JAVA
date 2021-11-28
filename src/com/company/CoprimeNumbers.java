package com.company;
import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CoprimeNumbers {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = coprimeNumbers(n);

        System.out.println(result);

    }


    static int coprimeNumbers(int n) {
        ArrayList<Integer> check = new ArrayList<>();
        //factors
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                check.add(i);
                System.out.println(i);
            }
        }
        // Comparison
        for(int i=1;i<n;i++){
            for(int j=0 ; j<check.size();j++){

            }
        }


        return 0;
    }
}
