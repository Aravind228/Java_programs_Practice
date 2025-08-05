package ArraysPrograms;

import java.util.Arrays;

public class Removeduplicatesfromarray {

    public static void main(String[] args) {
        int[] numbers = {1,1,2,2,2,3,4,55,55,66,66,66,66};
        int[] unique = new int[numbers.length];
        int j=0;
        for(int i=0;i<numbers.length-1;i++) {
             
            if(numbers[i+1]!=numbers[i]) {
            unique[j] = numbers[i];
            j++;
            
            }
        }
        unique[j]=numbers[numbers.length-1];
        j++;
         System.out.println(Arrays.toString(unique));
         //To eliminaate last 0's
         for(int i=0;i<j;i++) {
            System.out.print(unique[i]+" ");
         

         }
    }
}