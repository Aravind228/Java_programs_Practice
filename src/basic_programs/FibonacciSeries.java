package basic_programs;

public class FibonacciSeries {

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int temp;

        for(int i=0;a<100;i++){
            System.out.print(a+" ");
            temp=a+b;
            a=b;
            b=temp;
        }
    }

}
