package ArraysPrograms;

public class ThreadProgram {

    public static void main(String[] args) {
        
        int maxcount = 10;

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 4; i <= 7; i++) {
                System.out.println(i);
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 8; i <= maxcount; i++) {
                System.out.println(i);
            }
        });

       try{
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start(); 
        t3.join();
       }
       catch(Exception e) {
        e.printStackTrace();
       }


 

}

}
