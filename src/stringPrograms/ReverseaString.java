package stringPrograms;

public class ReverseaString {

    public static void main(String[] args) {
        String original = "Hello World";

        //using stringbuffer

        StringBuffer strngbuff = new StringBuffer(original);
        strngbuff.reverse();
        System.out.println("Using String buffer: "+strngbuff);

        //using strinbuilder 

        StringBuilder strngbuilder = new StringBuilder(original);
        strngbuilder.reverse();
        System.out.println("Using String builder: "+strngbuilder);


        //using without string builder and using character

        char[] characters=original.toCharArray();
        System.out.print("Using character array: ");
        for(int i =characters.length-1;i>=0;i--) {
            
            System.out.print(characters[i]);
        }

}


}
