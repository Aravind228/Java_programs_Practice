package stringPrograms;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        String str1 = "adam";
        String str2 = "mada";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        

        if (str1.length() == str2.length()) {

        
            char[] characters =  str1.toCharArray();
            char[] characters2 =  str2.toCharArray();
    

            Arrays.sort(characters);
            Arrays.sort(characters2);

            System.out.println( characters);
            System.out.println( characters2);

           boolean status= Arrays.equals(characters, characters2);

        if(status) {
            System.out.println("Strings are anagrams");

        }
        else {
            System.out.println("Strings are not anagrams");
        }


            
            }

}      
       


    }


