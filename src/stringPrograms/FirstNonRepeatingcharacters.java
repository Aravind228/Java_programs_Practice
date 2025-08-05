package stringPrograms;


import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingcharacters {

    public static void main(String[] args) {
        String word = "sswwiee";
        char[] characters=word.toCharArray();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char ch: characters) {
            if(!map.containsKey(ch)) {
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
            }
            System.out.println(map);
            for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            if(entry.getValue()==1) {
                System.out.println(entry.getKey());
                break;
            }

            //Just added one line

           }


           

           
    }

}
