package ArraysPrograms;

import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] a = {4567,80,100,10,20,30,40};

        //Sorting using arrays utility and finding second largest number
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a[a.length-2]);

        //Sorting manually and finding second largest number
        int[] b = {4567,80,100,10,20,30,40};
        int temp =0;
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                
                if(b[j]<b[i]) {
                      temp=b[i];
                      b[i]=b[j];
                      b[j]=temp;
                }

            }
            System.out.println(Arrays.toString(b));

                
                }
                System.out.println("Sorted arrays are "+Arrays.toString(b));
                System.out.println("Second largest number is "+b[b.length-2]);

            
}

}
