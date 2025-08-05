package stringPrograms;

import java.util.HashSet;

public class RemoveDuplicateCharacters {

    
    public static void main(String[] args) {

    String str= "Programming";

    HashSet<Character> set = new HashSet<Character>();

    //StringBuffer str2 = new StringBuffer(str);

    char[] ch=str.toCharArray();

    for(char c: ch) {
        if(!set.contains(c)) {
            set.add(c);
            System.out.print(c);
        }
        }
    }

        

    



}
