package com.company;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumOccurringCharProgram {
    static Object[]  mostFrequent(String inputString)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] charArray = inputString.replaceAll("\\s+", "").toCharArray();

        for (char c : charArray)
        {
            if (charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }

        Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();

        int maxCount = 0;

        char maxChar = 0;

        for (Entry<Character, Integer> entry : entrySet)
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();

                maxChar = entry.getKey();
            }
        }

        Object[] ans = new Object[2];
        ans[0]=maxChar;
        ans[1]=maxCount;


        return ans;
    }

    public static void main(String[] args)
    {
        Object[] ans = mostFrequent("aaaaAAAA");
        System.out.println(ans[0] + " " + ans[1]);


    }
}

