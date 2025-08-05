package ArraysPrograms;

public class Palindromevalidation {

    public static void main(String[] args) {

        String s = "Madam";
        StringBuilder s2 = new StringBuilder();

        char[] characters = s.toCharArray();

        for (int i = characters.length-1; i >= 0; i--) {

            s2.append(characters[i]);

        }
        if (s.equalsIgnoreCase(s2.toString())) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("not a palindrome");
        }

    }

}
