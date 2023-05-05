package Lb13;

import java.time.LocalTime;


public class N1 {
    public static void main(String[] args) throws IllegalArgumentException{
        Thread t1 = new Thread(() -> {
            for (int i= 0; i<10; i++){
                System.out.println(Thread.currentThread().getName() +": " + LocalTime.now());
                try {
                    Thread.sleep(1000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++){
                System.out.println(Thread.currentThread().getName() + ": " +  LocalTime.now());
                try {
                    Thread.sleep(1000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });


        t1.start();
        t2.start();


    }
}
