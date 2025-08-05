package ArraysPrograms;

public class Movedigitsinarray {

       public static void main(String[] args) {
        int[] numbers = {1, 2, 3,4, 5, 6, 7, 8, 9};
        
        int[] newArray = new int[numbers.length];
        int start=0;
        
        for(int i=0;i<numbers.length-2;i++) {

            newArray[i+2] = numbers[i];
            start++;


        } 
         
        for(int j=0;j<2;j++) {
            newArray[j] = numbers[start];
            start++;            
            
        }
        
        System.out.println(newArray[0]+" "+newArray[1]+" "+newArray[2]+" "+newArray[3]+" "+newArray[4]+" "+newArray[5]+" "+newArray[6]+" "+newArray[7]+" "+newArray[8]);            


        }
       
    }



