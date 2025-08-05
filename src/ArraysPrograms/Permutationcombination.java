package ArraysPrograms;

import java.util.Arrays;

public class Permutationcombination {
   
   public static void main(String[] args) {
    
   
    char[] a ={'a','b','c','d'};

    String s = ""

    System.out.println("to string"+);

    for(char c:a) {
        System.out.print(c+" ");
    }
    System.out.println(" ");
    for(int j=a.length-1;j>=0;j--) {
         System.out.print(a[j]+" ");
    }
    System.out.println(" ");
    for(int k=0;k<a.length;k++) {
        for(int l=k+1;l<a.length;l++) {
            if(a[k]>a[l]) 
            {
                char temp=a[k];
                a[k]=a[l];
                a[l]=temp;
            }
        }
    }
        System.out.println(Arrays.toString(a));
        

}
    }
