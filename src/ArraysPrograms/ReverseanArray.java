package ArraysPrograms;

import java.util.Arrays;

public class ReverseanArray {

     public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversedarray=new int[numbers.length];
        int j=0;
        for(int i=numbers.length-1;i>=0;i--) {
            reversedarray[j]= numbers[i];
            j++;
         }
        System.out.println("Actual array is "+Arrays.toString(numbers));
        System.out.println("Reversed array is "+Arrays.toString(reversedarray));
    
    
    }


}
