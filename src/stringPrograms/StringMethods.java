package stringPrograms;

public class StringMethods {


    public static void main(String[] args) {
        
        String s1="Cognizant ";

        s1.length();
        System.out.println(s1.length());
        s1.charAt(0);
        System.out.println(s1.charAt(0));
        s1.substring(2);
        System.out.println(s1.substring(2));
        s1.substring(2,5);
        System.out.println(s1.substring(2,5));
        s1.toUpperCase();
        System.out.println(s1.toUpperCase());
        s1.toLowerCase();
        System.out.println(s1.toLowerCase());   
        s1.trim();
        System.out.println(s1.trim());

        //convert character array into string

        char[] ch = {'a','p','p','l','e','i','s','f','u','l'};

        String str = new String(ch);
        System.out.println(str);

        

        
    }

}
