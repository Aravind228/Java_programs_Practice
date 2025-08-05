package stringPrograms;

public class VowelsDigitsspecialCharacters {

    public static void main(String[] args) {
        
        String str = "ARAVIND  haarika 2024 @ vihaarika";
        char[] characters = str.toCharArray();
        int smallcharacterscount = 0;
        int largecharacterscount = 0;
        int digitscount = 0;
        int specialcharacterscount = 0;

         for(char ch: characters) {
                if(Character.isUpperCase(ch)) {
                    System.out.println(ch);
                    largecharacterscount++;
                }
                else if(Character.isLowerCase(ch))  {
                    System.out.println(ch);
                    smallcharacterscount++;
                }
                else if(Character.isDigit(ch)) {
                    System.out.println(ch);
                    digitscount++;
                }
                else {
                    System.out.println(ch);
                    specialcharacterscount++;
                }

         }   

         int number = 16;

         if(number>=5 && number<=15) {
            System.out.println("Number is in range"+number);
         }
         else {
            System.out.println("Number is not in range"+number);
         }



//         for(int i=0;i<characters.length;i++) {
//             if(characters[i]>='a' && characters[i]<='z' ) {
//                 System.out.println(characters[i]);
//                 smallcharacterscount++;
//                 }
//            else if(characters[i]>='A' && characters[i]<='Z') {
//                 System.out.println(characters[i]);
//                 largecharacterscount++;
//                 } 
//             else if(characters[i]>='0' && characters[i]<='9') {
//                 System.out.println(characters[i]);
//                 digitscount++;
//                 } 
//             else {
//                 System.out.println(characters[i]);
//                 specialcharacterscount++;
//                 }
//  }

    System.out.println("Upper case are"+largecharacterscount);
    System.out.println("lower case are"+smallcharacterscount);
    System.out.println("digits are"+digitscount);
    System.out.println("special characters are"+specialcharacterscount);






        
    }

}
