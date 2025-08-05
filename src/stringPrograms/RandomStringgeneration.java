package stringPrograms;

import java.util.Random;

public class RandomStringgeneration {

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextInt(100000,999999));
        //convert integer to string
        String d=String.valueOf(Math.random()).substring(2, 6);
        int i=25;
        System.out.println(i+" age");
        System.out.println(String.valueOf(23)+" age");
        System.out.println(d);        
        String str = "1000";
        System.out.println(str);
        //convert string to integer
        int strint = Integer.parseInt(str);
        System.out.println(strint);
        strint++;
        System.out.println(strint);
        String str2=Integer.toString(strint);
        System.out.println(str2);




    }
}
