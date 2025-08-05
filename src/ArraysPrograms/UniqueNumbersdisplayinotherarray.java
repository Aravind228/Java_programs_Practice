package ArraysPrograms;

public class UniqueNumbersdisplayinotherarray {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] numbers2 = {1, 2,4, 4, 5,6,7,8,9,10};
        int[] numbers3= new int[numbers.length];
        
        for(int i=0;i<numbers.length;i++) {
            for(int j=0;j<numbers2.length;j++) {
                if(numbers[i]==numbers2[j]) {
                    numbers3[i]=numbers2[j];
                    System.out.print(numbers3[i]+" ");
                }
        }

    }

}
}