package basic_programs;

import java.util.Scanner;

public class Prime_number {

    public static void main(String[] args) {
        // Generate only prime numbers upto 100

        // System.out.println("2 is a prime number");
        // for (int i = 3; i <= 100; i++) {
        //     boolean status = false;
        //     for (int j = 2; j <= i / 2; j++) {

        //         // if(i==0 || i==1) {
        //         // System.out.println("Invalid input");
        //         // break;
        //         // }

        //         if (i % j == 0) {
        //             status = true;
        //             break;
        //         }
        //     }
        //     if (!status) {
        //         System.out.println(i + " is a prime number");
        //     }
        //     // status=false;}
        // }


        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=input/2;i++) {
            if(input%i==0) {
                flag=true;
                break;
            }
        }
        if(flag) {
            System.out.println("It is not a prime number");

        }
        else {
            System.out.println("It is a prime number");
        }
        sc.close();



    }

}
