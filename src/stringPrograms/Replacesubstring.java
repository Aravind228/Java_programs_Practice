package stringPrograms;

public class Replacesubstring {

    public static void main(String[] args) {
        
        String str = "AravindandVishaka";
        String str2=str.substring(7,10);    
       // System.out.println(str2);
        String s2=str.replace(str.substring(7,10), "HaarikaVihaarika");
        System.out.println(s2);
        String s5="sachin";

        char ch=s5.charAt(0);

        System.out.println(ch);

        String s6 = "india is my country";

        String[] s7=s6.split(" ");   
        
        for(String s8: s7) {
           String s9=s8.replace(s8.substring(0, 1), s8.substring(0, 1).toUpperCase());
            System.out.println(s9);
        }
       String s87= s6.substring(1, 5);
        System.out.println(s87);

    }

}
