package ArraysPrograms;

public class Designinarray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for(int i=0;i<numbers.length;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(numbers[j]+" ");
            }System.out.println(" ");
            
        }

        for(int i=numbers.length-1;i>=0;i--) {
            for(int j=0;j<=i;j++) {
                System.out.print(numbers[j]+" ");
            }System.out.println(" ");
            
        }

        for(int i=numbers.length-1;i>=0;i--) {
            for(int j=0;j<=i;j++) {
                System.out.print(numbers[j]+" ");
            }System.out.println(" ");
            
        }

        

        
    }


}
