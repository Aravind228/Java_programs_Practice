package stringPrograms;

import java.util.Arrays;

public class reversethewordinsentence {

    public static void main(String[] args) {
        
        String original= "Cognizant is good company";
        
        StringBuilder finalstrngbuff = new StringBuilder();
        String[] strarry=original.split(" ");
        System.out.println(Arrays.toString(strarry));
        for(String s4: strarry) {
        StringBuilder strngbuff = new StringBuilder(s4);
        strngbuff.reverse();
        finalstrngbuff.append(strngbuff+" ");

        }
        System.out.println(finalstrngbuff);
    }

}
