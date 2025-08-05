package ArraysPrograms;

public class MaximumandMinimum {
    public static void main(String[] args) {
    
        int[] numbers = {10, 5, 20, 8, 15};

        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int number : numbers) {

            if(number<minimum) {
                minimum = number;
            }
            else if(number>maximum) {
                    maximum=number;
            }
    
        }
        System.out.println("Maximum number is "+maximum);
        System.out.println("Minimum number is "+minimum);
    }

}
