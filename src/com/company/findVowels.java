package com.company;
import java.util.*;
public class findVowels {
    static int findCount(int count ,String string){
        string = string.toLowerCase(Locale.ROOT);
        for(int i=0; i<string.length();i++){
            if(string.charAt(i)== 'a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)== 'o' ||string.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the String ");
        String string = sc.nextLine();
        int result = findCount(count, string);
        System.out.println(result);
    }
}
