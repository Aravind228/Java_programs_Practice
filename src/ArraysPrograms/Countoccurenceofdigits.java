package ArraysPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Countoccurenceofdigits {

    public static void main(String[] args) {
        int[] numbers = {1,1,1,2,2,3,3,3,4,4,4,4};

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int number: numbers) {
            if (!map.containsKey(number)) {
                map.put(number,1);
                
            }
            else {
                  map.put(number, map.get(number)+1);   
            }
        }
        System.out.println(map);

        //withoout using array

        int[] numbers2 = {4, 4,1, 1, 1, 2, 1, 3};


        int[] digitCounts = new int[10];

        
        for (int number : numbers2) {
            
                digitCounts[number]++;
                System.out.println("Digits count "+Arrays.toString(digitCounts));
                
                   
            }
        // Print the occurrences of each digit
        System.out.println("Digit occurrences (without using Map):");
        for (int i = 0; i < digitCounts.length; i++) {
            if (digitCounts[i] > 0) { // Only print digits that actually appeared
                System.out.println("Digit " + i + ": " + digitCounts[i] + " times");
            }
        }
       }

       

}
