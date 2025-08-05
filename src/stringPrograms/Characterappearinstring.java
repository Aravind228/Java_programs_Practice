package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class Characterappearinstring {

    public static void main(String[] args) {
        
    

    String str = "arun is an army person";
    String[] str2=str.split(" ");
    System.out.println("Remove space from string");    
    for(String s: str2) {
        if(!s.equalsIgnoreCase(" ")) {
                System.out.print(s);
        }
    }
    System.out.println(" ");
    System.out.println("Remove specified character from string a");

    String[] str3=str.split("a");
    System.out.println("Remove space from string");    
    for(String s: str3) {
        if(!s.equalsIgnoreCase("a")) {
                System.out.print(s);
        }
    }
//     for(int i=0;i<str.length();i++) {

//     if(str.charAt(i)!='a') {
//         System.out.print(str.charAt(i));
//  }

    //}
    System.out.println(" ");

    System.out.println("To upper and lower case");

    String upper=str.toUpperCase();
    String lower=str.toLowerCase();
    System.out.println(upper);
    System.out.println(lower);

    System.out.println("To upper and lower case");







//     for(int i=0;i<str.length();i++) {
      
//         if(str.charAt(i)=='r'){  count++;  }
        
// }
//     System.out.println(count);

    char[] characters =  str.toCharArray();

    HashMap<Character,Integer> map = new HashMap<Character,Integer>();

    for (char ch: characters) {

        if(!map.containsKey(ch)) {
            map.put(ch, 1);
        }
        else {
            map.put(ch,map.get(ch)+1);
        }
    }

    for(Map.Entry<Character,Integer> entry:map.entrySet()) {
        if(entry.getKey().equals('a')) {
            System.out.println(entry.getKey()+" "+entry.getValue());
    }
    // if(map.get()>2) { // This line causes a compilation error because map.get() requires a key argument.

    }




    

}

}