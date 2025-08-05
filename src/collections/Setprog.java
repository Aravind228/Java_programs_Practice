package collections;

import java.util.HashSet;

public class Setprog {


    public static void main(String[] args) {

        HashSet<String> str = new HashSet<String>();

        str.add("Apple");
        str.add("Mango");
        str.add("Apple");

        System.out.println(str.size());
        System.out.println(str);
boolean status=str.contains("Apple");
System.out.println(status);
str.remove("Mango");
System.out.println(str);
System.out.println(str);
str.clear();
System.out.println(str);

        


        
    }


}
